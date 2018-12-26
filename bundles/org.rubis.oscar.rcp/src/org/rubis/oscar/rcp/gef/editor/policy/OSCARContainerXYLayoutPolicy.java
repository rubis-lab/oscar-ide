package org.rubis.oscar.rcp.gef.editor.policy;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.CreateRequest;

import oscar.OSCARContainer;
import oscar.OSCARNode;
import oscar.Node;
import oscar.OSCARObjectProcessDiagram;
import oscar.Topic;


import org.rubis.oscar.rcp.gef.editor.policy.OSCARContainerXYLayoutPolicy;
import org.rubis.oscar.rcp.gef.editor.command.OSCARNodeCreateCommand;
import org.rubis.oscar.rcp.gef.editor.command.OSCARNodeChangeConstraintCommand;


public class OSCARContainerXYLayoutPolicy extends XYLayoutEditPolicy {
	
	private static final Dimension DEFAULT_THING_DIMENSION = new Dimension(200,130);
	
	/**
	 * Command created top change the constraints of a {@link OPMNode} instance.
	 */
	@Override
	protected Command createChangeConstraintCommand(EditPart child,Object constraint) 
	{
		OSCARNodeChangeConstraintCommand command = new OSCARNodeChangeConstraintCommand();
		command.setNode((OSCARNode) child.getModel());
		command.setNewConstraint((Rectangle) constraint);
		return command;
	}
	
	/**
	 * Command created to add new nodes to the OPD.
	 */
	@Override 
	protected Command getCreateCommand(CreateRequest request) 
	{
		Command retVal = null;
		/*if(request.getNewObjectType().equals(OscarCode.class)) {
			retVal = getNodeCreateCommand(request);
		}*/
		if(request.getNewObjectType().equals(Node.class) || request.getNewObjectType().equals(Topic.class)){
			retVal = getNodeCreateCommand(request);
		}
		return retVal;
	}
	
	private Command getNodeCreateCommand(CreateRequest request)
	{
		OSCARNodeCreateCommand command = new OSCARNodeCreateCommand();
		Rectangle constraints = (Rectangle) getConstraintFor(request);
		command.setConstraints(new Rectangle(constraints.getLocation(),DEFAULT_THING_DIMENSION));
		if(getHost().getModel() instanceof OSCARObjectProcessDiagram) command.setContainer((OSCARContainer) getHost().getModel()); 
		else command.setContainer((OSCARContainer) ((OSCARNode) getHost().getModel()).getOpd());
		//command.setContainer((OPMContainer) getHost().getModel());  
		// <- make contained object. we don't have to use this functionality, so I commentlize this code. if you want use this,
		// uncommentlize this code and delete if~else code right above.
		command.setNode((OSCARNode)(request.getNewObject()));
		return command;
	}
	
	
	/**
	 * The superclass implementation calls 
	 * {@link OSCARContainerXYLayoutPolicy#getResizeChildrenCommand(ChangeBoundsRequest) getResizeChildrenCommand()}
	 *  by default. This is not good in our case since we want to disallow resizing of 
	 *  {@link OPMStructuralLinkAggregatorEditPart} while allowing to move them. Therefore
	 *  we had to override the implementation.
	 *  It creates a {@link Command} that can be used to move a children of the policy's owner.
	 *  @return a {@link Command} used to move children of the host {@link EditPart}. 
	 */
	@Override
	protected Command getMoveChildrenCommand(Request request) {
		return getChangeConstraintCommand((ChangeBoundsRequest) request);
	}
	
	/**
	 * Creates a {@link Command} to resize children of the host {@link EditPart}.
	 * The functions checks that the children don't contain any {@link OPMStructuralLinkAggregatorEditPart}
	 * instances which cannot be resized.
	 * @return a {@link Command} to resize children of the {@link EditPart}.
	 */
	@Override
	protected Command getResizeChildrenCommand(ChangeBoundsRequest request) {
		/*for(Object editPart : request.getEditParts()) {
			if(editPart instanceof OPMStructuralLinkAggregatorEditPart) {
				return UnexecutableCommand.INSTANCE;
			}
		}*/
		return getChangeConstraintCommand(request);
	}	
}
