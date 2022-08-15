<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:requestEncoding value="UTF-8"/>
<%
request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="member" class ="models.member.MemberDto" scope ="request"/>
<%-- 
<jsp:setProperty name="member" property="*"/>
--%>
<jsp:setProperty name="member" property="memId" param="userId"/>
<jsp:setProperty name="member" property="memPw"/>
<jsp:setProperty name="member" property="memNm"/>


memld: <jsp:getProperty name="member" property="memId"/><br>
memPw: <jsp:getProperty name="member" property="memPw"/><br>
memNm: <jsp:getProperty name="member" property="memNm"/>