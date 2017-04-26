package org.aman.java.mail.model;

import java.io.File;
import java.util.ArrayList;


public class EmailModel {
	public String from;
	public ArrayList<String> to;
	public ArrayList<String> cc;
	public String subject;
	public String body;
	public File file;
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public ArrayList<String> getTo() {
		return to;
	}
	public void setTo(ArrayList<String> to) {
		this.to = to;
	}
	public ArrayList<String> getCc() {
		return cc;
	}
	public void setCc(ArrayList<String> cc) {
		this.cc = cc;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public EmailModel(String from, ArrayList<String> to, ArrayList<String> cc, String subject, String body, File file) {
		this.from = from;
		this.to = to;
		this.cc = cc;
		this.subject = subject;
		this.body = body;
		this.file = file;
	}
	public EmailModel() {
	}
	
	

}
