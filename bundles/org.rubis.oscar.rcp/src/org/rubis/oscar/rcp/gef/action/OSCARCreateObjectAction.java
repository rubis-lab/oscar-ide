package org.rubis.oscar.rcp.gef.action;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.Request;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gef.tools.CreationTool;
import org.eclipse.gef.ui.actions.WorkbenchPartAction;
import org.eclipse.ui.IWorkbenchPart;

import org.rubis.oscar.rcp.gef.editor.OSCARGraphicalEditor;
import org.rubis.oscar.rcp.gef.editor.command.OSCARNodeCreateCommand;
import org.rubis.oscar.rcp.gef.editor.factory.NodeFactory;
import oscar.OSCARNode;

public class OSCARCreateObjectAction extends WorkbenchPartAction {
	
	public static final String ID = "CreateObject";
	public static final String REQUEST = "CreateObject";
	
	private final CreateRequest request;
	private CreationTool tool;
	private static final Dimension DEFAULT_THING_DIMENSION = new Dimension(300,150);
	
	
	
	public OSCARCreateObjectAction(IWorkbenchPart part) {
		super(part);
		request = new CreateRequest(REQUEST);
		setId(ID);
		setText("Create Object");
	}
	
	public Request getRequest() {
		return request;
	}
	
	@Override
	public void run() {
		// for now we don't use this, I change this code to comment.
		// if you want to use this code, change OPMGraphicalEditor's getEditDomain() method.
		// (it is also commentized)
		/*
		OPMGraphicalEditor editor = (OPMGraphicalEditor) getWorkbenchPart();
		CreationTool tool = new CreationTool(new OPMObjectFactory());
		editor.getEditDomain().setActiveTool(tool);
		*/
	}
	
	@Override
	protected boolean calculateEnabled() {
		return true;
	}

}
