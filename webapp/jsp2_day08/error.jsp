<%@ page contentType="text/html; charset=utf-8" %>
<%@ page isErrorPage="true" %>
<h1>오류 발생!</h1>
<h2><%= exception.getClass().getName() %></h2>
<h3><%=exception.getMessage() %></h3>

<% 
	 exception.printStackTrace();
%>