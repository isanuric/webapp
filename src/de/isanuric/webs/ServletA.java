package de.isanuric.webs;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletA
 */
@WebServlet("/servleta")
public class ServletA extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletA() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    // reading the user input
	    //String color= request.getParameter("color");    
	    //PrintWriter out = response.getWriter();
	    //out.println (color);
		
	    getServletConfig()
		    .getServletContext()
		    .getRequestDispatcher("/ServletAResponse.jsp")
		    .forward(request, response);
	}
	



}
