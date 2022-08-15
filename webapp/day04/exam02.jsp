<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.*"%>

<% 
Enumeration<String> names = request.getHeaderNames();
while(names.hasMoreElements()){
	String name = names.nextElement();
	String value = request.getHeader(name);
	
	out.println(name + "." + value + "<br>");
}

Cookie[] cookies = request.getCookies();
for(Cookie cookie: cookies){
	String name = cookie.getName();
	String value = cookie.getValue();
	//out.println(name + "." + value + "<br>");
}
%>
${cookie.JSESSIONID.getValue}
