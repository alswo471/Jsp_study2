<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="tool" tagdir= "/WEB-INF/tags/tool" %>
<tool:line size = "60" color="blue" /><br>

<tool:max num1="100" num2="200"/>
${maximum}<br>

<tool:min var="min" num1="100" num2="200"/>
${min}<br>

<tool:box>
안녕하세요
</tool:box>

<tool:count var="num" begin="1" end="10">
${num} 
</tool:count>

