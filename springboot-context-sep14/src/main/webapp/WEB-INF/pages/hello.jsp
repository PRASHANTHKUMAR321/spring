
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <c:set var="income" value="${4000*2}"/>  
  
	<b>Income is : </b>
	<c:out value="${income}" />
</body>
</html>
</body>
</html>