package org.rubis.oscar.rcp.gef.editor.command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.gef.commands.Command;

import oscar.OSCARContainer;
import oscar.OSCARObjectProcessDiagram;
import oscar.OSCARNode;
import oscar.OSCARLink;

public class OSCARNodeDeleteCommand extends Command {
	
	private OSCARNode node;
	private OSCARContainer container;
	private List<OSCARLink> links;
	private Map<OSCARLink,OSCARNode> linkSources;
	private Map<OSCARLink,OSCARNode> linkTargets;
	
	@Override
	public void execute() {
		detachLinks();
		node.setContainer(null);
	}
	
	@Override
	public void undo() {
		reattachLinks();
		node.setContainer(container);
	}
	
	private void detachLinks() {
		links = new ArrayList<OSCARLink>();
		linkSources = new HashMap<OSCARLink,OSCARNode>();
		linkTargets = new HashMap<OSCARLink,OSCARNode>();
		links.addAll(node.getSubscribeMSG());
		links.addAll(node.getPublishMSG());
		for(OSCARLink link : links) {
			linkSources.put(link, link.getSource());
			linkTargets.put(link, link.getTarget());
			link.setSource(null);
			link.setTarget(null);
			link.setOpd(null);
		}
	}
	
	private void reattachLinks() {
		for(OSCARLink link : links) {
			link.setSource(linkSources.get(link));
			link.setTarget(linkTargets.get(link));
			if(container instanceof OSCARObjectProcessDiagram) 
			{
				link.setOpd((OSCARObjectProcessDiagram)container);
			}
			else 
			{
				OSCARNode containerNode = (OSCARNode) container;
				link.setOpd(containerNode.getOpd());
			}
		}
	}
	
	public void setNode(final OSCARNode node) {
		this.node = node;
		this.container = node.getContainer();
	}
	
}
