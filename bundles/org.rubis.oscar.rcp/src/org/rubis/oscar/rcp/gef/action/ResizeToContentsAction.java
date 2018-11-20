package org.rubis.oscar.rcp.gef.action;

import java.util.List;

import org.eclipse.gef.Request;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.ui.IWorkbenchPart;

import org.rubis.oscar.rcp.gef.editor.part.OSCARNodeEditPart;

/**
 * An action that executes the command returned by the selected {@link EditPart} instances when given a
 * {@link ResizeToContentsAction#REQ_RESIZE_TO_CONTENTS}.
 */
public class ResizeToContentsAction extends SelectionAction {

	public static final String RESIZE_TO_CONTENTS = "ResizeToContents";
	public static final String REQ_RESIZE_TO_CONTENTS = "ResizeToContents";
	
	Request request;
	
	/**
     * Create a new instance of the class.
     * @param part
     */
	public ResizeToContentsAction(IWorkbenchPart part) {
		super(part);
		setId(RESIZE_TO_CONTENTS);
		setText("Resize to Contents");
		request = new Request(REQ_RESIZE_TO_CONTENTS);
	}
	
	/**
     * Execute the commands that perform the {@link ResizeToContentsAction#REQ_RESIZE_TO_CONTENTS REQ_RESIZE_TO_CONTENTS}.
     *
     * It is assumed that this method is executed directly after
     * {@link ResizeToContentsAction#calculateEnabled() calculateEnabled()}
     */
	@Override
	public void run() {
		// selected objects must be nodes because the action is enabled.
		@SuppressWarnings("unchecked") List<OSCARNodeEditPart> editParts = getSelectedObjects();
		CompoundCommand compoundCommand = new CompoundCommand();
		
		for(OSCARNodeEditPart nodeEditPart : editParts) {
			//if(!(nodeEditPart instanceof OPMStructuralLinkAggregatorEditPart)) {
				compoundCommand.add(nodeEditPart.getCommand(request));
		//	}
		}
		execute(compoundCommand);
	}
	/**
     * {@inheritDoc}
     * <p>The action is enabled if all the selected entities on the
     * editor are {@link OSCARNodeEditPart} instances</p>
     */
	@Override
	protected boolean calculateEnabled() {
		if(getSelectedObjects().isEmpty()) {
			return false;
		}
		for(Object selectedObject : getSelectedObjects()) {
			if(!(selectedObject instanceof OSCARNodeEditPart)) {
				return false;
			}
		}
		return true;
	}
}
