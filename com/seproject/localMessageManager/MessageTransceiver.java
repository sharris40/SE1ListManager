package com.seproject.localMessageManager;

import com.seproject.emailClientMgmtCore.EmailMessage;
import com.seproject.emailClientMgmtCore.Email_Client_Management_Core;




/** */
public interface MessageTransceiver {

	/** */
	public EmailMessage getEmailMessage(int userID);
	
	/** */
	public EmailMessage getEmailMessageRTF(int userID);
	
	/** */
	public Email_Client_Management_Core getCoreManager();
	
}
