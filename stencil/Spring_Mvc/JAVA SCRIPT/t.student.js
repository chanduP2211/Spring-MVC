let div = document.querySelector(".div2");
let table = document.querySelector(".table");
var classname = document.querySelector("#input");
let tbody = document.querySelector(".tbody");
let date = document.querySelector("#date");
let password = sessionStorage.getItem("password");
let username = "";
var date1 = "";
let present = 0;
let absent = 0;
async function apiGetting(e){
  let res = await fetch('http://localhost:8080/Spring_Mvc/getStudent')
  let student = await res.json();
  let data="";
  student.forEach((element)=>{
    if(element.section === classname.value){  
    data += `<tr><td class='td1'>${element.id}</td><td class='td2'>${
     element.fname + " " + element.lname
    }</td><td>${element.section}</td><td><input type="radio" name=${
      element.id
    } class="present" value="Present">Present<input type="radio" name=${
     element.id
    } class="absent" value="Absent">Absent</td></tr>`;
  } 
  })
  tbody.innerHTML = data;
}

async function submiting(){

date1 = date.value;
    for (let tr of tbody.children) {
       present = 0;
       absent = 0;
      let student_id = tr.cells[0].textContent;
      let student_name = tr.cells[1].textContent
      let value = document.forms["form"][`${student_id}`].value;
      await apiGet(student_id,student_name ,value,present,absent)
    } 
    alert("Attendance Taken Successfully")
}

async function apiGet(id,name,attend){
let res = await fetch('http://localhost:8080/Spring_Mvc/getSection');
let data = await res.json();
let result = true;
if(data){
data.forEach((element)=>{
  if(id === element.rollNo){
    result = false;
   apiCalling(element.rollNo,element.name,element.present,element.absent,attend)

  }
})
if(result)
apiCall(id,name,attend,present,absent)
}
else
apiCall(id,name,attend)
apiAttendance(id,name,attend,present,absent)

}

async function apiCalling(id,name,present,absent,attend){
  if(attend === "Present")
  present++;
  else
  absent++;
  let subject = await getSubject(tname)
  let bodyData = {
    "rollNo" : id,
    "name" : name,
    "section":classname.value,
    "subject":subject,
    "present":present,
    "absent": absent,
    "attend": attend
 };
 let res = await fetch('http://localhost:8080/Spring_Mvc/updateSection',{
   headers:{
     "Content-Type":"application/json"
   },   
   method : "POST",
   body  : JSON.stringify(bodyData)
 });
 let data = await res.json();
return data;
}
async function apiCall(id,name,attend,present,absent){
  if(attend === "Present")
  present++;
  else
  absent++;

  let subject = await getSubject(tname)
  let bodyData = {
    "rollNo" : id,
    "name" : name,
    "section":classname.value,
    "subject":subject,
    "present":present,
    "absent": absent,
    "attend": attend
 };
 let res = await fetch('http://localhost:8080/Spring_Mvc/addSection',{
   headers:{
     "Content-Type":"application/json"
   },   
   method : "POST",
   body  : JSON.stringify(bodyData)
 });
 let data = await res.json();
return data;
}
async function apiAttendance(id,name,attend){
  let subject = await  getSubject(tname)
  let bodyData = {
    "rollNo" : id,
    "name" : name,
    "section":classname.value,
    "subject":subject,
    "attendance" : attend,
    "date": date1
 };
 let res = await fetch('http://localhost:8080/Spring_Mvc/addAttendance',{
   headers:{
     "Content-Type":"application/json"
   },   
   method : "POST",
   body  : JSON.stringify(bodyData)
 });
 let data = await res.json();
return data;
}
async function getSubject(tname){
  let res = await fetch('http://localhost:8080/Spring_Mvc/getSubject')
  let subject = await res.json();
  let sub = "";
  subject.forEach((element)=>{
    if(tname === element.faculty_name)
    sub = element.subject_name;
  })
 return sub;
}



