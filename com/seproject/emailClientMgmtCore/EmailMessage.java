package com.seproject.emailClientMgmtCore;


//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : EmailMessage.java
//  @ Date : 11/16/2014
//  @ Author : 
//
//




/** */
public class EmailMessage implements MessageI {
	private String body;
	private String from;
	private String title;
	private String to;
	private int eID;
	private String tName;
	
	public EmailMessage(String to, String from, String title, String body, String tName){
		this.to = to;
		this.from = from;
		this.title = title;
		this.body = body;
		this.tName = tName;
	}
	
	EmailMessage(){
		body = from = title = to = " ";
	}
	
	public String getBody() {return body;}
	public String getFrom() {return from;}
	public String getTitle() {return title;}
	public String getTo() {return to;}
	public String getName() {return tName;}
	
	@Override
	public void setFormat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getSenderID() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setEID(int value) {eID = value;}
	@Override
	public void SendMessage() {
		// TODO Auto-generated method stub
		
	}
	

	public int getID(){return eID;}
	
	@Override
	public void SaveMessage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public RTFdoc LoadMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void AutoSave() {
		// TODO Auto-generated method stub	
	}

	@Override
	public EmailMessage Undo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmailMessage Redo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RTFdoc getRTFCommands() {
		// TODO Auto-generated method stub
		return null;
	}
}
