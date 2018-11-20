package org.rubis.oscar.rcp.gef.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import oscar.OscarFactory;
import oscar.OSCARProceduralLink;
import oscar.OSCARProceduralLinkKind;

public class OSCARPublishSubscribeLinkFactory implements CreationFactory {

	@Override
	public Object getNewObject() {
		OSCARProceduralLink link = OscarFactory.eINSTANCE.createOSCARProceduralLink();
		link.setKind(OSCARProceduralLinkKind.PUBLISH_SUBSCRIBE);
		return link;
	}

	@Override
	public Object getObjectType() {
		return OSCARProceduralLink.class;
	}

}
