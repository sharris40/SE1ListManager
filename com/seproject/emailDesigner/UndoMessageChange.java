package com.seproject.emailDesigner;

import com.seproject.emailClientMgmtCore.EmailMessage;
import com.seproject.emailClientMgmtCore.RTFdoc;
//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : UndoMessageChange.java
//  @ Date : 11/16/2014
//  @ Author : 
//
//




/** */
public class UndoMessageChange extends EmailMessageCommand {
	/** */
	private EmailMessage Message;
	
	/** */
	public EmailMessage Undo() {
		return Message;
	
	}
	
	/** */
	public void execute() {
	
	}
}