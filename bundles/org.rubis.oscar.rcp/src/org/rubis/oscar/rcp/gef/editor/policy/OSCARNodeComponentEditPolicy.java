package org.rubis.oscar.rcp.gef.editor.policy;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import oscar.OSCARNode;
import oscar.OSCARLink;
import org.rubis.oscar.rcp.gef.action.ResizeToContentsAction;
import org.rubis.oscar.rcp.gef.editor.command.OSCARNodeChangeConstraintCommand;
import org.rubis.oscar.rcp.gef.editor.command.OSCARNodeDeleteCommand;
import org.rubis.oscar.rcp.gef.editor.figure.OSCARNodeFigure;
import org.rubis.oscar.rcp.gef.editor.part.OSCARNodeEditPart;

/**
 * {@link EditPolicy} used for delete requests.
 *
 */

public class OSCARNodeComponentEditPolicy extends ComponentEditPolicy {
	
	private static final int INSETS = 20;

    /**
     * Create a command to delete a node. When a node is deleted all incoming
     * and outgoing links are also deleted (functionality provided by the
     * command). When a {@link OPMThing} node is deleted, there is special
     * treatment for structural links that start and end at this node. If this
     * node is source for a structural link, the
     * {@link OPMStructuralLinkAggregator} of this link must be deleted. Also if
     * this node is the target of the only outgoing link of a
     * {@link OPMStructuralLinkAggregator}, the aggregator must be deleted.
     * 
     * @return a command that deletes a node and all other required diagram
     *         entities.
     */
	@Override
	protected Command createDeleteCommand(GroupRequest deleteRequest) {
		OSCARNode nodeToDelete =  (OSCARNode) getHost().getModel();
		CompoundCommand compoundCommand = new CompoundCommand();
		compoundCommand = createRecursiveDeleteNodeCommand(nodeToDelete);
		
		return compoundCommand;

        
	}
	
	private CompoundCommand createRecursiveDeleteNodeCommand(OSCARNode nodeToDelete) {
		CompoundCommand compoundCommand = new CompoundCommand();
		
		
		// For every outgoing structural link, create a command to delete the aggregator
        // node at the end of the link.
		for(OSCARLink outgoingStructuralLink : nodeToDelete.getPublish()) {
			OSCARNode aggregatorNode = outgoingStructuralLink.getTarget();
			OSCARNodeDeleteCommand aggregatorNodeDeleteCommand = new OSCARNodeDeleteCommand();
			aggregatorNodeDeleteCommand.setNode(aggregatorNode);
			compoundCommand.add(aggregatorNodeDeleteCommand);			
		}
		// For every incoming structural link whose aggregator has only one outgoing
        // link, create a command to delete the aggregator.
		for(OSCARLink incomingStructuralLink : nodeToDelete.getSubscribe()) {
			OSCARNode aggregatorNode = incomingStructuralLink.getSource();
			if(aggregatorNode.getPublishMSG().size() == 1) {
				OSCARNodeDeleteCommand aggregatorNodeDeleteCommand = new OSCARNodeDeleteCommand();
				aggregatorNodeDeleteCommand.setNode(aggregatorNode);
				compoundCommand.add(aggregatorNodeDeleteCommand);
			}
		}
		
		for (OSCARNode node : nodeToDelete.getNodes()) {
			Command containedNodeDelete = createRecursiveDeleteNodeCommand(node);
			compoundCommand.add(containedNodeDelete);
		}
		
		
		// Create a command to delete the node.
		OSCARNodeDeleteCommand nodeDeleteCommand = new OSCARNodeDeleteCommand();
		nodeDeleteCommand.setNode(nodeToDelete);
		compoundCommand.add(nodeDeleteCommand);

		return compoundCommand;
	}
	
	/**
    * Create a command to resize a node based on the current contents of the node.
    * The current implementation uses the figure's {@link OPMNodeFigure#getPreferredSize()} to
    * calculate this size.
    *
    * @return
    */
	private OSCARNodeChangeConstraintCommand createResizeToContentsCommand() {
		OSCARNodeEditPart host = (OSCARNodeEditPart) getHost();
		OSCARNode node = (OSCARNode) host.getModel();
		OSCARNodeFigure figure = (OSCARNodeFigure) host.getFigure();
		
		// We assume the node's preferred size includes all of its contents.
		Dimension preferredSize = figure.getPreferredSize();
		preferredSize.expand(INSETS,INSETS);
		Rectangle newConstraints = node.getConstraints().getCopy();
		newConstraints.setWidth(preferredSize.width);
		newConstraints.setHeight(preferredSize.height);
		
		OSCARNodeChangeConstraintCommand command = new OSCARNodeChangeConstraintCommand();
		command.setNode(node);
		command.setNewConstraint(newConstraints);
		return command;
	}
	
	
	
	
	// for now we don't use ResizeToContentAction, I change this code to Comment.
	// if you want to use that action, uncommentrize this code.
	/* 
	
	
	/**
     * <p>Extends the parent implementation by handling incoming REQ_RESIZE_TO_CONTENTS requests.</p>
     * <p>The parent implementation {@inheritDoc}</p>
     
    @Override
    public Command getCommand(Request request) {
    	if(request.getType().equals(ResizeToContentsAction.REQ_RESIZE_TO_CONTENTS)) {
    		return createResizeToContentsCommand();
    	}
    	return super.getCommand(request);
    }
	
	*/
}
