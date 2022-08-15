<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.net.URLEncoder"%>
<jsp:forward page="forward_ex5.jsp">
<jsp:param name="hello" value='<%=URLEncoder.encode("하위하위","UTF-8") %>'/>
<jsp:param name="msg" value='<%=URLEncoder.encode("방가방가","UTF-8") %>'/>
</jsp:forward>