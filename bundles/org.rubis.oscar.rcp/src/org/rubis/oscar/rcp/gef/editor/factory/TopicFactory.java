package org.rubis.oscar.rcp.gef.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import oscar.OscarFactory;
import oscar.Topic;

public class TopicFactory implements CreationFactory {

	@Override
	public Object getNewObject() {
		return OscarFactory.eINSTANCE.createTopic();
	}

	@Override
	public Object getObjectType() {
		return Topic.class;
	}

}
