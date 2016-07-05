<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
alert("选课成功");
</script>
${success };

选课成功。
您已选的课程：
<sql:setDataSource var="snapshot" driver="org.sqlite.JDBC"
     url="jdbc:sqlite:C:/sqlite/srs.db"/>

<sql:query dataSource="${snapshot}" var="result1">
SELECT * from section where sectionNo = ${cno};
</sql:query>
<table>
	<c:forEach var="row" items="${result1.rows}">
	<tr>
		<td>${row.sectionNo}</td>
			<td>${row.dayofWeek}</td>
			<td>${row.timeofDay }</td>
			<td>${row.room }</td>
			<td>${row.seatingCapacity }</td>
			<td>${row.representedCourse }</td>
			<td>${row.instructor }</td>
			
	</tr>
	
	</c:forEach>
</table>
<sql:query dataSource="${snapshot}" var="result2">
SELECT * from person;
</sql:query>
课程成绩：
<sql:query dataSource="${snapshot}" var="result3">
SELECT * from elected where ecno = ${cno};
</sql:query>
<table>
	<c:forEach var="row" items="${result3.rows}">
	<tr>
		<td>${row.esno}</td>
			
			<td>${row.ecno }</td>
			
			<td>${row.ecname}</td>
			<td>${row.etname}</td>
			
			<td>${row.ecgrade}</td>
			
	</tr>
	
	</c:forEach>
</table>

</body>
</html>