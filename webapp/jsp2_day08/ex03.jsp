<%@ page contentType="text/html; charset=utf-8" %>
<% 
Cookie[] cookies = request.getCookies();
for(Cookie cookie : cookies) {
	String name = cookie.getName();
	String value = cookie.getValue();
	out.println("name=" + name + ", value=" + value + "<br>");
}
%>