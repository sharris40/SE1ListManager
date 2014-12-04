package com.seproject.JavaMail;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;

public class JavaMail{
	private Properties properties;
	private Session session;
	private Message message;
	private BodyPart body;
	private String attachmentName;
	private Multipart multiPart;
	private DataSource source;
	private Folder emailFolder;
	private String from;
	private String destination;
	private BufferedReader reader;
	private Date sent;
	private PasswordAuthentication authenticate;
	private Store store;
	
	public JavaMail(){
		
	}
	
	public Properties getProperties() {return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	public Session getSession() {
		return session;
	}
	public void setSession(Session session) {
		this.session = session;
	}
	public Message getMessage() {
		return message;
	}
	public void setMessage(Message message) {
		this.message = message;
	}
	public BodyPart getBody() {
		return body;
	}
	public void setBody(BodyPart body) {
		this.body = body;
	}
	public String getAttachmentName() {
		return attachmentName;
	}
	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
	}
	public Multipart getMultiPart() {
		return multiPart;
	}
	public void setMultiPart(Multipart multiPart) {
		this.multiPart = multiPart;
	}
	public DataSource getSource() {
		return source;
	}
	public void setSource(DataSource source) {
		this.source = source;
	}
	public Folder getEmailFolder() {
		return emailFolder;
	}
	public void setEmailFolder(Folder emailFolder) {
		this.emailFolder = emailFolder;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public BufferedReader getReader() {
		return reader;
	}
	public void setReader(BufferedReader reader) {
		this.reader = reader;
	}
	public Date getSent() {
		return sent;
	}
	public void setSent(Date sent) {
		this.sent = sent;
	}
	public PasswordAuthentication getAuthenticate() {
		return authenticate;
	}
	public void setAuthenticate(PasswordAuthentication authenticate) {
		this.authenticate = authenticate;
	}
	public Store getStore() {
		return store;
	}
	public void setStore(Store store) {
		this.store = store;
	}

};