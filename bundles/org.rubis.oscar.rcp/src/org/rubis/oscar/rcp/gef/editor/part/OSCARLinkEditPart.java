package org.rubis.oscar.rcp.gef.editor.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.AbsoluteBendpoint;
import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ManhattanConnectionRouter;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gef.editpolicies.ConnectionEndpointEditPolicy;

import org.rubis.oscar.rcp.gef.editor.policy.OSCARLinkBendpointEditPolicy;
import org.rubis.oscar.rcp.gef.editor.policy.OSCARLinkConnectionEditPolicy;
import oscar.OSCARLink;
import oscar.OSCARLinkRouterKind;

public class OSCARLinkEditPart extends AbstractConnectionEditPart {
	
	private OSCARLinkAdapter adapter;
	
	public OSCARLinkEditPart() {
		super();
		adapter = new OSCARLinkAdapter();
	}
	
	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.CONNECTION_ENDPOINTS_ROLE,new ConnectionEndpointEditPolicy());
		installEditPolicy(EditPolicy.CONNECTION_ROLE,new OSCARLinkConnectionEditPolicy());
		if(((OSCARLink)getModel()).getRouterKind() == OSCARLinkRouterKind.BENDPOINT) {
			installEditPolicy(EditPolicy.CONNECTION_BENDPOINTS_ROLE,new OSCARLinkBendpointEditPolicy());	
		}
	}
	
	@Override
	protected PolylineConnection createFigure() {
		PolylineConnection conn = new PolylineConnection();
		switch(((OSCARLink)getModel()).getRouterKind()) {
		case BENDPOINT:
			conn.setConnectionRouter(new BendpointConnectionRouter());
			break;
		case MANHATTAN:
			conn.setConnectionRouter(new ManhattanConnectionRouter());
			break;
		}
		
		return conn;
	}
	
	@Override
	protected void refreshVisuals() {
		switch(((OSCARLink)getModel()).getRouterKind()) 
		{
		case BENDPOINT:
			Connection connection = getConnectionFigure();
			List<Point> modelConstraint = ((OSCARLink)getModel()).getBendpoints();
			List<AbsoluteBendpoint> figureConstraint = new ArrayList<AbsoluteBendpoint>();
			for (Point p : modelConstraint) {
				figureConstraint.add(new AbsoluteBendpoint(p));
			}
			connection.setRoutingConstraint(figureConstraint);
			break;
		case MANHATTAN:
			break;
		}
	}
	
	@Override 
	public void activate() {
		if(!isActive()) {
			((OSCARLink)getModel()).eAdapters().add(adapter);
		}
		super.activate();
	}
	
	@Override
	public void deactivate() {
		if(isActive()) {
			((OSCARLink)getModel()).eAdapters().remove(adapter);
		}
		super.deactivate();
	}
	
	
	
	public class OSCARLinkAdapter implements Adapter{
		@Override
		public void notifyChanged(Notification notification) {
			refreshVisuals();
		}
		
		@Override
		public Notifier getTarget() {
			return (OSCARLink)getModel();
		}
		
		@Override
		public void setTarget(Notifier newTarget) {
			// Do Nothing.
		}
		
		@Override
		public boolean isAdapterForType(Object type) {
			return type.equals(OSCARLink.class);
		}
		
	}
	
	
}
