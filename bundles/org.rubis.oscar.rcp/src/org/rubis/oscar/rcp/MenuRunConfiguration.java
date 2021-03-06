package org.rubis.oscar.rcp;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MBasicFactory;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

public class MenuRunConfiguration {

	@Execute
	public void execute(final MApplication application, EPartService partService, EModelService modelService) {
		// Create the window
		final MWindow window = MBasicFactory.INSTANCE.createWindow();
		//window.getTags().add("temporaryObject");		
		
		MPart part = modelService.createModelElement(MPart.class);
		part.setContributionURI("platform:/plugin/org.rubis.oscar.rcp/org.rubis.oscar.rcp.EditRunConfiguration");
		window.getChildren().add(part);	

		application.getChildren().add(window);
		
		window.setHeight(300);
		window.setWidth(300);
	}
}
