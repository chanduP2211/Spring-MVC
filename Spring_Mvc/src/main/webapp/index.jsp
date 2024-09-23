<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<% 
out.println(response.getContentType());
out.println(response.getCharacterEncoding());
//response.setContentType( "text/html; charset=UTF-8" );
%>
<br/>
<html>
	<head>
	   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    </head>
 <body>
<jsp:include page="index2.jsp"></jsp:include>

</body>
   </html>


