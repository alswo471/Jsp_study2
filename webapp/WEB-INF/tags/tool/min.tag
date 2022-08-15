<%@ tag body-content="empty" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ attribute name="var"  rtexprvalue="false" required="true"%> <!-- rtex : false일 경우 문자열또는 정수만 required : var 값이 필수이다 -->
<%@ attribute name="num1" type="java.lang.Integer" rtexprvalue="false"%>
<%@ attribute name="num2" type="java.lang.Integer" rtexprvalue="false"%>
<%@ variable name-from-attribute="var" alias="minimum" variable-class="java.lang.Integer" scope="AT_END"%>
<% 
int result = Math.min(num1, num2);
%>
<c:set var="minimum" value="<%=result%>"/>