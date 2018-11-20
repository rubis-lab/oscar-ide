package org.rubis.oscar.rcp.gef.editor.part;

import oscar.OSCARLink;
import oscar.OSCARProceduralLink;
import oscar.Node;
import oscar.Topic;
import oscar.OSCARObjectProcessDiagram;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

public class OSCAREditPartFactory implements EditPartFactory
{
	@Override
	public EditPart createEditPart(EditPart context, Object model)
	{
		EditPart part = null;
		
		/*part = model instanceof OPMObjectProcessDiagram ? new OPMObjectProcessDiagramEditPart() :
			         		 model instanceof OPMObject ? new OPMObjectEditPart() :
					    	model instanceof OPMProcess ? new OPMProcessEditPart() :
							   model instanceof OPMLink ? new OPMLinkEditPart() : null; // Alex's choice  */
		
		
		if (model instanceof OSCARObjectProcessDiagram) part = new OSCARObjectProcessDiagramEditPart();
		else if (model instanceof Node) part = new NodeEditPart();/*{
			if(model instanceof OscarCode) part = new OscarCodeEditPart();
			else part = new OPMObjectEditPart();
		}*/
		else if (model instanceof Topic) part = new TopicEditPart();
		else if (model instanceof OSCARProceduralLink) part = new OSCARProceduralLinkEditPart();
		else if (model instanceof OSCARLink) part = new OSCARLinkEditPart();		
		else throw new IllegalArgumentException("Model class " +model.getClass()+ " not supported yet.");
		
		if (part != null) part.setModel(model);
		
		
		return part;
	}
}
