let div1 = document.querySelector(".div1");
let div2 = document.querySelector(".div2");
async function apiReport(){
  let tbody = document.querySelector(".tbody");
  let res = await fetch('http://localhost:8080/Spring_Mvc/getSection')
  let subject = await res.json();
  let data="";
  subject.forEach((element)=>{
    let percentage = Math.round(((element.present)/(element.absent+element.present))*100);
    data += `<tr><td>${element.rollNo}</td><td>${element.name}</td><td>${element.section}</td><td>${element.present}</td><td>${element.absent}</td><td>${element.absent+element.present}</td><td>${percentage}%</td></tr>`;
  })
  tbody.innerHTML = data;
}
function report() {
  div1.style.display = "block";
  div2.style.display = "none";
  let thead = document.querySelector(".thead");
  thead.innerHTML = `<tr><th>ID</th><th>NAME</th><th>CLASS</th><th>PRESENT CLASSES</th><th>ABSENT CLASSES</th><th>TOTAL CLASSES</th><th>PERCENTEGE</th></tr>`;
  apiReport()
}
let tbody1 = document.querySelector(".tbody1");
function bydate() {
  div2.style.display = "block";
  div1.style.display = "none";
  let thead = document.querySelector(".thead1");
  let date1 = document.querySelector("#date").value;
  thead.innerHTML = `<tr><th>ID</th><th>NAME</th><th>CLASS</th><th>SUBJECT</th><th>ATTENDANCE</th><th>DATE</th></tr>`;
 apiGetting(date1);
}
async function apiGetting(date){
  let res = await fetch('http://localhost:8080/Spring_Mvc/getClass')
  let subject = await res.json();
  let data="";
  subject.forEach((element)=>{
    if(element.date === date)
    data += `<tr><td>${element.rollNo}</td><td>${element.name}</td><td>${element.section}</td><td>${element.subject}</td><td>${element.attendance}</td><td>${element.date}</td></tr>`;
  })
  tbody1.innerHTML = data;
}
