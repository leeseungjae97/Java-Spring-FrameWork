package com.mycompany.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

public class SessionCheckInterception implements HandlerInterceptor {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handle) {
		HttpSession session = request.getSession(false);
		//이전에 session이 존재했다면 session 반환
		//session이 존재하지 않다면 false를 반환
		
		if(session == null ) {
			//session이 비어있다면 return
			return false;
		}
		if(session.getAttribute("loginInfo") == null ) {
			//로그인한 정보가 존재하지 않다면 return
			return false;
		}
		
		return true;
	}
}
