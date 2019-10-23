<%@page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" 
%><%@ page session="false" 
%><%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %><!doctype html>
<html lang="ko">
<head>
	<title>Home</title>
	<script src="https://code.jquery.com/jquery-2.2.4.js" integrity="sha256-iT6Q9iMJYuQiMWNd9lDyBUStIq/8PuOW33aOqmvFpqI=" crossorigin="anonymous"></script>
	<script src="<c:url value="/resources/common.js"/>"></script>
	<script type="text/javascript">
	</script>
</head>
<body>
<h1>
	Hello world!
</h1>

<P>  ${uuid}  </P>
</body>
</html>
