let id = document.getElementById("id");
let tname = document.getElementById("name");
let gender = document.getElementById("gender");
let email = document.getElementById("email");
let phone = document.getElementById("phone");
let degree = document.getElementById("degree");
let subject = document.getElementById("subject");
let address = document.getElementById("address");
let tbody = document.querySelector("#tbody");
let main1 = document.querySelector(".main1");
let main2 = document.querySelector(".main2");
let update = document.querySelector(".up");
let submit = document.querySelector(".submit");
apiGetting();

function submiting() {
  if (!validation())
   return false;
    if(apiCalling())
   alert("Data Entered Successfully")
    resetting();
    return true;
  }
function resetting() {
  id.value = "";
  tname.value = "";
  gender.value = "";
  email.value = "";
  phone.value = "";
  degree.value = "";
  subject.value = "";
  address.value = "";
}
function inserting() {
  update.style.display = "none";
  main1.style.display = "none";
  main2.style.display = "block";
}
function cancelling() {
  main1.style.display = "block";
  main2.style.display = "none";
  resetting();
}


function updating(tr) {
  update.style.display = "block";
  submit.style.display = "none";
  main1.style.display = "none";
  main2.style.display = "block";
  id.value = tr.cells[1].textContent;
  tname.value = tr.cells[2].textContent;
  gender.value = tr.cells[4].textContent;
  email.value = tr.cells[3].textContent;
  phone.value = tr.cells[5].textContent;
  degree.value = tr.cells[6].textContent;
  subject.value = tr.cells[7].textContent;
  address.value = tr.cells[8].textContent;
  UpdateLogin(id.value,tname.value)
update.addEventListener("click", apiCalling)
}

function validation() {
  let check_phone = /[0-9]{10}/;
  let check_id = /[\d+]{4,8}/;
  let check_email = /^[a-zA-Z][\w\.\_]+@[a-zA-Z]{2,5}\.[a-zA-Z]{2,5}/;

  if (
    id.value === "" ||
    email.value === "" ||
    phone.value === "" ||
    degree.value === "" ||
    subject.value === "" ||
    address.value === "" ||
    tname.value === "" ||
    gender.value === ""
  ) {
    alert("plz fill the all data");
    return false;
  }
  if(!(check_id.test(id.value))){
    alert('plz enter valid id')
    return false}
    if(!(check_email.test(email.value))){
      alert('plz enter valid email')
      return false}
    if(!(check_phone.test(phone.value))){
       alert('plz enter valid phone number')
       return false}

  return true;
}


async function apiCalling(){
  if (!validation())
  return false;
  Login()
  let bodyData = {
    "email" : email.value,
     "id" : id.value,
     "name" : tname.value,
     "gender" : gender.value,
     "phone" : phone.value,
     "degree" : degree.value,
     "experience" : subject.value,
     "address" : address.value  
  };
  let res = await fetch('http://localhost:8080/Spring_Mvc/addTeacher',{
    headers:{
      "Content-Type":"application/json"
    },   
    method : "POST",
    body  : JSON.stringify(bodyData)
  }).then(()=>location.reload());
  let data = await res.json();
return data;
}
async function apiGetting(){

  let res = await fetch('http://localhost:8080/Spring_Mvc/getTeacher')
  let student = await res.json();
  let data="";
  let count = 0;
  student.forEach((element)=>{
    data += `<tr><td>${++count}</td><td>${element.id}</td><td>${
      element.name
    }</td><td>${element.email}</td><td>${element.gender}</td><td>${
      element.phone
    }</td><td>${element.degree}</td><td>${element.experience}</td><td>${
      element.address
    }</td><td class="td"><i class="fa-solid fa-user-pen update"></i><i class="fa-solid fa-trash delete"></i></td></tr>`;
    
  })
  tbody.innerHTML = data;
}
tbody.addEventListener("click", (e)=>{
  console.log(e.target)
  if(e.target.classList.contains("delete")){
    let id = e.target.parentElement.parentElement.children[3].textContent;
    apiDeleting(id);
  }
  if(e.target.classList.contains("update"))
   updating(e.target.parentElement.parentElement)
});

async function apiDeleting(id){
  if(confirm("Are You confirm")){
 let res = await fetch(`http://localhost:8080/Spring_Mvc/deleteTeacher/${id}`,{
   method : "DELETE",
 }).then(()=>location.reload());
 let data = await res.json();
 return data;
  }
}
async function Login(){
  let bodyData = {
    "username" : id.value,
     "password" : tname.value, 
  };
  let res = await fetch('http://localhost:8080/Spring_Mvc/addLogin',{
    headers:{
      "Content-Type":"application/json"
    },   
    method : "POST",
    body  : JSON.stringify(bodyData)
  });
}
async function UpdateLogin(id,name){
  let bodyData = {
    "username" : id,
     "password" : name, 
  };
  let res = await fetch('http://localhost:8080/Spring_Mvc/addLogin',{
    headers:{
      "Content-Type":"application/json"
    },   
    method : "POST",
    body  : JSON.stringify(bodyData)
  });
}
