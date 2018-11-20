package org.rubis.oscar.rcp.gef.editor.command;


import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

import oscar.OSCARLink;

public final class OSCARLinkDeleteBendpointCommand extends Command {
	private Point location;
	
	private OSCARLink link;
	
	private int index;
	
	
	@Override
	public boolean canExecute() {
		return (link!=null) && (link.getBendpoints().size() > index);
	}
	
	@Override
	public void execute() {
		location = link.getBendpoints().get(index);
		link.getBendpoints().remove(index);
	}
	
	@Override
	public void undo() {
		link.getBendpoints().add(index,location);
	}
	
	public void setOSCARLink(final OSCARLink link) {
		this.link = link;
	}
	
	public void setIndex(final int index) {
		this.index = index;
	}
	
	
	
}
