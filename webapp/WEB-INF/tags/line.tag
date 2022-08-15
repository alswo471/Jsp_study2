<%@ tag body-content="empty"%>
<%@ attribute name="color"  type="java.lang.String"%>
<%@ attribute name="size"  type="java.lang.Integer" required="true" %>

<div style = "color:${color};">
<%
for(int i = 0; i < size; i++){
	out.print("-");
}
%>
</div>