<%@ page contentType="text/html; charset=utf-8"%>

	전체 버퍼 수 : <%=(out.getBufferSize())%><br>
	<h1>텍스트...</h1>
	남은 버퍼수 : <%=out.getRemaining() %><br>
	<% out.flush();%>
	<% out.clear();%>
	<h2>텍스트2</h2>
	남은 버퍼수 : <%=out.getRemaining() %><br>
	
	
