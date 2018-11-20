package org.rubis.oscar.rcp.gef.editor.command;

import org.eclipse.gef.commands.Command;

import oscar.OSCARLink;
import oscar.OSCARObjectProcessDiagram;
import oscar.OSCARNode;


public class OSCARLinkCreateCommand extends Command {
	
	private OSCARNode source;
	private OSCARNode target;
	private OSCARLink link;
	private OSCARObjectProcessDiagram opd;
	
	@Override
	public boolean canExecute() {
		return (source != null) && (target != null) && (link != null) && (opd!=null); 
	}
	
	@Override
	public void execute() {
		link.setSource(source);
		link.setTarget(target);
		link.setOpd(opd);
	}
	
	@Override
	public void undo() {
		link.getSource().getPublishMSG().remove(link);
		link.setSource(null);
		link.getTarget().getSubscribeMSG().remove(link);
		link.setTarget(null);
		link.setOpd(null);
	}
	
	public void setTarget(OSCARNode target) {
		this.target = target;
	}
	
	public void setSource(OSCARNode source) {
		this.source = source;
	}
	
	public void setLink(OSCARLink link) {
		this.link = link;
	}
	
	public void setOPD(OSCARObjectProcessDiagram opd) {
		this.opd = opd;
	}
	
}
