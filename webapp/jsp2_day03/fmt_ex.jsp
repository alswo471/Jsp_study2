<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:formatNumber value ="1000000.12" pattern = "#,###.####"/>

<br>

<fmt:formatNumber value ="0.75" type="percent"/><br>
<fmt:formatNumber value ="10000" type="currency"/><br>

<fmt:formatNumber value ="10000" type="currency" currencySymbol="@@"/><br>

<fmt:setLocale value="ja_JP"/>
<fmt:formatNumber value ="10000" type="currency"/><br>

<fmt:setLocale value="en_US"/>
<fmt:formatNumber value ="10000" type="currency"/>

