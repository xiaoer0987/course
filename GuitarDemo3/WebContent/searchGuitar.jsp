<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="SearchGuitar" >

<label>builder</label>
<select name="builder" >
<option>AMY</option><option>RYAN</option>
</select><br/>
<label>model</label>
<select name="model" >
<option>01</option><option>02</option>
</select><br/>
<label>type</label>
<select name="type" >
<option>ACOUSTIC</option><option>ELECTRIC</option>
</select><br/>
<label>backwood</label>
<select name="backwood" >
<option>ALDER</option><option>MAPLE</option><option>CEDAR</option>
</select><br/>
<label>topwood</label>
<select name="topwood" >
<option>ALDER</option><option>MAPLE</option><option>CEDAR</option>
</select><br/>
<label>numStrings</label>
<select name="numStrings" >
<option>6</option>
</select>
<br/>
<input type="submit" value="提交">



</form>
</body>
</html>