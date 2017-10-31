<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="de.isanuric.controller.Helper" 
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="style.css">
<!-- 		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> -->
	<title> login </title>
	</head>	
	<body>	
		
		<form action="HelloServlet">		
			<table class="box" >
				<tr>
					<td>
						<%! int count = 0; %>
						<%
							if (count > 1) {
								out.println(request.getAttribute("errorMessage") );
							}
							count++;
						%>
					</td>
				</tr>
				<tr>
					<td>user name: </td>
					<td><input type="text" name="uid"></td>
				</tr>
				<tr>
					<td> password: </td>
					<td><input type="password" name="pass"></td>
				</tr>
				<tr>
					<td></td>
					<td class ="tdRight"><input type="submit" name="submintBtn"> </td>
				</tr>
			</table>		
		</form>	
		
	</body>	
</html>