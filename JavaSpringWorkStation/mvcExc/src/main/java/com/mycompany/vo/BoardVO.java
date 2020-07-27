package com.mycompany.vo;

import java.sql.Timestamp;

public class BoardVO {
	private int id;
	private int sid;
	private int ssid;
	private String email;
	private String content;
	private Timestamp regiDate;
	private int regiCount;
	
	public BoardVO() {}
	
	public BoardVO(int id, int sid, int ssid, String email, String content, Timestamp regDate, int regiCount) {
		super();
		this.id = id;
		this.sid = sid;
		this.ssid = ssid;
		this.email = email;
		this.content = content;
		this.regiDate = regDate;
		this.regiCount = regiCount;
	}
	
	public int getId() {	return id;}
	public void setId(int id) {	this.id = id;}
	public int getSid() {	return sid;}
	public void setSid(int sid) {	this.sid = sid;}
	public int getSsid() {	return ssid;}
	public void setSsid(int ssid) {	this.ssid = ssid;}
	public String getEmail() {return email;}
	public void setEmail(String email) {	this.email = email;}
	public String getContent() {	return content;}
	public void setContent(String content) {	this.content = content;}
	public Timestamp getRegiDate() {	return regiDate;}
	public void setRegiDate(Timestamp regDate) {	this.regiDate = regDate;}
	public int getRegiCount() {	return regiCount;}
	public void setRegiCount(int regiCount) {	this.regiCount = regiCount;}

	@Override
	public String toString() {
		return "BoardVO [id=" + id + ", sid=" + sid + ", ssid=" + ssid + ", email=" + email + ", content=" + content
				+ ", regDate=" + regiDate + ", regiCount=" + regiCount + "]";
	}
	
	
}
