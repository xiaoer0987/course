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
		
	<c:forEach var="guitar" items="${requestScope.matchingGuitar }">
		<tr>
			<td>${matchingGuitar.serialNumber}</td>
			<td>${matchingGuitar.price}</td>
			<td>${matchingGuitar.spec。builder}</td>
			<td>${matchingGuitar.spec.type}</td>
			<td>${matchingGuitar.model}</td>
			<td>${matchingGuitar.spec.backWood}</td>
			<td>${matchingGuitar.spec.topWood}</td>
			
		</tr>
		
	</c:forEach>
	</table>
</body>
</html>