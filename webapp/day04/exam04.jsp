<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.*"%>

<% 
 response.addHeader("added1", "12334");
 List<String> names = (List<String>)response.getHeaderNames();
 for(String name : names){
	 String value = response.getHeader(name);
	 out.println(name + "." + value + "<br>");
 }
%>