package com.seproject.mainFacade;

import java.util.Properties;

import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.URLName;

import com.seproject.JavaMail.JavaMail;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : UserSystemConfiguration.java
//  @ Date : 11/16/2014
//  @ Author : 
//
//




/** */
public class UserSystemConfiguration {
	/** */
	private Properties properties;

	/** */
	private String currentServerAddress;
	/** */
	private String currentSendAddress;
	
	/** */
	private  String currentReplyAddress;
	
	public UserSystemConfiguration(){
		
	}
	
	private String username;
	private String password;
	
	public  UserSystemConfiguration(JavaMail jmail, String user, String pass) {
		properties = System.getProperties();
		this.username = user;
		this.password = pass;
		
		
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
		
		Session session = Session.getInstance(properties,
				new javax.mail.Authenticator(){
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(username, password);
					}
		});
		
		
		jmail.setProperties(properties);
		jmail.setSession(session);
		
	}
	/** */
	
	public void SetUserAndPass(String usern, String pass){
		this.username = usern;
		this.password = pass;
	}

	public void setUserName(String value) {this.username = value;}
	public void setPassword(String value) {this.password = value;}
	public void configureSystem(Properties properties) {
		this.properties = properties;
	}
	
	/** */
	public void Authenticate(JavaMail jmail) {
		Session session = Session.getInstance(properties,
				new javax.mail.Authenticator(){
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(username, password);
					}
		});
		
		
		jmail.setProperties(properties);
		jmail.setSession(session);
	}
	
	/** */
	public void configureSendAddress() {
		//to be filled with Bob's Facade 
	}
	
	/** */
	public void configureReplyAddress() {
		//to be filled with Bob's Facade 
	}
	
	/** */
	public void restoreToDefault() {
		//to be filled with Bob's Facade 
	}
	
	/** */
	public void configureDefaultEmailOperations() {
		//to be filled with Bob's Facade 
	}
}
