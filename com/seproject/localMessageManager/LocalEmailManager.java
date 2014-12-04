package com.seproject.localMessageManager;

import com.seproject.emailClientMgmtCore.EmailMessage;
import com.seproject.emailClientMgmtCore.Email_Client_Management_Core;




/** */
public class LocalEmailManager {
	/** */
	private MessageTransceiver message;
	
	public LocalEmailManager(Email_Client_Management_Core core){
		message = new LocalMessage(core);
	}
	
	/** */
	public EmailMessage getEmailMessage(int userID) {
		return null;
	
	}
	
	/** */
	public EmailMessage saveAsTemplate() {
		return null;
	
	}
	
	/** */
	public EmailMessage RetreiveTemplate(int userID, int templateID) {
		return null;
	
	}
}
