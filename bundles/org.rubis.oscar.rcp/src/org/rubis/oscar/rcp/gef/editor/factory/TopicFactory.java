package org.rubis.oscar.rcp.gef.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import oscar.OscarFactory;
import oscar.Topic;

//JTJ
import org.eclipse.draw2d.geometry.Rectangle;

public class TopicFactory implements CreationFactory {

	@Override
	public Object getNewObject() {
		//return OscarFactory.eINSTANCE.createTopic();
		// JTJ
		Topic object = OscarFactory.eINSTANCE.createTopic();
		object.setConstraints(new Rectangle(0, 0, 20, 20));
		return object;
	}

	@Override
	public Object getObjectType() {
		return Topic.class;
	}

}
