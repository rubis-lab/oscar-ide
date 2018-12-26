package org.rubis.oscar.rcp.gef.editor;


import org.eclipse.gef.palette.ConnectionCreationToolEntry;
import org.eclipse.gef.palette.CreationToolEntry;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.SelectionToolEntry;

import org.rubis.oscar.rcp.gef.editor.factory.OSCARPublishSubscribeLinkFactory;
import org.rubis.oscar.rcp.gef.editor.factory.OSCARLinkFactory;
import org.rubis.oscar.rcp.gef.editor.factory.NodeFactory;
import org.rubis.oscar.rcp.gef.editor.factory.TopicFactory;
import org.rubis.oscar.rcp.gef.editor.tool.CreationAndDirectEditTool;


public class OSCARGraphicalEditorPalette extends PaletteRoot {

	PaletteGroup group;
	
	public OSCARGraphicalEditorPalette() {
		addGroup();
		addSelectionTool();
		addNodeTool();
		addTopicTool();
		addOPMLinkTool();
		//addOPMProceduralLinkTools();
		//addOPMStructuralLinkTools();
		//addOscarCodeCreationTool();
	}
	
	private void addSelectionTool() {
		SelectionToolEntry entry = new SelectionToolEntry();
		group.add(entry);
		setDefaultEntry(entry);
	}
	
	private void addGroup() {
		group = new PaletteGroup("OPM Controls");
		add(group); 
	}
	
	private void addNodeTool() {
		CreationToolEntry entry = new CreationToolEntry("Node", "Create a new Node",new NodeFactory(),null,null);
		entry.setToolClass(CreationAndDirectEditTool.class);
		group.add(entry);
	}
	
	private void addTopicTool() {
		CreationToolEntry entry = new CreationToolEntry("Topic", "Create a new Topic",new TopicFactory(),null,null);
		entry.setToolClass(CreationAndDirectEditTool.class);
		group.add(entry);
	}
	
	private void addOPMLinkTool() {
		ConnectionCreationToolEntry entry = new ConnectionCreationToolEntry("Link","Create a new link",new OSCARPublishSubscribeLinkFactory(),null,null);
		group.add(entry);
	}
	
	/*private void addOPMProceduralLinkTools() {
		ConnectionCreationToolEntry entry;
		entry = new ConnectionCreationToolEntry("Agent","Create a new Agent Link",new OPMAgentLinkFactory(),null,null);
		group.add(entry);
		entry = new ConnectionCreationToolEntry("Instrument","Create a new Instrument Link",new OPMInstrumentLinkFactory(),null,null);
		group.add(entry);
		entry = new ConnectionCreationToolEntry("Consumption","Create a new Consumption Link",new OSCARPublishSubscribeLinkFactory(),null,null);
		group.add(entry);
		entry = new ConnectionCreationToolEntry("Result","Create a new Result Link",new OPMResultLinkFactory(),null,null);
		group.add(entry);
		entry = new ConnectionCreationToolEntry("Effect","Create a new Effect Link",new OPMEffectLinkFactory(),null,null);
		group.add(entry);
	}
	
	private void addOPMStructuralLinkTools() {
		ConnectionCreationToolEntry entry;
		entry = new ConnectionCreationToolEntry("Aggregation","Create a new Aggregation link",new OPMAggregationStructuralLinkAggregatorFactory(),null,null);
		group.add(entry);
		entry = new ConnectionCreationToolEntry("Exhibition","Create a new Exhibition link",new OPMExhibitionStructuralLinkAggregatorFactory(),null,null);
		group.add(entry);
		entry = new ConnectionCreationToolEntry("Generalization","Create a new Generalization link",new OPMGeneralizationStructuralLinkAggregatorFactory(),null,null);
		group.add(entry);
	}
	
	private void addOscarCodeCreationTool() {
		CreationToolEntry entry = new CreationToolEntry("OscarCode","Create a new Code",new OscarCodeFactory(),null,null);
		entry.setToolClass(FileCreationTool.class);
		group.add(entry);
	}*/
	
	
}
