<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<style>
.container{
border : none;
margin : 5% 30% 0% 35%;
padding : 3%;
 background-color: rgb(127, 255, 238);
 box-shadow: 8px -8px 10px black;
}
form{
margin-left : 2%;
}
label{
padding : 3%;
 font-weight: bold;
    font-size: 17px;
}
input{
margin-left : 2%;
margin-top : 2%;
margin-bottom :2%;
width : 100%;
border : 1px solid black;
height : 20px;
}
#gender{
margin-left : 2%;
margin-top : 2%;
margin-bottom :2%;
}
.submit{
width :100px;
margin-left : 35%;
background-color : blue;
height : 40px;
border : none;
}
.submit:hover{
  cursor: pointer;}
</style>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <div class="container">
     <form action="${pageContext.request.contextPath}/update" method="post">
        <label>Student Id</label>
        <input type="text" name="id" id="stu_id" value="${student.id }"><br>
         <label>Name</label>
        <input type="text" name="name" id="stu_name" value="${student.name }"><br>
         <label>Email</label>
        <input type="email" name="email" id="email" value="${student.email }"><br>
         <label>Phone no</label>
        <input type="number" name="phone" id="phone" value="${student.phone }"><br>
        <label>Graduation</label>
         <input type="text" name="graduation" id="graduation" value="${student.graduation }"><br>
         <label>Gender</label>
          <select id="gender" name="gender" value="${student.gender }">
                 <option  value="Male">Male</option>
                 <option value="Female">Female</option>
          </select><br>
          <label>Address</label>
         <input type="text" name="address" value="${student.address }"><br>
         
     <input type="submit" class="submit">
     
     
     </form>
  </div>
</body>
</html>