package org.rubis.oscar.rcp.gef.editor.policy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.requests.DirectEditRequest;

import org.rubis.oscar.rcp.gef.editor.command.OSCARThingRenameCommand;
import org.rubis.oscar.rcp.gef.editor.figure.OSCARThingFigure;
import oscar.OSCARThing;

public class OSCARThingDirectEditPolicy extends DirectEditPolicy {

	@Override
	protected Command getDirectEditCommand(DirectEditRequest request) {
		OSCARThingRenameCommand command  = new OSCARThingRenameCommand();
		command.setModel((OSCARThing) getHost().getModel());
		command.setNewName((String) request.getCellEditor().getValue());
		return command;
	}

	@Override
	protected void showCurrentEditValue(DirectEditRequest request) {
		String value = (String) request.getCellEditor().getValue();
		((OSCARThingFigure)getHostFigure()).getNameLabel().setText(value);
	}

}
