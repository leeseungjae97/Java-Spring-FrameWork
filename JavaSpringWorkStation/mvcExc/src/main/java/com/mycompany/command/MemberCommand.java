package com.mycompany.command;


public class MemberCommand {
	private String email;
	private String pass;
	private String passCheck;
	private String nick;
	
	public MemberCommand() {}
	
	public MemberCommand(String email, String pass, String passCheck, String nick) {
		super();
		this.email = email;
		this.pass = pass;
		this.passCheck = passCheck;
		this.nick = nick;
	}
	
	public String getEmail() {	return email;}
	public void setEmail(String email) {	this.email = email;}
	public String getPass() {	return pass;}
	public void setPass(String pass) {	this.pass = pass;}
	public String getPassCheck() {return passCheck;}
	public void setPassCheck(String passCheck) {	this.passCheck = passCheck;}
	public String getNick() {	return nick;}
	public void setNick(String nick) {	this.nick = nick;}

	@Override
	public String toString() {
		return "MemberCommand [email=" + email + ", pass=" + pass + ", passCheck=" + passCheck + ", nick=" + nick + "]";
	}
}
