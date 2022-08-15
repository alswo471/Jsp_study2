<%@ page contentType="text/html; charset=utf-8" %>
<% 
Cookie param2 = new Cookie("param2", "12345");
param2.setPath("/");
param2.setMaxAge(60 * 60 * 24 * 7);

param2.setHttpOnly(true);

response.addCookie(param2);
%>

11111