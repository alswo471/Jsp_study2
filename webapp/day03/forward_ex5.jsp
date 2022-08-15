<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.net.URLDecoder"%>
<%
request.setCharacterEncoding("UTF-8");
String hello = URLDecoder.decode(request.getParameter("hello"),"UTF-8");
String msg = URLDecoder.decode(request.getParameter("msg"),"UTF-8");

out.println(hello);
out.println(msg);
%>


