<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<fmt:bundle basename="bundle.message">
<fmt:message key ="TITLE"/>
</fmt:bundle>
<br>
<fmt:setBundle basename="bundle.message"/>
<fmt:message key ="TITLE"/>
<br>
<fmt:message key="GREETING">
<fmt:param value="사용자1"/>

</fmt:message>