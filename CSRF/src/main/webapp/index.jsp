<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="de.dominikschadow.myths.CSRFTokenHandler" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Cross-Site Request Forgery</title>
</head>
<body>
	<h1>Cross-Site Request Forgery</h1>
	
	<h2>Unprotected GET request executed via</h2>
	
	<p><a href="CSRFServlet?name=BrowserLink">CSRFServlet?name=BrowserLink</a></p>
	
	<p><a href="image.html">&lt;img src=&quot;CSRFServlet?name=CSRF-Image&quot; width=&quot;0&quot; height=&quot;0&quot; /&gt;</a></p>
	
	<h2>Unprotected POST request executed via</h2>
	
	<h3>Form</h3>

	<form name="greeting" method="post" action="CSRFServlet">
		<table>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name"></td>
				<td><input type="submit" value="Send"></td>
			</tr>
		</table>
	</form>
	
	<p><a href="xmlhttprequest.html">XMLHttpRequest</a></p>
	
	<br/><br/>
	
	<h2>Protected GET request executed via</h2>
	
	<p><a href="ProtectedServlet?name=BrowserLink&<%=CSRFTokenHandler.CSRF_TOKEN%>=<%=CSRFTokenHandler.getToken(request.getSession(false))%>">ProtectedServlet?name=BrowserLink&amp;<%=CSRFTokenHandler.CSRF_TOKEN%>=<%=CSRFTokenHandler.getToken(request.getSession(false))%></a></p>
	
	<p><a href="image-protected.html">&lt;img src=&quot;ProtectedServlet?name=CSRF-Image&quot; width=&quot;0&quot; height=&quot;0&quot; /&gt;</a></p>
	
	<h2>Protected POST request executed via</h2>
	
	<h3>Form</h3>

	<form name="greetingProtected" method="post" action="ProtectedServlet">
		<input type="hidden" name="<%=CSRFTokenHandler.CSRF_TOKEN%>"
		  value="<%=CSRFTokenHandler.getToken(request.getSession(false))%>">
		<table>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name"></td>
				<td><input type="submit" value="Send"></td>
			</tr>
		</table>
	</form>
	
	<p><a href="xmlhttprequest-protected.html">XMLHttpRequest</a></p>
</body>
</html>
