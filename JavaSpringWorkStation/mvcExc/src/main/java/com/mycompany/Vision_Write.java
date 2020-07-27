/*
 * package com.mycompany;
 * 
 * import java.sql.Connection; import java.sql.PreparedStatement; import
 * java.sql.ResultSet; import java.text.SimpleDateFormat;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.jdbc.core.JdbcTemplate;
 * 
 * 
 * public class Vision_Write { private static Vision_Write vision = new
 * Vision_Write();
 * 
 * @Autowired private JdbcTemplate jTemp;
 * 
 * public static Vision_Write getWrite() { return vision; }
 * 
 * public String write(String content1, String content2) { String sql =
 * "INSERT INTO parts VALUES(?, ?)"; int result =jTemp.update(sql, content1,
 * content2); if(result == 0 ) { System.out.println("입력실패"); return ""; } } }
 */