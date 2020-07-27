package com.example.springmvc;

import java.util.List;

public class Student {
	private Info info;
	private List<Integer> jumsu;
	
	public Student() {}

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

	public List<Integer> getJumsu() {
		return jumsu;
	}

	public void setJumsu(List<Integer> jumsu) {
		this.jumsu = jumsu;
	}

	public Student(Info info, List<Integer> jumsu) {
		super();
		this.info = info;
		this.jumsu = jumsu;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Student [info=" + info.toString());
		for(Integer j : jumsu) {
			sb.append("" + j);
		}
		return sb.toString();
		
	}
	
}
