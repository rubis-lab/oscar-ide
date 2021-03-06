package org.rubis.oscar.rcp.gef.editor.figure;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.RoundedRectangleAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.PositionConstants;
//JTJ
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.geometry.Dimension;

public class TopicFigure extends OSCARThingFigure {
	private Label nameLabel;
	private RoundedRectangle rectangle;
	private ConnectionAnchor connectionAnchor;
	
	public TopicFigure() {
		setLayoutManager(new XYLayout());
		nameLabel = new Label();
		add(nameLabel);
		rectangle = new RoundedRectangle();
		rectangle.setFill(false);
		rectangle.setCornerDimensions(new Dimension(35, 35));
		rectangle.setLayoutManager(new XYLayout());
		add(rectangle);
	}
	
	@Override
	public IFigure getContentPane() {
		return rectangle;
	}
	
	protected RoundedRectangle getRectangle() {
		return this.rectangle;
	}
	
	
	
	@Override
	protected void paintFigure(Graphics graphics) {
		Rectangle r = getBounds().getCopy();
		setConstraint(rectangle,new Rectangle(0,0,r.width,r.height));
		setConstraint(nameLabel,new Rectangle(0,0,r.width,r.height));
		rectangle.invalidate();
		nameLabel.invalidate();
	}
	
	public Label getNameLabel() {
		return nameLabel;
	}
	
	private ConnectionAnchor getConnectionAnchor() {
		if (connectionAnchor == null) {
			connectionAnchor = new ChopboxAnchor(this);
		}
		return connectionAnchor;
	}
	
	public ConnectionAnchor getSourceConnectionAnchor() {
		return getConnectionAnchor();
	}
	
	public ConnectionAnchor getTargetConnectionAnchor() {
		return getConnectionAnchor();
	}

}
