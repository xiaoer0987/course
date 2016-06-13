<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="AddGuitar" method="post">
serailNumber<input type="text" name="serialNumber"/><br/>
builder<input type="text" name="builder"/><br/>
model<input type="text" name="model"/><br/>
type<input type="text" name="type"/><br/>
price<input type="text" name="price"/><br/>
backWood<input type="text" name="backWood"/><br/>
topWood<input type="text" name="topWood"/><br/>
numStrings<input type="text" name="numStrings"/><br/>
<input type="submit" value="提交">
</form>
</body>
</html>