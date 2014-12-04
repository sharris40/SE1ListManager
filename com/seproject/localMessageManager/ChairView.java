package com.seproject.localMessageManager;

import java.util.List;

import com.seproject.JavaMail.JavaMail;
import com.seproject.emailClientMgmtCore.EmailMessage;
import com.seproject.emailClientMgmtCore.Email_Client_Management_Core;
import com.seproject.mainFacade.User;




/** */
public class ChairView {
	/** */
	private LocalEmailManager manager;
	//private User user;

	
	public ChairView(){
		manager = new LocalEmailManager();
	}
	/** */
	public EmailMessage composeMessage(String to, String from, String title, String body, String name) {
			return new EmailMessage(to, from, title, body, name);	
	}
	
	/** */
	public void sortAddresses(final Email_Client_Management_Core mail, boolean ascending) {
		mail.sortAddressListr(ascending);
	}
	
	/** */
	public void addAddresses(final Email_Client_Management_Core mail, List<String> list) {
		mail.AddEmailAddress(list);
	}
	
	public void addAddresses(final Email_Client_Management_Core mail, String item){
		mail.AddEmailAddress(item);
	}
	
	/** */
	public void removeAddresses(String list) {
	
	}
	
	/** */
	public void mergeAddressList(String list) {
	
	}
	
	/** */
	public void manageSend_ReceiveAddress() {
	
	}
	
	/** */
	public int getSessionID() {
		return 0;
	
	}
	
	/** */
	public int getChairID() {
		return 0;
	
	}
}
