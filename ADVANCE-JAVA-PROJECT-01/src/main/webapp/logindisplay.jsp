<%@page language="java" contentType="text/html"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
</head>
<body bgcolor="pink">

	<c:if test="${login}">
	   <c:redirect url="https://sathyatech.com/"></c:redirect>
	   <jsp:include page="userlogin.html"/>
	</c:if>
	
	<c:if test="${not login}">
		<jsp:include page="userlogin.html"/>
		Login Fail Try With Valid Credentials....
	</c:if>
	

	
</body>
</html>