package org.rubis.oscar.rcp.gef.editor.figure;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;

public abstract class OSCARThingFigure extends Figure implements OSCARNodeFigure {
	
	private Label nameLabel;
	private TooltipFigure tooltipFigure;
	
	abstract public IFigure getContentPane();
	
	public Label getNameLabel() {
		return nameLabel;
	}
	
	public OSCARThingFigure() {
		setLayoutManager(new XYLayout());
		nameLabel = new Label();
		add(nameLabel);
		tooltipFigure = new TooltipFigure();
		setToolTip(tooltipFigure);
	}
	
	public void setTooltipText(String tooltipText) {
		tooltipFigure.setMessage(tooltipText);
	}
	
	protected final boolean useLocalCoordinates() {
		return true;
	}
	
	/**
	 * The thing's preferred size is the size of its name label.
	 */
	@Override
	public Dimension getPreferredSize(int wHint, int hHint) {
	    Dimension d = new Dimension();
	    Rectangle textRectangle = getNameLabel().getTextBounds().getCopy();
	    d.width = textRectangle.width;
	    d.height = textRectangle.height;
	    return d;
	}
	
}