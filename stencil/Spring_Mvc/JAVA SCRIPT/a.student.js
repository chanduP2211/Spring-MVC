let id = document.getElementById("id");
let fname = document.getElementById("fname");
let lname = document.getElementById("lname");
let gender = document.getElementById("gender");
let dob = document.getElementById("dob");
let phone = document.getElementById("phone");
let class1 = document.getElementById("class");
let address = document.getElementById("address");
let tbody = document.querySelector(".tbody");
let main1 = document.querySelector(".main1");
let main2 = document.querySelector(".main2");
let update = document.querySelector(".up");
let submit = document.querySelector(".submit");

apiGetting()
function inserting() {
  update.style.display = "none";
  main1.style.display = "none";
  main2.style.display = "block";
}
function adding() {
  main1.style.display = "block";
  main2.style.display = "none";
}

function submiting() {
   if (!validation()) return;
    if(apiCalling())
  adding();
}

function resetting() {
  id.value = "";
  fname.value = "";
  lname.value = "";
  gender.value = "";
  dob.value = "";
  phone.value = "";
  class1.value = "";
  address.value = "";
}

tbody.addEventListener("click", deleting);

function deleting(e) {
  if (e.target.classList.contains("b")) {
    if (confirm("Are you Sure"))
      localStorageDelete(e.target.parentElement.parentElement);
  }
  if (e.target.classList.contains("u"))
    updating(e.target.parentElement.parentElement);
}


function updating(tr) {
  update.style.display = "block";
  submit.style.display = "none";
  main1.style.display = "none";
  main2.style.display = "block";
  id.value = tr.cells[1].textContent;
  fname.value = tr.cells[2].textContent;
  lname.value = tr.cells[3].textContent;
  gender.value = tr.cells[4].textContent;
  dob.value = tr.cells[5].textContent;
  phone.value = tr.cells[6].textContent;
  class1.value = tr.cells[7].textContent;
  address.value = tr.cells[8].textContent;
  updateLogin(id.value,fname.value)
  console.log(update.addEventListener("click",apiCalling))
}
function validation() {
  let cphone = /[0-9]{10}/;
  let cid = /[\d+]{4,8}/;
  let cname = /[a-zA-Z]/;
  if (
    id.value === "" ||
    phone.value === "" ||
    dob.value === "" ||
    class1.value === "" ||
    address.value === "" ||
    lname.value === "" ||
    fname.value === "" ||
    gender.value === ""
  ) {
    alert("Plz Fill all The data");
    return false;
  }
  if (!cphone.test(phone.value)) {
    alert("plz enter valid phone number");
    return false;
  }
  if (!cid.test(id.value)) {
    alert("plz enter valid id");
    return false;
  }
  if (!cname.test(fname.value)) {
    alert("enter valid name");
    return false;
  }

  return true;
}

async function apiCalling(){
  Login()
  let bodyData = {
     "id" : id.value,
     "fname" : fname.value,
     "lname" : lname.value,
     "gender" : gender.value,
     "dob" : dob.value,
     "phone" : phone.value,
     "section" : class1.value,
     "address" : address.value 
  };
  let res = await fetch('http://localhost:8080/Spring_Mvc/addStudent',{
    headers:{
      "Content-Type":"application/json"
    },   
    method : "POST",
    body  : JSON.stringify(bodyData)
  }).then(()=>location.reload());
  let data = await res.json();
  alert("data entered successfully");
return data;
}
async function apiGetting(){
  let res = await fetch('http://localhost:8080/Spring_Mvc/getStudent')
  let student = await res.json();
  let data="";
  let count = 0;
  student.forEach((element)=>{
    data += `<tr><td>${++count}</td><td>${element.id}</td><td>${
      element.fname
    }</td><td>${element.lname}</td><td>${element.gender}</td><td>${
      element.dob
    }</td><td>${element.phone}</td><td>${element.section}</td><td>${
      element.address
    }</td><td class="td"><i class="fa-solid fa-user-pen update"></i><i class="fa-solid fa-trash delete"></i></td></tr>`;
    
  })
  tbody.innerHTML = data;
}

tbody.addEventListener("click", (e)=>{
  console.log(e.target)
  if(e.target.classList.contains("delete")){
    let id = e.target.parentElement.parentElement.children[1].textContent;
    console.log(id)
    apiDeleting(id);

  }
  if(e.target.classList.contains("update")){
   updating(e.target.parentElement.parentElement)
  }

});

async function apiDeleting(id){
  if(confirm("Are You confirm")){
 let res = await fetch(`http://localhost:8080/Spring_Mvc/deleteStudent/${id}`,{
   method : "DELETE"
 }).then(()=>location.reload());
  }
}
async function Login(){
  let bodyData = {
    "username" : id.value,
     "password" : fname.value, 
  };
  let res = await fetch('http://localhost:8080/Spring_Mvc/addLogin',{
    headers:{
      "Content-Type":"application/json"
    },   
    method : "POST",
    body  : JSON.stringify(bodyData)
  });
}

async function updateLogin(id,fname){
  let bodyData = {
    "username" : id,
     "password" : fname, 
  };
  let res = await fetch('http://localhost:8080/Spring_Mvc/addLogin',{
    headers:{
      "Content-Type":"application/json"
    },   
    method : "POST",
    body  : JSON.stringify(bodyData)
  });
}
