function attendance() {
  location.href = "../HTML/t.attendance.html";
}
function home() {
  location.href = "../HTML/t.home.html";
}
function students() {
  location.href = "../HTML/t.student.html";
}
function logout() {

  if (confirm("Are You want to Logout")){
    if(apiDeleting())
    alert("Are u sure")
    location.href = "../HTML/t.login page.html";
}
}
function profile() {
  location.href = "../HTML/t.profile.html";
}
async function apiDeleting(){
  let response = await fetch('http://localhost:8080/Spring_Mvc/getLogin');
  let details = await response.json();
  let check = "";
  details.forEach((element)=>{
    check = element.username;
  })
 let res = await fetch(`http://localhost:8080/Spring_Mvc/deleteLoginTeacher/${check}`,{
   method : "DELETE",
 })
 let data = await res.json();
 return data;
}