let username = document.querySelector("#username");
let password = document.querySelector("#password");

function submiting() {
  apiGetting()
}
async function apiGetting(){
  let res = await fetch('http://localhost:8080/Spring_Mvc/Login')
  let student = await res.json();
  let result = false;
  student.forEach(element => {
    if(element.username === username.value && element.password === password.value)
    result = true;
  });
  if(result){
    alert("you can log in");
    if(apiLogin())
    location.href = "../HTML/s.Home.html";
  }
  else
  alert("you need to sign up call to Teacher");
}
async function apiLogin(){
  let bodyData = {
    "username" : username.value,
    "id" : password.value
  };
  let res = await fetch('http://localhost:8080/Spring_Mvc/loginStudent',{
    headers:{
      "Content-Type":"application/json"
    },   
    method : "POST",
    body  : JSON.stringify(bodyData)
  });
  let data = await res.json();
return data;
}

