package org.rubis.oscar.rcp.gef.editor.policy;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;

import org.rubis.oscar.rcp.gef.editor.command.OSCARLinkCreateCommand;
import org.rubis.oscar.rcp.gef.editor.command.OSCARNodeCreateCommand;

import oscar.OscarFactory;
import oscar.OSCARLink;
import oscar.OSCARNode;
import oscar.OSCARObjectProcessDiagram;
import oscar.OSCARLinkRouterKind;


public class OSCARNodeGraphicalNodeEditPolicy extends GraphicalNodeEditPolicy {
	
	
	private static final Dimension DEFAULT_AGGREGATOR_DIMENSION = new Dimension(30,30);
	
	/**
     * Create a command used to begin connecting to nodes.
     * {@link OPMStructuralLinkAggregatorEditPart} nodes cannot be source nodes,
     * therefore in this case a {@link UnexecutableCommand} is returned.
     * 
     * @return a {@link Command} that contains the initial information needed to
     *         create a connection between two nodes.
     */
	
	
	
	@Override
	protected Command getConnectionCreateCommand(CreateConnectionRequest request) {
		// We must return null and not the usual UnexecutableCommand because is we return a
	    // non-null value the framework thinks that the link can be created from this host,
	    // something that we don't want to happen.
		
		// -> in this part, if request's source is LinkAggregator then return unvaild command.
		/*if(request.getSourceEditPart() instanceof OPMStructuralLinkAggregatorEditPart) {
			return null;
		}
		// request.getNewObject -> get newobject from request's Editpart
		// -> in this part, if request made from StructuralLinkCreateTool, set request's startCommand for next process.
		if(request.getNewObject() instanceof OPMStructuralLinkAggregator) {
			request.setStartCommand(new Command() {});
			return request.getStartCommand();
		}*/
		OSCARLinkCreateCommand result = new OSCARLinkCreateCommand();
		result.setSource((OSCARNode)getHost().getModel());
		result.setLink((OSCARLink) request.getNewObject());
		result.setOPD(((OSCARNode)getHost().getModel()).getOpd());
		request.setStartCommand(result);
		return result;
	}
	/**
     * Retrieves the command created by
     * {@link OSCARNodeGraphicalNodeEditPolicy#getConnectionCreateCommand(CreateConnectionRequest)
     * getConnectionCreateCommand}, and adds it information so that the command
     * can be executed. {@link OPMStructuralLinkAggregatorEditPart} nodes cannot
     * be source nodes, therefore in this case a {@link UnexecutableCommand} is
     * returned.
     * 
     * @return a {@link Command} that can be executed to create a connection
     *         between two nodes.
     */
	
	@Override
	protected Command getConnectionCompleteCommand(CreateConnectionRequest request) {
		// A null command must be returned (and not the usual UnexecutableCommand),
        // otherwise GEF shows the used a symbol that the connection can be completed but
        // when the used clicks it is not created.
		/*
		// -> in this part, if request's target is LinkAggregator then return unvalid command.
		if(request.getStartCommand() == null || request.getTargetEditPart() instanceof OPMStructuralLinkAggregatorEditPart) {
			return null;
		}*/
		
		Command command = null;
		// if request made from StructuralLinkCreateTool, do Structural Link's job.
		/*if(request.getNewObject() instanceof OPMStructuralLinkAggregator) {
			command = handleOPMStructuralLinkRequest(request);
		} else {*/
			OSCARLinkCreateCommand linkCreateCommand = (OSCARLinkCreateCommand) request.getStartCommand();
			linkCreateCommand.setTarget((OSCARNode)getHost().getModel());
			command= linkCreateCommand;
		//}	
		return command;
	}
	@Override
	protected Command getReconnectSourceCommand(ReconnectRequest request) {
		return null;
	}

	@Override
	protected Command getReconnectTargetCommand(ReconnectRequest request) {
		return null;
	}
	
	/**
     * When the user requests the creation of a structural link, the following is done:
     * <ol>
     *   <li>If this is the first structural link of its kind between the source
     *       and target nodes, we create a new aggregator and connect it to the source
     *       and target.</li>
     *   <li>If there already is an aggregator of its kind between the nodes, we
     *       only add a new link from the aggregator to the new target.</li>
     * </ol>
     * 
     * @param request
     *            the user request to create a new strucutral link between the
     *            nodes.
     * @return a command that creates the links as stated above.
     */
	
	/*private Command handleOPMStructuralLinkRequest(CreateConnectionRequest request) {
		Command command = null;
		
		OSCARNode sourceNode = (OSCARNode) request.getSourceEditPart().getModel();
		OSCARNode targetNode = (OSCARNode) request.getTargetEditPart().getModel();
		//OPMStructuralLinkAggregator aggregatorNode = (OPMStructuralLinkAggregator) request.getNewObject();
		
		boolean aggregatorFound = false;
		for(OSCARLink structuralLink : sourceNode.getPublish()) {
			//OPMStructuralLinkAggregator existingAggregator = (OPMStructuralLinkAggregator) structuralLink.getTarget();
			if(existingAggregator.getKind() == aggregatorNode.getKind()) {
				aggregatorFound = true;
				aggregatorNode = existingAggregator;
			}
		}
		
		if(aggregatorFound) {
			OSCARLinkCreateCommand linkCreateCommand = createCreateOPMLinkCreateCommand(aggregatorNode, targetNode, aggregatorNode.getOpd());
            command = linkCreateCommand;
		} else {
			CompoundCommand compoundCommand = new CompoundCommand();
			OPMNodeCreateCommand createAggregatorCommand = createCreateAggregatorNodeCommand(sourceNode,targetNode,aggregatorNode);
			compoundCommand.add(createAggregatorCommand);
			OSCARLinkCreateCommand sourceLinkCreateCommand = createCreateOPMLinkCreateCommand(sourceNode,aggregatorNode,sourceNode.getOpd());
			compoundCommand.add(sourceLinkCreateCommand);
			OSCARLinkCreateCommand targetLinkCreateCommand = createCreateOPMLinkCreateCommand(aggregatorNode,targetNode,sourceNode.getOpd());
			compoundCommand.add(targetLinkCreateCommand);
			command = compoundCommand;
		}
		return command;
	}*/
	 /**
     * Helper function to create a command that connects two nodes with a
     * factory generated link.
     * 
     * @param source
     *            the source of the link.
     * @param target
     *            the target of the link.
     * @return
     */
	
	private OSCARLinkCreateCommand createCreateOPMLinkCreateCommand(OSCARNode source,OSCARNode target,OSCARObjectProcessDiagram opd) {
		OSCARLinkCreateCommand command = new OSCARLinkCreateCommand();
		command.setSource(source);
		command.setTarget(target);
		command.setOPD(opd);
		OSCARLink link = OscarFactory.eINSTANCE.createOSCARLink();
		link.setRouterKind(OSCARLinkRouterKind.MANHATTAN);
		command.setLink(link);
		return command;
	}
	/**
     * Create a command that adds the provided
     * {@link OPMStructuralLinkAggregator} to the diagram located between the
     * source and the target {@link OPMNode}.
     * 
     * @param source
     *            the source for the structural link.
     * @param target
     *            the target of the structural link.
     * @param aggregator
     *            the aggregator that should be added to the diagram.
     * @return A {@link OPMNodeCreateCommand} whose execution add the aggregator
     *         to the diagram.
     */
	
	private OSCARNodeCreateCommand createCreateAggregatorNodeCommand(OSCARNode source,OSCARNode target, OSCARNode aggregator) {
		OSCARNodeCreateCommand command = new OSCARNodeCreateCommand();
		command.setNode(aggregator);
		command.setContainer(source.getContainer());
		
		Rectangle sourceConstraints = source.getConstraints();
		Rectangle targetConstraints = target.getConstraints();
		Point sourceCenter = new Point(sourceConstraints.x + sourceConstraints.width/2,sourceConstraints.y + sourceConstraints.height/2);
		Point targetCenter = new Point(targetConstraints.x + targetConstraints.width/2,targetConstraints.y + targetConstraints.height/2);
		Point aggregatorLeftTopCorner = new Point();
		aggregatorLeftTopCorner.x = sourceCenter.x + (targetCenter.x - sourceCenter.x)/2 - DEFAULT_AGGREGATOR_DIMENSION.width/2;
		aggregatorLeftTopCorner.y = sourceCenter.y + (targetCenter.y - sourceCenter.y)/2 - DEFAULT_AGGREGATOR_DIMENSION.height/2;
		if (aggregatorLeftTopCorner.x < 0) {
			aggregatorLeftTopCorner.x = 0;
		}
		if (aggregatorLeftTopCorner.y < 0) {
			aggregatorLeftTopCorner.y = 0;
		}
		command.setConstraints(new Rectangle(aggregatorLeftTopCorner,DEFAULT_AGGREGATOR_DIMENSION));
		return command;
	}
}
