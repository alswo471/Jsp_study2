<%@ page contentType="text/html; charset=utf-8" %>
<% 
Cookie cookie = new Cookie("param1", "abcdefg");
response.addCookie(cookie);
%>