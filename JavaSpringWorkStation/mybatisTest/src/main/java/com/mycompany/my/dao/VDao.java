package com.mycompany.my.dao;

import java.util.ArrayList;

import com.mycompany.my.dto.VisionDto;

public interface VDao {
	public ArrayList<VisionDto> listDao();
	public void writeDao(String day,String content);
	public VisionDto viewDao(String strID);
	public void deleteDao(String bId);
}
