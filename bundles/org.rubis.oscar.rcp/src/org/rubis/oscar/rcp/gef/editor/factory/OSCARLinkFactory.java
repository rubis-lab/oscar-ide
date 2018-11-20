package org.rubis.oscar.rcp.gef.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import oscar.OscarFactory;
import oscar.OSCARLink;

public class OSCARLinkFactory implements CreationFactory {

	@Override
	public Object getNewObject() {
		return OscarFactory.eINSTANCE.createOSCARLink();
	}

	@Override
	public Object getObjectType() {
		return OSCARLink.class;
	}

}
