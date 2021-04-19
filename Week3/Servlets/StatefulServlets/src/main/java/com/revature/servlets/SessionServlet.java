package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.models.User;


@WebServlet("/Session")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getSession().invalidate();

//		HttpSession session = request.getSession(false);//will return null or grab a session. 
//		
//		System.out.println(session.getAttribute("user"));
//		
//		if(session == null) {
//			System.out.println("Get a session!");
//		
//		}else {
//			if(((User) session.getAttribute("user")).isAdminAccess()) {
//				System.out.println("Welcome Admin!");
//			}else {
//				System.out.println("Welcome client!");
//			}
//		}

		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Creating a session. 
		//Session is kept track of internally, i.e. inside the server. 
		
		HttpSession session = request.getSession(); //will create or grab an existing session
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		session.setAttribute("user", new User(username,password,false));
		session.setAttribute("name", "bobby");
		
		response.setStatus(201);
		
		request.getRequestDispatcher("index.html").forward(request, response);
		
		
		
//		response.sendRedirect("http://localhost:9000/StatefulServlets/api/super/secret/22/1/1/2/43/4");
		
		
		
	}

}
