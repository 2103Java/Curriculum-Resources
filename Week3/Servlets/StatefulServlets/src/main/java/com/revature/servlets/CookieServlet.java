package com.revature.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieServlet
 */
@WebServlet("/Cookie")
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/*
	 * Cookie?
	 * 		key: value pair. That server that sends to the client to keep track of state. 
	 * 		cookies are automatically sent with each request. 
	 */
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Cookie[] cookieList = request.getCookies();	
		
		
		for(Cookie c: cookieList) {
			System.out.println(c.getValue());
			if(c.getValue().equals("true")) {
				System.out.println("You have access!!!");
			}
			
		
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		
		if(username != null && password != null) {
			
			
			Cookie evenMoreC = new Cookie("authorised","true");
			
			
			response.addCookie(evenMoreC);
		}
		
		
		
		
	}

}
