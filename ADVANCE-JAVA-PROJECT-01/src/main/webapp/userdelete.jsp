<%@ page language="java" contentType="text/html;"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head>
<title>User Delete JSP </title>
</head>
<body bgcolor="pink">
<c:if test="${deleteResult == 1}">
Deletion successfully......</c:if>
<c:if test="${deleteResult == 0}">
Deletion fail check once....
<%@include file="userdelete.html"%>
</c:if>
</body>
</html>