<%@page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" 
%><%@page session="false" isErrorPage="true"
%><%@page 
import="org.slf4j.Logger"
import="org.slf4j.LoggerFactory"
import="java.util.UUID"
%><%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %><%!

static final Logger logger = LoggerFactory.getLogger("JSPException");

private Throwable findException(PageContext pc) {
	Throwable e = (Throwable)pc.getAttribute("exception", PageContext.REQUEST_SCOPE);
	if (e == null) {
		e = pc.getException();
	}
	return e;
}
%><%
	Throwable e = findException(pageContext);
	String ticket = Integer.toHexString(UUID.randomUUID().hashCode());
	String message = String.format("[%s] unknown", ticket);
	if (e != null) {
		message = String.format("[%s] %s", ticket, e.getMessage());
		logger.error(message, e);
	}
	
	//response.setContentType("application/json; charset=utf-8");
	//String.format("{ exception:true, message:\"Something went wrong\", ticket:\"%s\"}", ticket);

%><!doctype html>
<html lang="ko">
<head>
	<title>Something went wrong</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<body>
Something went wrong : <%=message %>
</body>
</html>
