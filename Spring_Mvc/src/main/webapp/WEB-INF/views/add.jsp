<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.container{
border : none;
margin : 5% 30% 0% 35%;
padding : 3%;
background-color:pink;
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
</head>
<body>
  <div class="container">
     <form action="add" >
        <label>Student Id</label><br>
        <input type="text" name="id" id="stu_id"><br>
         <label>Name</label><br>
        <input type="text" name="name" id="stu_name"><br>
         <label>Email</label><br>
        <input type="email" name="email" id="email"><br>
         <label>Phone no</label><br>
        <input type="number" name="phone" id="phone"><br>
        <label>Graduation</label><br>
         <input type="text" name="graduation" id="graduation"><br>
         <label>Gender</label><br>
          <select id="gender" name="gender">
                 <option  value="Male">Male</option>
                 <option value="Female">Female</option>
          </select><br>
          <label>City</label><br>
         <input type="text" name="address"><br>
         
     <input type="submit" class="submit" >
     
     
     </form>
     
     
            <c:choose>
                      <c:when test="${ not empty balance && format eq form}">
                         <c:set var="totalPriorData" value="${Math.round(balance * 10.0) / 10.0 }"/>
                            chandu<fmt:formatNumber type="${format}" value="${ totalPriorData }" pattern="" groupingUsed="true" />dp
                      </c:when>
                      <c:otherwise>
                           sdfsd<fmt:formatNumber type="${format}" value="${ balance }" pattern="" groupingUsed="true" />sdcsd
                      </c:otherwise>
                   </c:choose>
     
     
     
     
     
     
     
     
     
  </div>
</body>
</html>