<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style>
.demo{margin:auto;width:700px;}
</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>

</head>
<body>

<form action="LoginAction" method="post">
<div class="demo" style="margin:auto;width:700px;" ><table border="1" cellpadding="4" >
<tr align="center" valign="middle"><td>请输入您的ssd：<input type="text" name="ssd"/><br/></td></tr>
<tr align="center" valign="middle"><td>请输入您的密码：<input type="password" name="password"/><br/></td></tr>
<tr valign="middle"><td>请选择您的身份：
<label><input name="radiobutton" type="radio" value="student">学生</label>
<label><input name="radiobutton" type="radio" value="teacher">教师</label><br/></td></tr>
<tr align="center" valign="middle"><td><input type="submit" value="登录"/></td></tr>
</table></div>
</form>
</body>
</html>