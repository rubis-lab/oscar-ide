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
	
	public void uploadFile(String localFileFullName, String fileName, String hostDir) throws Exception {
		try(InputStream input = new FileInputStream(new File(localFileFullName))){
			this.ftp.storeFile(hostDir + fileName, input);
		}
	}
	
	public void disconnect( ) {
		if (this.ftp.isConnected()) {
			try {
				this.ftp.logout();
				this.ftp.disconnect();
			} catch (IOException f) {
				f.printStackTrace();
			}
		}
	}
}
