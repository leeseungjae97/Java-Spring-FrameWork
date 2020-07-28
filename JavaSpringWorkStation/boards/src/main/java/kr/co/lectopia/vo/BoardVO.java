package kr.co.lectopia.vo;

import java.sql.Timestamp;

public class BoardVO {
	private int id;
	private int mainId;
	private int subId;
	private String email;
	private String subject;
	private String context;
	private Timestamp registeredAt;
	private Timestamp removeAt;
	
	public BoardVO() {}

	public BoardVO(int id, int mainId, int subId, String email, String subject, String context, Timestamp registeredAt,
			Timestamp removeAt) {
		super();
		this.id = id;
		this.mainId = mainId;
		this.subId = subId;
		this.email = email;
		this.subject = subject;
		this.context = context;
		this.registeredAt = registeredAt;
		this.removeAt = removeAt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMainId() {
		return mainId;
	}

	public void setMainId(int mainId) {
		this.mainId = mainId;
	}

	public int getSubId() {
		return subId;
	}

	public void setSubId(int subId) {
		this.subId = subId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public Timestamp getRegisteredAt() {
		return registeredAt;
	}

	public void setRegisteredAt(Timestamp registeredAt) {
		this.registeredAt = registeredAt;
	}

	public Timestamp getRemoveAt() {
		return removeAt;
	}

	public void setRemoveAt(Timestamp removeAt) {
		this.removeAt = removeAt;
	}

	@Override
	public String toString() {
		return "BoardVO [id=" + id + ", mainId=" + mainId + ", subId=" + subId + ", email=" + email + ", subject="
				+ subject + ", context=" + context + ", registeredAt=" + registeredAt + ", removeAt=" + removeAt + "]";
	}
	
	
}
