package org.rubis.oscar.rcp.gef.editor.part;


import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.rubis.oscar.rcp.gef.editor.figure.NodeFigure;

import oscar.Node;
import oscar.OSCARLink;
import oscar.OSCARNode;

public class NodeEditPart extends OSCARThingEditPart {

	private OSCARNodeAdapter adapter;
	
	public class OSCARNodeAdapter implements Adapter{
		@Override
		public void notifyChanged(Notification notification) {
			refresh();
		}
		
		@Override
		public Notifier getTarget() {
			return (Node)getModel();
		}
		
		@Override
		public void setTarget(Notifier newTarget) {
			//Do nothing
		}
		
		@Override
		public boolean isAdapterForType(Object type) {
			return type.equals(Node.class);
		}
	}
	
	public NodeEditPart() {
		super();
		adapter = new OSCARNodeAdapter();
	}
		
	@Override
	protected IFigure createFigure() {
		// TODO Auto-generated method stub
		return new NodeFigure();
	}

	@Override
	public void activate() {
		if(!isActive()) {
			((Node)getModel()).eAdapters().add(adapter);
		}
		super.activate();
	}

	@Override
	public void deactivate() {
		if(isActive()) {
			((Node)getModel()).eAdapters().remove(adapter);
		}
		super.deactivate();
	}
	
}
