<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h5>User details from logout page: ${sessionScope.user_details}</h5>
<%
session.invalidate();
%>
<h5>You have logged out...</h5>
<h5>
<a href="index.jsp">Visit again</a>
</h5>
</body>
</html>