<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<table border='1'>
	<thead>
		<tr>
			<th>도서 ID</th>
			<th>도서명</th>
			<th>출판사</th>
			<th>판매가</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="book" items="${list}">
			<tr>
				<td>${book.bookid}</td>
				<td>${book.bookname}</td>
				<td>${book.publisher}</td>
				<td><fmt:formatNumber value="${book.price}"/>원</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
