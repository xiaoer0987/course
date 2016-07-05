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
	function addgrade(){
		var sno = ${row.esno};
		$.post{
			 "../addgradeServlet"
		}
		
	}
</script>
<form method="post" action="addgradeServlet">
	
	<sql:setDataSource var="snapshot" driver="org.sqlite.JDBC"
     url="jdbc:sqlite:C:/sqlite/srs.db"/>

	<sql:query dataSource="${snapshot}" var="result">
	SELECT * from elected where ecno = <%= request.getParameter("cno") %>;
	</sql:query>
	<c:forEach var="row" items="${result.rows}">
	
	<table>
	<tr>
	<td>学生姓名</td>
	<td>学生成绩</td>
	<td></td>
	</tr>
	<tr>
	<td>${row.esno}</td>
	<td >${row.esname }</td>
	<td><input type="text" name="grade"></td>
	<td><input type="submit" value="确定" onclick="addgrade"></td>
	</tr>
	
	</table>
	</c:forEach>
	
</form>
</body>
</html>