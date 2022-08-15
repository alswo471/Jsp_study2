<%@ tag body-content="empty" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ attribute name= "var" rtexprvalue="false" required="true"%>
<%@ attribute name="num1" type="java.lang.Integer" rtexprvalue="false"%>
<%@ attribute name="num2" type="java.lang.Integer" rtexprvalue="false"%>
<%@ variable name-from-attribute="var" alias="minimum" variable-class="java.lang.Integer" scope="AT_END"%>

<%
int result = Math.min(num1, num2);
%>
<c:set var="minimum" value="<%=result%>"/>