
<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<c:set var="str1" value="One Little Two Little Three Little Indians"/>
<c:set var="str2" value= "              text           "/>

substring : ${fn:substring(str1, 0, 10)}<br>
substringAfter : ${fn:substringAfter(str1, "Two")}<br>
substringBefore : ${fn:substringBefore(str1, "Two")}<br>
toUpperCase : ${fn.toUpperCase(str1)}<br>
toLowerCase : ${fn.toLowerCase(str1)}<br>
trim : ${fn:trim(str2) }<br>
replace : ${fn:replace(str1, "Little", "Big")}<br>
startsWith : ${fn:startsWith(str1, "One")}<br>
endsWith : ${fn:endsWith(str1, "Indians")}<br>
constains : ${fn:contains(str1, "little")}<br>



 
