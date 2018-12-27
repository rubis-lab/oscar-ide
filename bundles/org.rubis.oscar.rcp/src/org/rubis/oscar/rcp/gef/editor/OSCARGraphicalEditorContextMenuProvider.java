package org.rubis.oscar.rcp.gef.editor;

import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.actions.ActionFactory;

import org.rubis.oscar.rcp.gef.action.OSCARCreateObjectAction;
//import com.oscar.opm.gef.action.OscarCodePathChangeAction;
//import com.oscar.opm.gef.action.OscarCodeModifyAction;
import org.rubis.oscar.rcp.gef.action.ResizeToContentsAction;

public class OSCARGraphicalEditorContextMenuProvider extends ContextMenuProvider {

	private ActionRegistry actionRegistry;
	
	public OSCARGraphicalEditorContextMenuProvider(EditPartViewer viewer,final ActionRegistry actionRegistry) {
		super(viewer);
		setActionRegistry(actionRegistry);
	}

	@Override
	public void buildContextMenu(IMenuManager menu) {
		GEFActionConstants.addStandardActionGroups(menu);
		
		IAction action;
		
		action = getActionRegistry().getAction(ActionFactory.UNDO.getId());
		menu.appendToGroup(GEFActionConstants.GROUP_UNDO, action);
		action = getActionRegistry().getAction(ActionFactory.REDO.getId());
		menu.appendToGroup(GEFActionConstants.GROUP_UNDO, action);
		
		//JTJ
		action = getActionRegistry().getAction(ActionFactory.DELETE.getId());
		menu.appendToGroup(GEFActionConstants.GROUP_UNDO, action);
		/*action = getActionRegistry().getAction(OscarCodePathChangeAction.CHANGE_CODEPATH);
		menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);
		action = getActionRegistry().getAction(OscarCodeModifyAction.MODIFY_CODE);
		menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);
		// in graphical Editor, we register Action to actionRegistry. Action has it's id so we can use it by id.
		// for now, we don't use these menu.
		/*
		action = getActionRegistry().getAction(ResizeToContentsAction.RESIZE_TO_CONTENTS);
		menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);
		action = getActionRegistry().getAction(OPMCreateObjectAction.ID);
		menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);
	    */
	}
	
	private ActionRegistry getActionRegistry() {
		return actionRegistry;
	}
	
	private void setActionRegistry(final ActionRegistry actionRegistry) {
		this.actionRegistry = actionRegistry;
	}
	
}
