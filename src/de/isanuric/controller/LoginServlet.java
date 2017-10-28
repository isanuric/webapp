package de.isanuric.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import de.isanuric.model.LoginDB;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private boolean firstCall = true;
	
	

	/* (non-Javadoc)
	 * @see javax.servlet.GenericServlet#init()
	 */
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     //reading the user input
	    String  uid = request.getParameter("uid");    
	    String  pass = request.getParameter("pass");
	    PrintWriter out = response.getWriter();
	    LoginDB loginDb = new LoginDB();
	    
	    //request.setAttribute("errorMessage", "login");

	    if (loginDb.checkUserLoginInfo(uid, pass)) {
	    		HttpSession session = request.getSession();
	    		session.setAttribute("uid", uid);
	    		response.sendRedirect("welcome.jsp");
	    }else {
	    		
	    	
				if (!firstCall) {
					RequestDispatcher requestDispatcher;
					request.setAttribute("errorMessage", loginDb.getLoginMessage());
					requestDispatcher = request.getRequestDispatcher("index.jsp");
					requestDispatcher.forward(request, response);
				}else {
					firstCall = false;
//					request.setAttribute("errorMessage", "login");
//					requestDispatcher = request.getRequestDispatcher("index.jsp");
//					requestDispatcher.forward(request, response);
					response.sendRedirect("index.jsp");
				}

	    }
	    
//	    PrintWriter out = response.getWriter();
//	    out.println (color);
		
/*	    getServletConfig()
		    .getServletContext()
		    .getRequestDispatcher("/ServletAResponse.jsp")
		    .forward(request, response);*/
	}
}
