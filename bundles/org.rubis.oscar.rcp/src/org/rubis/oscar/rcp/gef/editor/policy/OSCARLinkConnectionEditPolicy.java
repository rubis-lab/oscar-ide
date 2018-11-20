package org.rubis.oscar.rcp.gef.editor.policy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ConnectionEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import org.rubis.oscar.rcp.gef.editor.command.OSCARLinkDeleteCommand;
import oscar.OSCARLink;

public class OSCARLinkConnectionEditPolicy extends ConnectionEditPolicy {

	@Override
	protected OSCARLinkDeleteCommand getDeleteCommand(GroupRequest request) {
		OSCARLinkDeleteCommand command = new OSCARLinkDeleteCommand();
		command.setOSCARLink((OSCARLink) getHost().getModel());
		return command;
	}

}
