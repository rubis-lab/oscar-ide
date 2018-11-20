package org.rubis.oscar.rcp.gef.editor.command;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;
import oscar.OSCARLink;

public final class OSCARLinkMoveBendpointCommand extends Command {
	
	private Point oldLocation;
	
	private Point newLocation;
	
	private int index;
	
	private OSCARLink link;
	
	
	
	@Override
	public void execute() {
		if(oldLocation == null) {
			oldLocation = link.getBendpoints().get(index);
		}
		link.getBendpoints().set(index,newLocation);
	}
	
	@Override
	public void undo() {
		link.getBendpoints().set(index,oldLocation);
	}
	
	public void setOSCARLink(final OSCARLink link) {
		this.link = link;
	}
	
	
	public void setIndex(final int index) {
		this.index = index;
	}
	
	
	public void setLocation(final Point newLocation) {
		this.newLocation = newLocation;
	}
	
	
	
	
}
