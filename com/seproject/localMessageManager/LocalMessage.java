package com.seproject.localMessageManager;

import com.seproject.emailClientMgmtCore.EmailMessage;
import com.seproject.emailClientMgmtCore.Email_Client_Management_Core;




/** */
public class LocalMessage implements MessageTransceiver {
	/** */
	private EmailMessage localMessage;
    private Email_Client_Management_Core core;
		
	 
	public LocalMessage(Email_Client_Management_Core core){
		this.core = core;
	}
	/** */
	private Integer userID;
	

	/** */
	public EmailMessage SaveAsTemplate() {
		return localMessage;
	
	}
	
	/** */
	public EmailMessage RetreiveTemplate(int userID, int templateID) {
		return localMessage;
	
	}

	@Override
	public EmailMessage getEmailMessage(int userID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmailMessage getEmailMessageRTF(int userID) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	final public Email_Client_Management_Core getCoreManager() {
		return  this.core;
	}
}
