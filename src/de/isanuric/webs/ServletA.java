package de.isanuric.webs;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletA
 */
//@WebServlet("/servleta")
public class ServletA extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     //reading the user input
	    String uid = request.getParameter("uid");    
	    String pass = request.getParameter("pass");
	    
//	    if (uid.equals("isan") && pass.equals("isan")) {
	    if(true) {
	    		HttpSession session = request.getSession();
	    		session.setAttribute("uid", uid);
	    		response.sendRedirect("welcome.jsp");
	    }else {
	    		response.sendRedirect("index.jsp");
	    }
	    
//	    PrintWriter out = response.getWriter();
//	    out.println (color);
		
/*	    getServletConfig()
		    .getServletContext()
		    .getRequestDispatcher("/ServletAResponse.jsp")
		    .forward(request, response);*/
	}
	



}
