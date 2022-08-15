<%@ tag pageEncoding="UTF-8" %>
<%@ tag body-content="scriptless" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ attribute name="var" rtexprvalue="false" required="true"%>
<%@ attribute name="begin" type="java.lang.Integer" rtexprvalue="false"%>
<%@ attribute name="end" type="java.lang.Integer" rtexprvalue="false"%>
<%@ variable name-from-attribute="var" alias="number" variable-class="java.lang.Integer" scope="NESTED" %>


<% 
for(int i = begin; i <= end; i++){%>
<c:set var="number" value="<%=i %>"/>
<jsp:doBody/>
<%}%>