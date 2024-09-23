
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<br/>
<% 
out.println("Started index2.jsp");
out.println(response.getContentType());
out.println(response.getCharacterEncoding());
response.setContentType( "text/html; charset=UTF-8" );
%>
<br/>

<%
response.setContentType( "text/html; charset=ISO-8859-1" );
out.println("Started 2nd onne index2.jsp");
out.println(response.getContentType());
out.println(response.getCharacterEncoding());
  SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
  Date customDate = dateFormat.parse("2021-02-25");
%>
<c:out> value="+++++++++++++"</c:out>
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



