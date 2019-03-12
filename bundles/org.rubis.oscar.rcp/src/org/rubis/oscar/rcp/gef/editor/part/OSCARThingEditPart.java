package org.rubis.oscar.rcp.gef.editor.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.gef.CompoundSnapToHelper;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.SnapToGeometry;
import org.eclipse.gef.SnapToGrid;
import org.eclipse.gef.SnapToHelper;
import org.eclipse.gef.editpolicies.SnapFeedbackPolicy;
import org.eclipse.jface.viewers.TextCellEditor;

import org.rubis.oscar.rcp.gef.editor.figure.OSCARThingFigure;
import org.rubis.oscar.rcp.gef.editor.policy.OSCARThingDirectEditPolicy;
import oscar.OSCARThing;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MBasicFactory;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;

public abstract class OSCARThingEditPart extends OSCARNodeEditPart implements NodeEditPart{
	
	
	public OSCARThingEditPart() {
		super();
	}
	
	@Override 
	protected void createEditPolicies() {
		super.createEditPolicies();
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE,new OSCARThingDirectEditPolicy());
		installEditPolicy("Snap Feedback",new SnapFeedbackPolicy());
		}
	
	@Override 
	public void performRequest(Request req) {
		// Single-click
		if(req.getType() == RequestConstants.REQ_DIRECT_EDIT) {
			performDirectEditing();
		}
		
		// Double-click JTJ
	    if(req.getType() == RequestConstants.REQ_OPEN) {
	        openTextEditor();
	    }
	}
	
	private void performDirectEditing() {
		Label label = ((OSCARThingFigure)getFigure()).getNameLabel();		
		
		OSCARThingDirectEditManager manager = new OSCARThingDirectEditManager(this, TextCellEditor.class, new OSCARThingCellEditorLocator(label), label);
		manager.show();
	}
	
	// JTJ open text editors
	private void openTextEditor() {
		// open text editor window
		
	}
	
	
	@Override
	protected void refreshVisuals()
	{
		OSCARThingFigure figure = (OSCARThingFigure)getFigure();
		OSCARThing model = (OSCARThing)getModel();
		GraphicalEditPart parent = (GraphicalEditPart) getParent();
		
		figure.getNameLabel().setText(model.getName());
		parent.setLayoutConstraint(this, figure, model.getConstraints());
		
		figure.setTooltipText(model.getMsg());
		figure.setTooltipText(model.getMsg_type());
	}
	
	
	@Override
	public IFigure getContentPane() {
		return ((OSCARThingFigure)getFigure()).getContentPane();
	}
	
	
	@Override public Object getAdapter(Class key) {
		if(key == SnapToHelper.class) {
			List<SnapToHelper> helpers = new ArrayList<SnapToHelper>();
			if (Boolean.TRUE.equals(getViewer().getProperty(SnapToGeometry.PROPERTY_SNAP_ENABLED))) {
				helpers.add(new SnapToGeometry(this));
			}
			if (Boolean.TRUE.equals(getViewer().getProperty(SnapToGrid.PROPERTY_GRID_ENABLED))) {
				helpers.add(new SnapToGrid(this));
			}
			if(helpers.size()==0) return null;
			else return new CompoundSnapToHelper(helpers.toArray(new SnapToHelper[0]));
		}
		return super.getAdapter(key);
	}
	
	
}
	

