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
<h1>欢饮您<%= request.getParameter("ssd") %>   登录成功</h1>
<form method="post" action="getCourseServlet">
您开设的课程：


<sql:setDataSource var="snapshot" driver="org.sqlite.JDBC"
     url="jdbc:sqlite:C:/sqlite/srs.db"/>

<sql:query dataSource="${snapshot}" var="result">
SELECT * from elected where etno = <%= request.getParameter("ssd") %>;
</sql:query>
<table>
	<c:forEach var="row" items="${result.rows}">
	<tr>
			<td>${row.ecno}</td>
			<td>${row.ecname}</td>		
	</tr>	
	</c:forEach>
</table>
<!-- <a href="addgrade.jsp">添加学生成绩：</a> -->
<input type="text" name="cno">请输入您要添加成绩的课程号<br/>
<input type="submit" value="确定">
</form>
</body>
</html>