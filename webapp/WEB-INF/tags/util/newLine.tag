<%@ tag body-content="empty"%>
<%@ tag dynamic-attributes="attrs"%>
<%@ tag import="java.util.Map" %>
${attrs.size}<br>
${attrs.color}<br>

<%
Map<String, String> attrs = (Map<String, String>)jspContext.getAttribute("attrs");
int size = Integer.parseInt(attrs.get("size"));

%>
<div style="color:${attrs.color};">
<%

for(int i =0; i < size; i++){
	out.print("-");
}

%>
</div>
