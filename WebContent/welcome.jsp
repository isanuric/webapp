<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style.css">
<title>welcome</title>
</head>
<body>


	<%
		if (session.getAttribute("uid") == null) {
			response.sendRedirect("index.jsp");
		}
	%>
	
	Welcome ${uid} hier a nine inch video for you:<br>
	
	<iframe width="560" height="315" src="https://www.youtube.com/embed/_g8nAqDu3gI" frameborder="0" allowfullscreen></iframe>
	
	<form action="logout">
		<input type="submit" name="logoutBtn" value="Logout">
	</form>
	
</body>
</html>