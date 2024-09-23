let main1 = document.querySelector(".main1");
let main2 = document.querySelector(".main2");
let subject_name = document.querySelector("#id");
let teacher_name = document.querySelector("#name");
let tbody = document.querySelector(".tbody");
let update = document.querySelector(".up");
let submit = document.querySelector(".submit");
apiGetting();
function submiting() {
  if (validation(subject_name, teacher_name))
  return false;
  else{
    if(apiCalling())
    alert("Data Entered Successfully")
  apiGetting();
  resetting();
  closing();
  }
  return true;
}

function resetting() {
  subject_name.value = "";
  teacher_name.value = "";
}

function inserting() {
  update.style.display = "none";
  main1.style.display = "none";
  main2.style.display = "block";
}

function closing() {
  main1.style.display = "block";
  main2.style.display = "none";
}
function validation(subject_name, teacher_name) {
  if (subject_name.value === "" || teacher_name.value === "") {
    alert("Plz Fill All data");
    return true;
  }
 else
  return false;
}

function updating(tr){
  update.style.display = "block";
  submit.style.display = "none";
  main1.style.display = "none";
  main2.style.display = "block";
  subject_name.value = tr.cells[1].textContent;
  teacher_name.value = tr.cells[2].textContent;
  console.log(update.addEventListener("click",apiCalling))

}

async function apiCalling(){
  let bodyData = {
     "subject" : subject_name.value,
     "teacher" : teacher_name.value
  }
  let res = await fetch('http://localhost:8080/Spring_Mvc/addSubject',{
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
  let res = await fetch('http://localhost:8080/Spring_Mvc/getSubject')
  let subject = await res.json();
  let data="";
  let count=0;
  subject.forEach((element)=>{
    data += `<tr><td>${++count}</td><td>${element.subject}</td><td>${element.teacher}</td><td class="td"><i class="fa-solid fa-user-pen update"></i><i class="fa-solid fa-trash delete"></i></td></tr>`;
  })
  tbody.innerHTML = data;
}
tbody.addEventListener("click", (e)=>{
  if(e.target.classList.contains("delete")){
    let id = e.target.parentElement.parentElement.children[1].textContent;
    console.log(apiDeleting(id));
  }
  if(e.target.classList.contains("update"))
   updating( e.target.parentElement.parentElement);
});
async function apiDeleting(name){
  if(confirm("Are You confirm")){
 let res = await fetch(`http://localhost:8080/Spring_Mvc/deleteSubject/${name}`,{
   method : "DELETE",
 }).then(()=>location.reload());
 let data = await res.json();
 return data;
  }
}
