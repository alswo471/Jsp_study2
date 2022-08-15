<%@ page contentType="text/html; charset=utf-8"%>
<%@ page info="사이트 설명..."%>
<%!
int num1 = 10;
	int num2 = 20;

	int sum(int num1, int num2) {
		return num1 + num2;
	}
	%>

<%
out.println("<h1>계산 결과?</h1>");
out.println(sum(num1, num2));
%>