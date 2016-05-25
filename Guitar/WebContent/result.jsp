<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>查询结果页面</title>
</head>
<body>
	<table>
		<tr>
			<td>serialNumber</td>
			<td>price</td>
			<td>builder</td>
			<td>type</td>
			<td>model</td>
			<td>backWood</td>
			<td>topWood</td>
		</tr>
		
	<c:forEach var="guitar" items="${requestScope.guitar }">
		<tr>
			<td>${guitar.serialNumber}</td>
			<td>${guitar.price}</td>
			<td>${guitar.builder}</td>
			<td>${guitar.type}</td>
			<td>${guitar.model}</td>
			<td>${guitar.backWood}</td>
			<td>${guitar.topWood}</td>
		</tr>
		
	</c:forEach>
	</table>
</body>
</html>