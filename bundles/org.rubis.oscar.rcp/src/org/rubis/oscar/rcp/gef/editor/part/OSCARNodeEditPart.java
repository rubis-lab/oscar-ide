package org.rubis.oscar.rcp.gef.editor.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.NodeEditPart;

import oscar.OSCARLink;
import oscar.OSCARNode;
import org.rubis.oscar.rcp.gef.editor.figure.OSCARNodeFigure;
import org.rubis.oscar.rcp.gef.editor.policy.OSCARContainerXYLayoutPolicy;
import org.rubis.oscar.rcp.gef.editor.policy.OSCARNodeComponentEditPolicy;
import org.rubis.oscar.rcp.gef.editor.policy.OSCARNodeGraphicalNodeEditPolicy;

public abstract class OSCARNodeEditPart extends AbstractGraphicalEditPart implements NodeEditPart {
	
	private OPMNodeAdapter adapter;
	
	public class OPMNodeAdapter implements Adapter{
		@Override
		public void notifyChanged(Notification notification) {
			refresh();
		}
		
		@Override
		public Notifier getTarget() {
			return (OSCARNode)getModel();
		}
		
		@Override
		public void setTarget(Notifier newTarget) {
			//Do nothing
		}
		
		@Override
		public boolean isAdapterForType(Object type) {
			return type.equals(OSCARNode.class);
		}
		
	}

	public OSCARNodeEditPart() {
		super();
		adapter = new OPMNodeAdapter();
	}

	@Override
	protected List<OSCARLink> getModelSourceConnections() {
		OSCARNode model = (OSCARNode)getModel();
		return model.getPublishMSG();
	}

	@Override
	protected List<OSCARLink> getModelTargetConnections() {
		OSCARNode model = (OSCARNode)getModel();
		return model.getSubscribeMSG();
	}

	@Override
	public void activate() {
		if(!isActive()) {
			((OSCARNode)getModel()).eAdapters().add(adapter);
		}
		super.activate();
	}

	@Override
	public void deactivate() {
		if(isActive()) {
			((OSCARNode)getModel()).eAdapters().remove(adapter);
		}
		super.deactivate();
	}
	
	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new OSCARNodeComponentEditPolicy());
        installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new OSCARNodeGraphicalNodeEditPolicy());
        installEditPolicy(EditPolicy.LAYOUT_ROLE, new OSCARContainerXYLayoutPolicy());
	}
	
	@Override
	protected List getModelChildren() {
		OSCARNode model = (OSCARNode) getModel();
		return Collections.unmodifiableList(model.getNodes());
	}
	
	@Override
    public ConnectionAnchor getSourceConnectionAnchor(ConnectionEditPart connection) {
    	return ((OSCARNodeFigure)getFigure()).getSourceConnectionAnchor();
    }

    @Override
    public ConnectionAnchor getTargetConnectionAnchor(ConnectionEditPart connection) {
    	return ((OSCARNodeFigure)getFigure()).getTargetConnectionAnchor();
    }

    @Override
    public ConnectionAnchor getSourceConnectionAnchor(Request request) {
    	return ((OSCARNodeFigure)getFigure()).getSourceConnectionAnchor();
    }

    @Override
    public ConnectionAnchor getTargetConnectionAnchor(Request request) {
    	return ((OSCARNodeFigure)getFigure()).getTargetConnectionAnchor();
    }
}