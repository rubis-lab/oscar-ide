package org.rubis.oscar.rcp.gef.editor.part;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.PolylineDecoration;

import org.rubis.oscar.rcp.gef.editor.figure.CircleDecoration;
import oscar.OSCARProceduralLink;
import oscar.OSCARProceduralLinkKind;

public class OSCARProceduralLinkEditPart extends OSCARLinkEditPart {

	@Override
	protected PolylineConnection createFigure() {
		PolylineConnection connection = (PolylineConnection) super.createFigure();
		OSCARProceduralLink model = (OSCARProceduralLink) getModel();
		decorateConnection(connection,model.getKind());
		return connection;
	}
	
	
	private void decorateConnection(PolylineConnection connection, OSCARProceduralLinkKind kind) {
		switch(kind) {
			case PUBLISH_SUBSCRIBE:
				connection.setTargetDecoration(new PolylineDecoration());			
				break;
			default:
				throw new IllegalArgumentException("No case for kind " + kind);
		}
	}
	
	
	
	
	
}
