package org.rubis.oscar.ftp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io. InputStream;
import java.io.PrintWriter;

import org.apache.commons.net.PrintCommandListener;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;


public class OSCARFTPClient {
	FTPClient ftp = null;
	
	public OSCARFTPClient(String host, String user, String pwd) throws Exception {
		ftp = new FTPClient();
		ftp.addProtocolCommandListener(new PrintCommandListener(new PrintWriter(System.out)));
		int reply;
		ftp.connect(host);
		reply = ftp.getReplyCode();
		if(!FTPReply.isPositiveCompletion(reply)) {
			ftp.disconnect();
			throw new Exception("Exception in connecting to FTP Server");
		}
		ftp.login(user, pwd);
		ftp.setFileType(FTP.BINARY_FILE_TYPE);
		ftp.enterLocalPassiveMode();
	}

	
	public void uploadDirectory(String currDir, String currHostDir) throws Exception {
		File dir = new File(currDir);
		File[] fileList = dir.listFiles();
		
		// Create directory
		System.out.println("currentLocalDir:" + currDir);
		
		boolean dirExists = this.ftp.changeWorkingDirectory(currHostDir);
		if(dirExists) {
			System.out.println("Dir exists!");
		} else {
			System.out.println("No dir, creating one.");
			this.ftp.makeDirectory(currHostDir);
			this.ftp.changeWorkingDirectory(currHostDir);
		}

		// Append files
		if(fileList != null) {
			for(File child : fileList) {
				// upload files
				if(!child.isDirectory()) {
					System.out.println("Uploading file: " + child.getAbsolutePath());
					System.out.println("Name: " + child.getName());
					uploadFile(child.getAbsolutePath(), child.getName(), currHostDir);
				
				// upload nested directory
				} else {
					System.out.println("Directory..");
					
					System.out.println("curr host dir:" + currHostDir);
					System.out.println("new host dir: " +  currHostDir + child.getName() + "/");
					
					uploadDirectory(child.getPath(), currHostDir + child.getName() + "/");
				}
			}
		}
		
	}
	
	public void uploadFile(String localFileFullName, String fileName, String hostDir) throws Exception {
		try(InputStream input = new FileInputStream(new File(localFileFullName))){
			this.ftp.storeFile(hostDir + fileName, input);
		}
	}
	
	public void disconnect() {
		if (this.ftp.isConnected()) {
			try {
				this.ftp.logout();
				this.ftp.disconnect();
			} catch (IOException f) {
				f.printStackTrace();
			}
		}
	}
	
	public void testOSCARFTP() {
		System.out.println("OSCAR FTP Test");
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println("Start");
		OSCARFTPClient oscarftp = new OSCARFTPClient("147.46.121.131", "nvidia", "nvidia");
		oscarftp.uploadDirectory("C:\\Users\\upoque\\aaa", "/home/nvidia/aaa/");
		oscarftp.disconnect();
		System.out.println("End");
		
	}
}
