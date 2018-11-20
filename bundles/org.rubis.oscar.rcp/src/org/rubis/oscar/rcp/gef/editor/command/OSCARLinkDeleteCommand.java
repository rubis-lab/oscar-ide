package org.rubis.oscar.rcp.gef.editor.command;

import org.eclipse.gef.commands.Command;

import oscar.OSCARLink;
import oscar.OSCARObjectProcessDiagram;
import oscar.OSCARNode;

public class OSCARLinkDeleteCommand extends Command {

	private OSCARNode source;
	private OSCARNode target;
	private OSCARLink link;
	private OSCARObjectProcessDiagram opd;
	
	
	@Override
	public boolean canExecute() {
		return link!=null;
	}
	
	
	@Override
	public void execute() {
		/*
		source.getOutgoingLinks().remove(link);
		target.getIncomingLinks().remove(link);
		link.setOpd(null);
		*/
		opd = link.getOpd();
		source = link.getSource();
		target = link.getTarget();
		
		link.setSource(null);
		link.setTarget(null);
		link.setOpd(null);
	}
	
	@Override
	public void undo() {
		/*
		link.setOpd(opd);
		source.getOutgoingLinks().add(link);
		target.getIncomingLinks().add(link);
		*/
		link.setSource(source);
		link.setTarget(target);
		link.setOpd(opd);
	}
	
	public void setOSCARLink(final OSCARLink linkParam) {
		link = linkParam;
	}
	
	
	
}
