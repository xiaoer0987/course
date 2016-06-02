<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>吉他查询系统</title>
</head>
<body>
<form action="GuitarAction" method="post">
请输入您需要的吉他信息：<br/>
builder:<input type="text" name="builder" class="content"><br/>
type:<input type="text" name="type" class="content"><br/>
backWood:<input type="text" name="backwood" class="content"><br/>
topWood:<input type="text" name="topWood" class="content"><br/>
<input type="submit" value="搜索">
</form>
</body>
</html>