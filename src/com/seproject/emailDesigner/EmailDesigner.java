package src.com.seproject.emailDesigner;

import src.com.seproject.emailClientMgmtCore.EmailMessage;
//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : EmailDesigner.java
//  @ Date : 11/16/2014
//  @ Author : 
//
//
import src.com.seproject.emailClientMgmtCore.RTFdoc;




/** */
public class EmailDesigner {
	/** */
	private EmailMessage saveMessage;
	
	/** */
	private EmailMessage loadMessage;
	
	/** */
	private EmailMessage currentMessage;
	
	/** */
	private EmailMessage undo;
	
	/** */
	private EmailMessage redo;
	
	/** */
	public void SaveMessage() {
	
	}
	
	/** */
	public EmailMessage redo() {
		return currentMessage;
	
	}
	
	/** */
	public EmailMessage undo() {
		return currentMessage;
	
	}
	
	/** */
	public void AutoSave() {
	
	}
	
	/** */
	public RTFdoc LoadMessage() {
		return null;
	
	}
	
	/** */
	public void SendMessage() {
	
	}
}