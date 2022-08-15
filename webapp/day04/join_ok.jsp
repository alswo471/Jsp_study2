<%@ page contentType = "text/html; charset=utf-8"%>
<%@ page import= "java.util.*"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:requestEncoding value="UTF-8"/>

<%

Map<String,String[]> params = request.getParameterMap();
for(Map.Entry<String,String[]> param : params.entrySet()){
	String name = param.getKey();
	String[] value = param.getValue();
	out.println(name + "." + Arrays.toString(value) + "<br>");
}
%>
<%--

Enumeration<String> names = request.getParameterNames();
while(names.hasMoreElements()){
	
String name = names.nextElement();
String value;

if(name.equals("hobby")){
		 value = request.getParameter(name);
}else{
	value = request.getParameter(name);
}
out.println(name + "." + value + "<br>");
}


${param.memId}<br> 
${param.memPw}<br> 
${param.memNm}<br> 
${param.hobby}
<%
String[] hobbies = request.getParameterValues("hobby");
out.println(Arrays.toString(hobbies));
%>

request.setCharacterEncoding("UTF-8");

String memId = request.getParameter("memId");
String memPw = request.getParameter("memPw");
String memNm = request.getParameter("memNm");
%>

<%= memId%><br>
<%= memPw%><br>
<%= memNm%>

--%>