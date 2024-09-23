function home() {
  location.href = "../HTML/s.Home.html";
}
function attendance() {
  location.href = "../HTML/s.attend.html";
}
function profile() {
  location.href = "../HTML/s.profile.html";
}
 function logout() {
    apiLogOut()
    confirm("Are You LogOut")
    location.href = "../HTML/s.login.html";
}
async function apiLogOut(){
  let response = await fetch('http://localhost:8080/Spring_Mvc/getLog')
  let student = await response.json();
  let id ="";
  student.forEach((element)=>{
     id = element.id;
  })

  let res = await fetch(`http://localhost:8080/Spring_Mvc/deleteLoginStudent/${id}`,{
    method : "DELETE"
  })
  let data = res.json();
  return data;
}