package org.rubis.oscar.rcp.gef.editor.command;

import org.eclipse.gef.commands.Command;

import oscar.OSCARThing;

public class OSCARThingRenameCommand extends Command {
	
	private String oldName;
	private String newName;
	private OSCARThing model;
	
	@Override
	public void execute() {
		oldName = model.getName();
		model.setName(newName);
	}
	
	@Override
	public void undo() {
		model.setName(oldName);
	}
	
	public void setNewName(String newName) {
		this.newName = newName;
	}
	
	public void setModel(OSCARThing model) {
		this.model = model;
		
	}
	
}
