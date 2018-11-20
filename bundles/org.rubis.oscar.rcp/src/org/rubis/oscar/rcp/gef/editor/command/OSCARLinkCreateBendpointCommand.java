package org.rubis.oscar.rcp.gef.editor.command;

import org.eclipse.gef.commands.Command;
import org.eclipse.draw2d.geometry.Point;

import oscar.OSCARLink;



public final class OSCARLinkCreateBendpointCommand extends Command {
	
	private OSCARLink link;
	private Point location;
	private int index;	
	
	
	@Override
	public void execute() {
		link.getBendpoints().add(index,location);
	}
	
	@Override
	public void undo() {
		link.getBendpoints().remove(index);
	}
	
	public void setIndex(final int index) {
		this.index = index;
	}
	
	public void setLocation(final Point location) {
		this.location = location;
	}
	
	public void setOSCARLink(final OSCARLink link) {
		this.link = link;
	}
	
}
