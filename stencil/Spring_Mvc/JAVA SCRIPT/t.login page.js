var username = document.querySelector("#username");
var password = document.querySelector("#password");
let id = ""
function submiting() {
  apiGetting();
}
async function apiGetting(){
  let res = await fetch('http://localhost:8080/Spring_Mvc/Login')
  let teacher = await res.json();
  let result = false;
  teacher.forEach(element => {
    if(element.username === username.value && element.password === password.value){
       result = true;
    }
  });
  if(result){
    if(apiCalling()){
      alert("You Can Login") 
    location.href = "../HTML/t.home.html";
    }
  }
  else{
    alert("you need to sign up call to admin")
  }
}
  async function apiCalling(){
    let bodyData = {
      "username" : username.value,
      "password" : password.value
    };
    id = username.value;
    let res = await fetch('http://localhost:8080/Spring_Mvc/loginTeacher',{
      headers:{
        "Content-Type":"application/json"
      },   
      method : "POST",
      body  : JSON.stringify(bodyData)
    });
    let data = await res.json();
 return data;
  }
