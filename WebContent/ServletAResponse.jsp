<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.Date"
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style.css">
<title>response</title>
</head>
<body>

	<center>
		<table>
			<tr><td width:"150px"><h1>Your Entry is:</h1></td></tr>
			
			<tr>
				<td><h3> <% out.println (request.getParameter("color")); %> </h3></td>
			</tr>
			
			<tr><td> <%= new Date() %> </td></tr>
			
		</table>
	</center>
	   
</body>
</html>