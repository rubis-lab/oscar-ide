package org.rubis.oscar.rcp.gef.editor.command;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import oscar.OSCARNode;


public class OSCARNodeChangeConstraintCommand extends Command {
	private Rectangle oldConstraint;
	private Rectangle newConstraint;
	private OSCARNode node;
	
	@Override
	public boolean canExecute() {
		return node != null && newConstraint != null;
	}
	
	@Override
	public boolean canUndo() {
		return node != null && oldConstraint != null;
	}
	
	@Override
	public void execute() {
		oldConstraint = node.getConstraints();
		node.setConstraints(newConstraint);
	}
	
	@Override
	public void undo() {
		node.setConstraints(oldConstraint);
	}
	
	public void setNode(final OSCARNode node) {
		this.node = node;
	}
	
	public void setNewConstraint(final Rectangle newConstraint) {
		this.newConstraint = newConstraint;
	}
	
}
