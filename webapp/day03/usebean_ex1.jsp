<%@ page contentType="text/html; charset=utf-8"%>

<jsp:useBean id="member" class="models.member.MemberDto" />

<jsp:setProperty name="member" property="memId" value="user1"/>
<jsp:setProperty name="member" property="memNm" value="이름1"/>

<jsp:getProperty name="member" property="memId"/><br>
<jsp:getProperty name="member" property="memNm"/>

<%-- 
<%
	member.setMemNo(1);
	member.setMemNm("이름");
%>
${member.memNo}
${member.memNm}
--%>