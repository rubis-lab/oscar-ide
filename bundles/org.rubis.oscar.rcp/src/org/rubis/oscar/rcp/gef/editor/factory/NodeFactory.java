package org.rubis.oscar.rcp.gef.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import oscar.OscarFactory;
import oscar.Node;


public class NodeFactory implements CreationFactory {

	@Override
	public Object getNewObject() {
		return OscarFactory.eINSTANCE.createNode();
	}

	@Override
	public Object getObjectType() {
		return Node.class;
	}

}
