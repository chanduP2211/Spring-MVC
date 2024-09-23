let tbody2 = document.querySelector("tbody");
let thead2 = document.querySelector("thead");
thead2.innerHTML = `<tr><th>ID</th><th>NAME</th><th>CLASS</th><th>PresentClasses</th><th>AbsentClasses</th><th>TotalClasses</th><th>Percentage</th></tr>`;
apiReport();
async function apiReport(){
  let res = await fetch('http://localhost:8080/Spring_Mvc/getSection')
  let subject = await res.json();
  let data="";
  subject.forEach((element)=>{
    let percentage = Math.round(((element.present)/(element.absent+element.present))*100);
    data += `<tr><td>${element.rollNo}</td><td>${element.name}</td><td>${element.section}</td><td>${element.present}</td><td>${element.absent}</td><td>${element.absent+element.present}</td><td>${percentage}%</td></tr>`;
  })
  tbody2.innerHTML = data;
}