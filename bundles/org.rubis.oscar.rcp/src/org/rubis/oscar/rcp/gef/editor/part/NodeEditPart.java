package org.rubis.oscar.rcp.gef.editor.part;


import org.eclipse.draw2d.IFigure;
import org.rubis.oscar.rcp.gef.editor.figure.NodeFigure;

public class NodeEditPart extends OSCARThingEditPart {

	@Override
	protected IFigure createFigure() {
		// TODO Auto-generated method stub
		return new NodeFigure();
	}

	
}
