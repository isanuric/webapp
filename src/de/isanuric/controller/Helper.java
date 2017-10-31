package de.isanuric.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Helper extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	
	public Helper() {};

	public static void dontAllowBack(HttpServletRequest request, HttpServletResponse response) {
		// Http 1.1
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		
		// Http 1.0
		response.setHeader("Pragma", "no-cache");
		
		// Proxies
		response.setHeader("Expires", "0");
	}
	
	public static void printRequestInfos(HttpServletRequest request, PrintWriter out) {
		out.println(request.getRequestURL());
		out.println(request.getRequestURI());
	}

}
