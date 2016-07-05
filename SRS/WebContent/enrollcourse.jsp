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
function xuanke(){
	
	var selected = ${row.serctionNo };
}

</script>
<sql:setDataSource var="snapshot" driver="org.sqlite.JDBC"
     url="jdbc:sqlite:C:/sqlite/srs.db"/>

<sql:query dataSource="${snapshot}" var="result">
SELECT * from section;
</sql:query>
<form method="post" action="enrollCourseServlet">
	<table>
		
		
		<c:forEach var="row" items="${result.rows}">
		<tr id=${row.sectionNo}>
			<td><input name="radio" type="radio"/></td>
			<td>${row.sectionNo}</td>
			<td>${row.dayofWeek}</td>
			<td>${row.timeofDay }</td>
			<td>${row.room }</td>
			<td>${row.seatingCapacity }</td>
			<td>${row.representedCourse }</td>
			<td>${row.instructor }</td>
		</tr>
		</c:forEach>	
		<%-- <td><%=result %></td> --%>
		
		
	</table>
	请输入您的学号：<input type="text" name="sno" value=""><br/>
	请输入您选的课程号：<input type="text" name="cno" value=""><br/>
	<input type="submit" onclick="xuanke" value="确认选课"/>
</form>
</body>

</html>