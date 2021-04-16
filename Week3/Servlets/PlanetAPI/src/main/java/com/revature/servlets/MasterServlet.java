package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.controller.RequestHelper;

public class MasterServlet extends HttpServlet {
	
	public void init() throws ServletException {
		super.init();
		System.out.println("I am born!");
	}
	
	
	/*
	 * Servlet implementing master servlet 
	 * 
	 * We chuck in a "/api/" into our endpoint, why? 
	 * 
	 * Because otherwise our servlet will handle ALL the traffic, including out 
	 * 	HTML, css and JS files. 
	 * 
	 * 
	 */
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		 
			HttpServletRequest  request;
	        HttpServletResponse response;
	        
	        if (!(req instanceof HttpServletRequest &&
	                res instanceof HttpServletResponse)) {
	            throw new ServletException("non-HTTP request or response");
	        }

	        request = (HttpServletRequest) req;
	        response = (HttpServletResponse) res;
		
	    RequestHelper requestHelper = new RequestHelper();
	        
		requestHelper.process(request,response);	
	}
	
	

}
