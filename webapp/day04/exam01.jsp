<%@ page contentType="text/html; charset=utf-8"%>

<%
pageContext.setAttribute("hello", "(수정)안녕하세요");
request.removeAttribute("hello");
%>

${hello}
${msg}