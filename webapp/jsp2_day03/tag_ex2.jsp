<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="util" tagdir="/WEB-INF/tags/util"%>
<util:newLine size="30" color="red"/>

<br>


<util:max num1="100" num2="200"/>
${maximum}
<br>
<util:min var="min" num1="100" num2="200"/>
${min} 

<util:box>
안녕
</util:box>

<util:count var="num" begin="1" end="10">
${num}<br> 
</util:count>