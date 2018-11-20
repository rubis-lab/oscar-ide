package org.rubis.oscar.rcp.gef.editor.policy;


import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.BendpointRequest;
import org.eclipse.gef.editpolicies.BendpointEditPolicy;

import org.rubis.oscar.rcp.gef.editor.command.OSCARLinkCreateBendpointCommand;
import org.rubis.oscar.rcp.gef.editor.command.OSCARLinkMoveBendpointCommand;
import org.rubis.oscar.rcp.gef.editor.command.OSCARLinkDeleteBendpointCommand;
import oscar.OSCARLink;



public class OSCARLinkBendpointEditPolicy extends BendpointEditPolicy {
	
	@Override
	protected Command getCreateBendpointCommand(final BendpointRequest request) {
		OSCARLinkCreateBendpointCommand command = new OSCARLinkCreateBendpointCommand();
		
		Point p = request.getLocation();
		
		command.setOSCARLink((OSCARLink) request.getSource().getModel());
		command.setLocation(p);
		command.setIndex(request.getIndex());
		return command;
	}

	@Override
	protected Command getDeleteBendpointCommand(BendpointRequest request) {
		OSCARLinkDeleteBendpointCommand command = new OSCARLinkDeleteBendpointCommand();
		
		command.setOSCARLink((OSCARLink) request.getSource().getModel());
		command.setIndex(request.getIndex());
		return command;
	}

	@Override
	protected Command getMoveBendpointCommand(BendpointRequest request) {
		OSCARLinkMoveBendpointCommand command = new OSCARLinkMoveBendpointCommand();
		
		Point p = request.getLocation();
		
		command.setOSCARLink((OSCARLink) request.getSource().getModel());
		command.setLocation(p);
		command.setIndex(request.getIndex());
		
		return command;
	}

}
