package com.seproject.mainFacade;

import com.seproject.emailClientMgmtCore.Email_Client_Management_Core;
import com.seproject.localMessageManager.ChairView;
import com.seproject.summit.Summit;
import com.seproject.summit.SummitAnnouncer;
import com.seproject.summit.SummitObserver;





/** */
public class CFP_Application implements SummitObserver {
	/** */
	private Email_Client_Management_Core emailClient;
	/** */
	private User user;
	
	private ChairView view;
	/** */
	private SummitAnnouncer eventNotification;
	
	/** */
	

	CFP_Application(String username, String password){
		LinkSystems(new Administrator(), new Email_Client_Management_Core(), new SummitAnnouncer(), username, password);
		
	}
	public void LinkSystems(Administrator user, Email_Client_Management_Core emailClient, SummitAnnouncer event, String usr, String psw) {
		this.user = user;
		this.emailClient = emailClient;
		this.eventNotification = event;
		this.view = new ChairView(new Chair(), emailClient);
		
		if(user.getConfig() == null)
			user.setConfig(new UserSystemConfiguration(emailClient.getJavaMail(), usr , psw));
	}
	
	/** */
	public Email_Client_Management_Core getClientCore() {
		return emailClient;
	}
	
	/** */
	public void runProgram() {
		boolean running = true;
		int option = 0;
		
		while(running){
			switch(option){
			case 0:
				break;
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
	
			};
		}
	}

	
	final public ChairView getVie() {return view;}
	final public Email_Client_Management_Core emailClient() { return emailClient;}
	final public SummitAnnouncer getNotification() { return eventNotification;}
	
	@Override
	public void notify(Summit summit) {
		// TODO Auto-generated method stub
	}
}
