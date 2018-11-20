package org.rubis.oscar.rcp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.inject.Inject;

import org.eclipse.core.databinding.ObservablesManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Text;
import org.rubis.oscar.ftp.OSCARFTPClient;
import org.rubis.oscar.xml2ros.*;
import org.rubis.oscar.oscar2xml.*;


public class EditRunConfiguration{
	
	@Inject
	
	private ObservablesManager manager = new ObservablesManager();
	
	@Inject
	public EditRunConfiguration(final Composite container) {
		
		manager.runAndCollect(new Runnable() {			
			public void run() {
				createUI(container);	
			}
		});	
	}
		
    private void createUI(Composite container) {
    	
    	final Composite parent = new Composite(container,SWT.NONE);
		parent.setLayout(new GridLayout(2, false));		
		
		Label addressLabel = new Label(parent, SWT.NONE);							
		addressLabel.setText("Address:");	
		
		final Text addressText = new Text(parent, SWT.BORDER);
		GridData gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		addressText.setLayoutData(gridData);	
		
		
		Label ftpLabel = new Label(parent, SWT.NONE);							
		ftpLabel.setText("FTP Port:");
	
		
		final Text ftpText = new Text(parent, SWT.BORDER);
		gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		ftpText.setLayoutData(gridData);
		
		
		Label userLabel = new Label(parent, SWT.NONE);							
		userLabel.setText("User:");
	
		
		final Text userText = new Text(parent, SWT.BORDER);
		gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		userText.setLayoutData(gridData);
		
		
		Label passwordLabel = new Label(parent, SWT.NONE);							
		passwordLabel.setText("Password:");
	
		
		final Text passwordText = new Text(parent, SWT.BORDER | SWT.PASSWORD);
		gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		passwordText.setLayoutData(gridData);
		
		
		Label locationLabel = new Label(parent, SWT.NONE);							
		locationLabel.setText("Location:");
	
		
		final Text locationText = new Text(parent, SWT.BORDER);
		gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		locationText.setLayoutData(gridData);		
		
		
		Button applyButton = new Button(parent, SWT.PUSH);
		applyButton.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
		applyButton.setText("Apply");
		
		Button runButton = new Button(parent, SWT.PUSH);
		runButton.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
		runButton.setText("Run");
		
		applyButton.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent event) {
				
				 FileDialog fileDialog = new FileDialog(parent.getShell(), SWT.SAVE);
			     fileDialog.setText("Save");
			     fileDialog.setFilterPath("C:\\");
			     String[] filterExt = { "*.setting", "*.*" };
			     fileDialog.setFilterExtensions(filterExt);
			     String selected = fileDialog.open();
			     
			     if (selected == null)
			          return;

			     File file = new File(selected);
			     
			     try {
			          
			    	  BufferedWriter fileWriter = new BufferedWriter( new FileWriter(file));
			          fileWriter.write("Address: "+ addressText.getText());
			          fileWriter.newLine();
			          fileWriter.flush();
			          fileWriter.write("FTP Port: "+ ftpText.getText());
			          fileWriter.newLine();
			          fileWriter.flush();
			          fileWriter.write("User: "+ userText.getText());
			          fileWriter.newLine();
			          fileWriter.flush();
			          fileWriter.write("Password: "+ passwordText.getText());
			          fileWriter.newLine();
			          fileWriter.flush();
			          fileWriter.write("Location: "+ locationText.getText());
			          fileWriter.newLine();
			          fileWriter.flush();
			          fileWriter.close();
			          
			        } catch (IOException e) {
			          MessageBox messageBox = new MessageBox(parent.getShell(), SWT.ICON_ERROR| SWT.OK);
			          messageBox.setMessage("File I/O Error.");
			          messageBox.setText("Error");
			          messageBox.open();
			          return;
			        }			
				}	  	
		});				
		
		
		runButton.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent event) {
				OSCAR2XML oscar2xml = new OSCAR2XML();
				try {
					//oscar2xml.convert("workspace" + File.separator + "My" + File.separator + "debugoutfromrcp.txt");
					oscar2xml.preprocessXML("workspace" + File.separator + "My" + File.separator + "My.oscar");
					oscar2xml.parseOSCAR();
					oscar2xml.writeXML();
				} catch (Exception e) {
					e.printStackTrace();
				}
				/*
				System.out.println("Start FTP Test");
				try {
					OSCARFTPClient oscarftp = new OSCARFTPClient(addressText.getText(), userText.getText(), passwordText.getText());
					oscarftp.testOSCARFTP();
				} catch(Exception e) {
					e.printStackTrace();
				}
				System.out.println("End FTP Test");
				
				System.out.println("Start XML2ROS Test");
					XML2ROS xr = new XML2ROS();
					xr.testXML2ROS();
					
				System.out.println("End XML2ROS Test");
				*/
				/*
				try {
				OSCARFTPClient oscarftp = new OSCARFTPClient(addressText.getText(), userText.getText(), passwordText.getText()); 
				oscarftp.uploadDirectory("C:\\", locationText.getText());
				//oscarftp.OSCAR();
				oscarftp.disconnect();
				System.out.println("End");
				} catch(Exception e) {					
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				*/
			
			}
		});
    }
}
	
	

