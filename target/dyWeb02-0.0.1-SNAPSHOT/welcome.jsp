<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    import="de.isanuric.controller.Helper" 
 %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style.css">
<title>welcome</title>
</head>
<body>

	<%
		Helper helper = new Helper();
		// prevent back button
		Helper.dontAllowBack(request, response);
	
		if (session.getAttribute("uid") == null) {
			response.sendRedirect("index.jsp");
		}
	%>
	
	Welcome <h3>${uid}</h3> here a nine inch video for you:<br>
	
	<iframe width="560" height="315" src="https://www.youtube.com/embed/_g8nAqDu3gI" frameborder="0"></iframe>
	
	<br>
	<%
		out.println("request URL: " + request.getRequestURL() + "<br>");
		out.println("request URI: " + request.getRequestURI());
	%>
	
	<form action="logout">
		<input type="submit" name="logoutBtn" value="Logout">
	</form>
	
</body>
</html>