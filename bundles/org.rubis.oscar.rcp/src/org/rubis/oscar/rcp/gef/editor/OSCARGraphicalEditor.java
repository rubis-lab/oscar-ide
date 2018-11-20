package org.rubis.oscar.rcp.gef.editor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.EventObject;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor.PropertyValueWrapper;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.ui.actions.ToggleGridAction;
import org.eclipse.gef.ui.actions.ToggleSnapToGeometryAction;
import org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette;
import org.eclipse.gef.ui.properties.UndoablePropertySheetEntry;
import org.eclipse.gef.ui.properties.UndoablePropertySheetPage;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.eclipse.ui.views.properties.PropertySheetPage;

import org.rubis.oscar.rcp.gef.action.OSCARCreateObjectAction;
//import com.oscar.opm.gef.action.OscarCodePathChangeAction;
//import com.oscar.opm.gef.action.OscarCodeModifyAction;
import org.rubis.oscar.rcp.gef.action.ResizeToContentsAction;
import org.rubis.oscar.rcp.gef.editor.part.OSCAREditPartFactory;
import oscar.OSCARObjectProcessDiagram;
import oscar.OscarPackage;
import oscar.provider.OscarItemProviderAdapterFactory;

public class OSCARGraphicalEditor extends GraphicalEditorWithFlyoutPalette 
{
	
	private Resource opdResource;
	private OSCARObjectProcessDiagram opd;
	
	PropertySheetPage propertyPage;
	
	
	public OSCARGraphicalEditor() 
	{
		setEditDomain(new DefaultEditDomain(this));
	}
	
	@Override
	protected void initializeGraphicalViewer() 
	{
		super.initializeGraphicalViewer();
		getGraphicalViewer().setContents(opd);
	}
	
	@Override
	protected void configureGraphicalViewer() 
	{
		super.configureGraphicalViewer();
		getGraphicalViewer().setEditPartFactory(new OSCAREditPartFactory());
        getActionRegistry().registerAction(new ToggleGridAction(getGraphicalViewer())); 
        getActionRegistry().registerAction(new ToggleSnapToGeometryAction(getGraphicalViewer()));
        getGraphicalViewer().setContextMenu(new OSCARGraphicalEditorContextMenuProvider(getGraphicalViewer(),getActionRegistry()));
	}
	
	@Override
	protected void createActions() {
		super.createActions();
		//OscarCodePathChangeAction changeAction = new OscarCodePathChangeAction(this);
		//getActionRegistry().registerAction(changeAction);
		//getSelectionActions().add(changeAction.getId());
		//OscarCodeModifyAction modifyAction = new OscarCodeModifyAction(this);
		//getActionRegistry().registerAction(modifyAction);
		//getSelectionActions().add(modifyAction.getId());
		// create action for contextMenu.
		/*
		ResizeToContentsAction resizeAction = new ResizeToContentsAction(this);
		getActionRegistry().registerAction(resizeAction);
		getSelectionActions().add(resizeAction.getId());
		OPMCreateObjectAction createAction = new OPMCreateObjectAction(this);
		getActionRegistry().registerAction(createAction);
		*/
	}
	
	@Override
	protected PaletteRoot getPaletteRoot() 
	{
		return new OSCARGraphicalEditorPalette();
	}
	
	@Override
	public void doSave(IProgressMonitor monitor) 
	{
		if(opdResource == null) return;
		
		try 
		{
			opdResource.save(null);
			getCommandStack().markSaveLocation();
		} catch(IOException e) {
			e.printStackTrace();
			opdResource = null;
		}
		
		try 
		{
			BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Sonic\\Desktop\\OSCAR IDE Last\\oscar-ide\\repository\\target\\products\\oscar.product\\win32\\win32\\x86_64\\workspace\\d\\My.oscar"));

	        String str = "";
	        String line = null;
	        while ((line = in.readLine()) != null) {
	               str += line;	
	        }
	            
	        in.close();

	        char intxt[] = new char[str.length()];

	        str.getChars(0, str.length(), intxt, 0); // 입력하고자 하는 문자열을 문자배열

	        FileWriter fw = new FileWriter("C:\\Users\\Sonic\\Desktop\\OSCAR IDE Last\\oscar-ide\\repository\\target\\products\\oscar.product\\win32\\win32\\x86_64\\workspace\\d\\My.xml");
	        BufferedWriter bw = new BufferedWriter(fw); // 버퍼를 사용한 객체 bw 생성

	        bw.write(intxt); 
	        bw.close();
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	
	
	@Override
	public void init(IEditorSite site,IEditorInput input) throws PartInitException
	{
		super.init(site, input);
				
		loadInput(input);
	}
	
	private void loadInput(IEditorInput input) 
	{
		OscarPackage.eINSTANCE.eClass();
		ResourceSet resourceSet = new ResourceSetImpl();
		if(input instanceof IFileEditorInput) {
			IFileEditorInput fileInput = (IFileEditorInput) input;
			IFile file = fileInput.getFile();
			opdResource = resourceSet.createResource(URI.createURI(file.getLocationURI().toString()));
			try {
				opdResource.load(null);
				opd = (OSCARObjectProcessDiagram) opdResource.getContents().get(0);
			} catch (IOException e) {
				e.printStackTrace();
				opdResource = null;
			}
		}
	}
	
	@Override
	public void commandStackChanged(EventObject event) 
	{
		firePropertyChange(PROP_DIRTY);
		super.commandStackChanged(event);
	}
	
	/**
     * This method implements adapting to {@link IPropertySheetPage}. All other requests are
     * forwarded to the {@link GraphicalEditorWithFlyoutPalette#getAdapter(Class) parent}
     * implementation.
     */
	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class type) 
	{
		if(type.equals(IPropertySheetPage.class)) 
		{
			if(propertyPage == null) 
			{
				propertyPage = (UndoablePropertySheetPage) super.getAdapter(type);
				// A new PropertySourceProvider was implemented to fetch the model
	            // from the edit part when required. The property source is provided
	            // by the generated EMF classes and wrapped by the AdapterFactoryContentProvider
	            // to yield standard eclipse interfaces.
				IPropertySourceProvider sourceProvider = new IPropertySourceProvider()
				{
					IPropertySourceProvider modelPropertySourceProvider = new AdapterFactoryContentProvider(new OscarItemProviderAdapterFactory());
				
					@Override
					public IPropertySource getPropertySource(Object object) 
					{
						IPropertySource source = null;
						if(object instanceof EditPart) source = modelPropertySourceProvider.getPropertySource(((EditPart) object).getModel());
						else source = modelPropertySourceProvider.getPropertySource(object);
						
						if(source != null) return new UnwrappingPropertySource(source);
						else return null;
					}
				};
				UndoablePropertySheetEntry root = new UndoablePropertySheetEntry(getCommandStack());
				root.setPropertySourceProvider(sourceProvider);
				propertyPage.setRootEntry(root);
			}
			return propertyPage;
		}
		return super.getAdapter(type);
	}
	
	/**
     * A property source which unwraps values that are wrapped in an EMF
     * {@link PropertyValueWrapper}
     *
     *
     */
	public class UnwrappingPropertySource implements IPropertySource
	{
		private IPropertySource source;
		
		public UnwrappingPropertySource(final IPropertySource source)
		{
			this.source = source;
		}
		
		@Override
		public Object getEditableValue() 
		{
			Object value = source.getEditableValue();
			if(value instanceof PropertyValueWrapper)
			{
				PropertyValueWrapper wrapper = (PropertyValueWrapper) value;
				return wrapper.getEditableValue(null);
			}
			else 
			{
				return source.getEditableValue();
			}
		}
		
		@Override
		public IPropertyDescriptor[] getPropertyDescriptors() 
		{
			return source.getPropertyDescriptors();
		}
		
		@Override
		public Object getPropertyValue(Object id)
		{
			Object value = source.getPropertyValue(id);
			if(value instanceof PropertyValueWrapper)
			{
				PropertyValueWrapper wrapper =  (PropertyValueWrapper) value;
				return wrapper.getEditableValue(null);
			}
			else 
			{
				return source.getPropertyValue(id);
			}
		}
		
		@Override
		public boolean isPropertySet(Object id)
		{
			return source.isPropertySet(id);
		}
		
		@Override
		public void resetPropertyValue(Object id) 
		{
			source.resetPropertyValue(id);
		}
		
		@Override
		public void setPropertyValue(Object id,Object value)
		{
			source.setPropertyValue(id, value);
		}
	}
	/*
	 
	 
	/**
	 * Override superclass's method (protected) to public
	 * to provide Editdomain to {@link OPMCreateObjectAction}
	 
	@Override
	public DefaultEditDomain getEditDomain() {
		return super.getEditDomain();
	}
	
	*/
}
