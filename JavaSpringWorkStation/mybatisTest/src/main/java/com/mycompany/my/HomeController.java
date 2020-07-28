package com.mycompany.my;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mycompany.my.dao.VDao;
import com.mycompany.my.dto.VisionDto;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private SqlSession sqlSession;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	@RequestMapping("/vision")
	@ResponseBody
	public Map<String, String> androidTestWithRequestAndResponse(HttpServletRequest request){

	        ArrayList<VisionDto> visionDto = new ArrayList<VisionDto>();
	        Map<String, String> result = new HashMap<String, String>();
	        String nowTime = getCurrentTime("YYYY,M,d");
	        String num = "",day = "",content = "";
	      
	        VDao dao = sqlSession.getMapper(VDao.class);
	       
	        dao.writeDao(nowTime,request.getParameter("content"));
	        
	        visionDto = dao.listDao();
	        
	        for(int i=0;i<visionDto.size();i++) {
	        	num += Integer.toString(visionDto.get(i).getNum())+"\t";
	        	day += visionDto.get(i).getDay()+"\t";
	        	content += visionDto.get(i).getContent()+"\t";
	        }

	        result.put("num",num);
	        result.put("day",day);
	        result.put("content",content);

	        return result;
	}

	private String getCurrentTime(String timeFormat) {
	         // TODO Auto-generated method stub
	         return new SimpleDateFormat(timeFormat).format(System.currentTimeMillis());
	}
	
}
