<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<c:set var = "str1" value="apple#mango#melon"/>
<c:forEach var= "fruit" items="${fn:split(str1, '#')}">
${fruit}<br>
</c:forEach>

<% 
String[] fruits = {"apple","mango","melon"};
%>
<c:set var="arr1" value="<%=fruits%>"/>
${fn:join(arr1, "#")}<br>
${fn:escapeXml("<script>alert('확인!');</script>")}