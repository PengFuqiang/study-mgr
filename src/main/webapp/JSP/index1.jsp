<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>一个简单的JSP页面</title>
</head>
<body>
<%
	Date date = new Date();
	SimpleDateFormat df = new SimpleDateFormat();
	String today = df.format(date);
%>
当前时间：<%=today %>
</body>
</html>