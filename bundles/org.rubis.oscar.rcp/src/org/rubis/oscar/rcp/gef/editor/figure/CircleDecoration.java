package org.rubis.oscar.rcp.gef.editor.figure;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

public class CircleDecoration extends Ellipse implements RotatableDecoration {
	
	private static final int RADIUS = 5;
	private Point location = new Point();
	
	public CircleDecoration() {
		super();
	}
	
	@Override
	public void setLocation(Point p) {
		location = p;
		Rectangle bounds = new Rectangle(location.x-RADIUS,location.y-RADIUS,2*RADIUS,2*RADIUS);
		setBounds(bounds);
	}
	
	@Override
	public void setReferencePoint(Point p) {
		// length of line betweend reference point and location
		double d = Math.sqrt(Math.pow((location.x-p.x), 2) + Math.pow((location.y-p.y),2));
		
		// do nothing if link is too short.
		if(d<RADIUS) return;
		
		
		// using pythagoras theorem, we have a triangle like this:
        //
        //      |       figure       |
        //      |                    |
        //      |_____(l.x,l.y)______|
        //                (\)
        //                | \(r.x,r.y)
        //                | |\
        //                | | \
        //                | |  \
        //                | |   \
        //                |_|(p.x,p.y)
        //
        // We want to find a point that at RADIUS distance from l (location) on the line between l and p
        // and center our circle at this point.
        //
        // I you remember your school math, let the distance between l and p (calculated
        // using pythagoras theorem) be defined as d. We want to find point r where the
        // distance between r and p is d-RADIUS (the same as saying that the distance
        // between l and r is RADIUS). We can do this using triangle identities.
        //     |px-rx|/|px-lx|=|py-ry|/|py-ly|=|d-RADIUS|/d
        //
        // we use
        //  k = |d-RADIUS|/d
        //  longx = |px-lx|
        //  longy = |py-xy|
        //
        // remember that d > RADIUS.
        // �ѱ���� -> Reference Point�� �ٸ� figure���� ��ũ�� ����� figure�� ���� ������, �ٸ� figure���� �׾����� ���� �ǹ���.
		//          �츮�� �ϰ�������� ��ũ�� ����� figure���� ��ũ�� ����Ǵ� �κп� ���׸� ���׶�̸� �׷��ִ°�.
		//          ��ũ�� ������ location, ��ũ�� �ܺζ� ����� Reference Point �� �˸�
		//          location�� ������ Radius��ŭ �������ְ�, location�� Reference Point�� �մ� ���� ���� �ִ� ����  ���׶���� �߽��� �ɰ�.
		//          ���� ��ʽ��� �̿��� �� ���� ��ǥ�� �����ش�.
		
		double k = (d-RADIUS)/d;
		double longx = Math.abs(p.x-location.x);
		double longy = Math.abs(p.y-location.y);
		
		double shortx = k*longx;
		double shorty = k*longy;
		
		double rx,ry;
		
		if(location.x < p.x) rx = p.x - shortx;
		else rx = p.x + shortx;
		
		if(location.y>p.y) ry = p.y + shorty;
		else ry = p.y - shorty;
		
		setBounds(new Rectangle((int)(rx-RADIUS),(int)(ry-RADIUS),(int)(RADIUS*5),(int)(RADIUS*5)));
	}

}
