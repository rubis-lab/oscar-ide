package org.rubis.oscar.rcp.gef.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import oscar.OscarFactory;
import oscar.Node;

//JTJ
import org.eclipse.draw2d.geometry.Rectangle;


public class NodeFactory implements CreationFactory {

	@Override
	public Object getNewObject() {
		// return OscarFactory.eINSTANCE.createNode();
		// JTJ
		Node object = OscarFactory.eINSTANCE.createNode();
		object.setConstraints(new Rectangle(0, 0, 20, 20));
		return object;
	}

	@Override
	public Object getObjectType() {
		return Node.class;
	}

}
