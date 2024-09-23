<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<% 
out.println(response.getContentType());
out.println(response.getCharacterEncoding());
response.setContentType( "text/html; charset=UTF-8" ); %>
<html>
	<head>
	   <!--  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" /> -->
    </head>
    <body>

<%
out.println(response.getContentType());
out.println(response.getCharacterEncoding());
  SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
  Date customDate = dateFormat.parse("2021-02-25");
%>
<fmt:setLocale value="fr_CA" />
<c:set var="customDate" value="<%= customDate %>" />
<fmt:formatDate value="<%= customDate %>" pattern="MMMMMM d, yyyy" />
<br/>
<fmt:message key="header.watchlist"></fmt:message><br/>
<fmt:formatNumber value="12345" pattern="$#,###"/><br/>
<!--<fmt:message key="listing.mileage"><fmt:param value="123456" /></fmt:message><br/>-->

<br/>


<fmt:message key="header.watchlist"></fmt:message><br/>
<fmt:formatNumber value="54321" pattern="$#,###"/><br/>

<fmt:setLocale value="en_CA" />
<fmt:message key="header.watchlist"></fmt:message><br/>
<c:set var="customDate" value="<%= customDate %>" />
<fmt:formatDate value="<%= customDate %>" pattern="MMMMMM d, yyyy" />
<br/>
<fmt:formatNumber value="12345" pattern="$#,###"/><br/>
<!--<fmt:message key="listing.mileage"><fmt:param value="123456" /></fmt:message><br/>-->
</body>
   </html>


