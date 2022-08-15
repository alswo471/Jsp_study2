<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="tool" uri="/taglibs/tools.tld" %>

<tool:line size="30" color="red"/>

<tool:newLine size="30" color="blue" />

<tool:max  num1 ="100" num2 ="200"/>
${maximum}<br>

<tool:min var ="min" num1="100" num2="200"/>
${min}<br>

<tool:list bullet="@">
	<tool:item>사과</tool:item>
</tool:list>

<tool:box oldWord = "비행기" newWord="제트기">
떴다 떴다 비행기 날아라 날아라<br>
높이 높이 날아라 우리 비행기<br>
</tool:box>










