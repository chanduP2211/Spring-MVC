let username = document.querySelector("#username");
let password = document.querySelector("#password");
  async function apiLogIn(){
    let res = await fetch('http://localhost:8080/Spring_Mvc/getAdmin')
    let data = await res.json();
    let result = false;
    data.forEach(element => {
      if(element.username === username.value && element.password === password.value){
           result = true;
      }
    });
    if (result) {
      alert("you can login");
      location.href = "../HTML/a.home.html";
    } 
   else {
    alert("not signed yet");
    username.value = "";
    password.value = "";
  }
  }

