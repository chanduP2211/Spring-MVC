<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
 table,th,td{
 border : 2px solid white;
 border-collapse : collapse;
 
 }
 table,tr{
   box-shadow: 7px 6px 20px black;
 }
 .container{
 position : relative;
 margin : 5% 10% 0% 15%;
 }
 .sub{
 position : absolute;
 margin : 2% 0% 0% 45%;

 }
 th,td{
 height : 30px;
 }
a{
text-decoration : none;
} 
 button{
  width :100px;
 height : 40px;
 background-color : blue;
 color : white;
 border : none;
 }
button:hover{
  cursor: pointer;}
 .update{
 background-color : Green;
 color : white;
 border : none;
 }
 .delete{
 background-color: rgb(223, 35, 35);
  color : white;
  border : none;
 }
 th{
background-color: rgb(126, 243, 126);
 }
   tbody  tr:nth-child(odd){
   background-color: rgb(223, 230, 243);
 
   }
   tbody tr:nth-child(even){
       background-color: rgb(217, 219, 223);
   }
</style>
</head>
<body>
    <div class="container">
    <table>
      <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Phone no</th>
            <th>Qualification</th>
            <th>Gender</th>
            <th>Address</th>
            <th>Action</th>
        </tr>
      </thead>
 
      <tbody>
    
       <c:forEach items="${user}" var="s">
        <tr>
           <td>${s.id}</td>
           <td>${s.name}</td>
           <td>${s.email}</td>
           <td>${s.phone}</td>
           <td>${s.graduation}</td>
           <td>${s.gender}</td>
           <td>${s.address}</td>
           <td><a href="/Spring_Mvc/update/${s.id}" class="update">update</a>  <a href="/Spring_Mvc/delete/${s.id}" class="delete">delete</a></td>
        </tr>
       </c:forEach> 
       
      </tbody>
    </table>
    </div>
    <div class="sub">
   <a href="/Spring_Mvc/home" class="add"><button>ADD</button></a>
    </div>

</body>
</html>