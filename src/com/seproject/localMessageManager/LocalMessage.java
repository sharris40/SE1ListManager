package src.com.seproject.localMessageManager;

import src.com.seproject.emailClientMgmtCore.EmailMessage;
import src.com.seproject.emailClientMgmtCore.Email_Client_Management_Core;
//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : LocalMessage.java
//  @ Date : 11/16/2014
//  @ Author : 
//
//




/** */
public class LocalMessage implements MessageTransceiver {
	/** */
	private EmailMessage localMessage;
	
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
	public Email_Client_Management_Core getContentManager(int userID) {
		// TODO Auto-generated method stub
		return null;
	}
}
