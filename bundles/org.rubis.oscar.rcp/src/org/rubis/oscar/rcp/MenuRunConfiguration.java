package org.rubis.oscar.rcp;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MBasicFactory;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimmedWindow;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

public class MenuRunConfiguration {

	@Execute
	public void execute(final MApplication application, EPartService partService, EModelService modelService) {
		// Create the window
		final MTrimmedWindow window = MBasicFactory.INSTANCE.createTrimmedWindow();
		//window.getTags().add("temporaryObject");		
		window.setHeight(1000);
		window.setWidth(1000);
		
		MPart part = modelService.createModelElement(MPart.class);
		part.setContributionURI("platform:/plugin/org.rubis.oscar.rcp/org.rubis.oscar.rcp.EditRunConfiguration");
		window.getChildren().add(part);	
		
		
		application.getChildren().add(window);
	}
}
