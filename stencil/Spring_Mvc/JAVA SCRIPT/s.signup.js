let username = document.querySelector("#username")
let password = document.querySelector("#password")
let new_password = document.querySelector("#new_password")
let confirm_password = document.querySelector("#confirm_password")

async function login(){
    let response = await fetch('http://localhost:8080/Spring_Mvc/Login');
    let details = await response.json();

if(details){
    let check = false;
    details.forEach((element)=>{
     if(element.username === username.value && element.password === password.value)
        check = true;
    })
    if(check)
    signup()
    else
    alert("Incorrect Username or Password")
}
else
alert("Please call Admin")
}
async function signup(){
    if(validation()){
    if(new_password.value === confirm_password.value){
    let bodyData = {
        "username" : username.value,
        "password" : new_password.value
      };
      id = username.value;
      let res = await fetch('http://localhost:8080/Spring_Mvc/addLogin',{
        headers:{
          "Content-Type":"application/json"
        },   
        method : "POST",
        body  : JSON.stringify(bodyData)
      });
      alert("Password changed Successfully")
      location.href = "../HTML/s.login.html"
    }
    else
        alert("Password is not Match")
}
}
function validation(){
    if(new_password.value === "" || confirm_password.value === ""){
    alert("Please fill the all data");
    return false; 
  }
  return true;
}