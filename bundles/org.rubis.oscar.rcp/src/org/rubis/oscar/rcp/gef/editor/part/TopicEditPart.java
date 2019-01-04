package org.rubis.oscar.rcp.gef.editor.part;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.rubis.oscar.rcp.gef.editor.figure.TopicFigure;
import org.rubis.oscar.rcp.gef.editor.part.NodeEditPart.OSCARNodeAdapter;

import oscar.Node;
import oscar.OSCARNode;
import oscar.Topic;

public class TopicEditPart extends OSCARThingEditPart {

	private OSCARTopicAdapter adapter;
	
	public class OSCARTopicAdapter implements Adapter{
		@Override
		public void notifyChanged(Notification notification) {
			refresh();
		}
		
		@Override
		public Notifier getTarget() {
			return (Topic)getModel();
		}
		
		@Override
		public void setTarget(Notifier newTarget) {
			//Do nothing
		}
		
		@Override
		public boolean isAdapterForType(Object type) {
			return type.equals(Topic.class);
		}
	}

	public TopicEditPart() {
		super();
		adapter = new OSCARTopicAdapter();
	}
	@Override
	protected IFigure createFigure() {
		// TODO Auto-generated method stub
		return new TopicFigure();
	}

	@Override
	public void activate() {
		if(!isActive()) {
			((Topic)getModel()).eAdapters().add(adapter);
		}
		super.activate();
	}

	@Override
	public void deactivate() {
		if(isActive()) {
			((Topic)getModel()).eAdapters().remove(adapter);
		}
		super.deactivate();
	}

}
