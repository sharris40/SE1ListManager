package src.com.seproject.mainFacade;

import src.com.seproject.emailClientMgmtCore.Email_Client_Management_Core;
import src.com.seproject.summit.Summit;
//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : CFP_Application.java
//  @ Date : 11/16/2014
//  @ Author : 
//
//
import src.com.seproject.summit.SummitAnnouncer;
import src.com.seproject.summit.SummitObserver;




/** */
public class CFP_Application implements SummitObserver {
	/** */
	private Email_Client_Management_Core emailClient;
	/** */
	private User user;
	
	/** */
	private SummitAnnouncer eventNotification;
	
	/** */
	public void LinkSystems(User user, Email_Client_Management_Core emailClient, SummitAnnouncer event) {
		this.user = user;
		this.emailClient = emailClient;
		this.eventNotification = event;
	}
	
	/** */
	public Email_Client_Management_Core getClientCore() {
		return emailClient;
	}
	
	/** */
	public void runProgram() {
	
	}

	@Override
	public void notify(Summit summit) {
		// TODO Auto-generated method stub
	}
}
