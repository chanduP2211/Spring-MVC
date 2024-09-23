let username = document.querySelector("#username");
let password = document.querySelector("#password");
let retype = document.querySelector("#retype_password");


let check_un = /^[a-zA-Z0-9\.\_]+@[a-zA-Z]{2,5}\.[a-zA-Z]{2,5}/;
let check_pw = /([a-zA-Z]+[0-9]+)/;

async function signUp() {
  if (await signUpValidation()) 
 apiCalling()
}

async function signUpValidation() {
  if (!check_un.test(username.value)) {
    alert("please enter valid username");
    return false;
  }
  if (!check_pw.test(password.value)) {
    alert("please enter valid password");
    return false;
  }
  if (retype.value === password.value) {
    let result = await apiGetting()
   if (result) {
     alert("Already Email used");
        return false;
    }
  } else {
    alert("password is NOT MATCH");
    return false;
  }
  return true;
}
async function  apiCalling(){
  let bodyData = {
    "username" : username.value,
    "password" : password.value
  };
   await fetch('http://localhost:8080/Spring_Mvc/addAdmin',{
    headers:{
      "Content-Type":"application/json"
    },   
    method : "POST",
    body  : JSON.stringify(bodyData)
  });
  alert("you successfully signup");
  location.href = "../HTML/a.login page.html";
}
async function apiGetting(){
  let res = await fetch('http://localhost:8080/Spring_Mvc/getAdmin')
  let data = await res.json();
  let result = false;
  data.forEach((element) => {
    if(element.username === username.value){

         result = true;
    }
  });
  return result;
}