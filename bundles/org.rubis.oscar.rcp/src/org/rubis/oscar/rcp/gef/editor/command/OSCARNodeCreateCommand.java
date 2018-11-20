package org.rubis.oscar.rcp.gef.editor.command;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import oscar.OSCARObjectProcessDiagram;
import oscar.OSCARContainer;
import oscar.OSCARNode;

public class OSCARNodeCreateCommand extends Command {
		
	private OSCARNode node;
	private Rectangle constraints;
	private OSCARContainer container;
	
	@Override
	public boolean canExecute() {
	    return node != null && constraints != null && container != null;
	}
	
	@Override
	public void execute() {
		node.setConstraints(constraints);
		node.setContainer(container);
	}
	
	@Override
	public void undo() {
		node.setContainer(null);
	}
	
	
	public void setContainer(final OSCARContainer container) {
		this.container = container;
	}
	
	public void setNode(final OSCARNode node) {
		this.node = node;
	}
	
	public void setConstraints(final Rectangle constraints) {
	    this.constraints = constraints;
	}
	
	
}
