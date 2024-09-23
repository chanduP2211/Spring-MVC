let div2 = document.querySelector(".div2");
let tbody = document.querySelector("tbody");
let thead = document.querySelector("thead");

total();
async function total() {
  div2.style.display = "block";
  thead.innerHTML = `<tr><th>ID</th><th>NAME</th><th>CLASS</th><th>PRESENT CLASSES</th><th>ABSENT CLASSES</th><th>TOTAL CLASSES</th><th>PERCENTEGE</th></tr>`;
  await apiTotal();
  colors();
}
async function apiTotal(){

  let response = await fetch('http://localhost:8080/Spring_Mvc/getLog')
  let student = await response.json();
  let id ="";
  student.forEach((element)=>{
     id = element.username;
  })
  let res = await fetch('http://localhost:8080/Spring_Mvc/getSection')
  let subject = await res.json();
  let data="";
  subject.forEach((element)=>{
    if(id === element.rollNo){
    let percentage = Math.round(((element.present)/(element.absent+element.present))*100);
    data += `<tr><td>${element.rollNo}</td><td>${element.name}</td><td>${element.section}</td><td>${element.present}</td><td>${element.absent}</td><td>${element.absent+element.present}</td><td>${percentage}%</td></tr>`;
    }
  })
  tbody.innerHTML = data;
}
function colors() {
  for (let tr of tbody.children) {
    let str = tr.children[6].textContent;
    let str1 = str.substring(0, str.length - 1);
    if (parseInt(str1) < 50) {
      tr.setAttribute("style", "background-color:red;");
    } else if (parseInt(str1) < 75) {
      tr.setAttribute("style", "background-color:yellow;");
    } else tr.setAttribute("style", "background-color:green;");
  }
}
