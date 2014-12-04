package com.seproject.summit;

import java.util.Date;

public class Summit {
	private String name;
	private Date date;
	private String time;
	private String title;
	private String body;
	private int sID;
	
	Summit(String name, String title, String time, Date date, String body, int id){
		this.name = name;
		this.title = title;
		this.time = time;
		this.date = date;
		this.body = body;
		this.sID = id;
	}
	
	public  void setID(int id){
		this.sID = id;
	}
	
	public int getID(){ return sID;}
	
	public String getSummitName(){
		return this.name;
	}
	
	public Date getSummitDate(){
		return this.date;
	}
	
	public String getSummitTime(){
		return this.time;
	}
	
	public String getSummitTitle(){
		return this.title;
	}
	
	public String getSummitBody(){
		return this.body;
	}
}
