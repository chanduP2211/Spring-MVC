let div1 = document.querySelector(".main2");
let data = "";
let tname ="";
apiProfile();

async function apiProfile(){
   
    let response = await fetch('http://localhost:8080/Spring_Mvc/getLogin');
    let details = await response.json();
    let check = "";
    details.forEach((element)=>{
      check = element.username;
      
    })

    let res = await fetch('http://localhost:8080/Spring_Mvc/getTeacher');
    let teacher = await res.json();
    teacher.forEach((element)=>{
      if(check === element.id){
        tname = element.name;
        data += ` <table>
        <tbody>
           <tr>
               <th>ID</th>
               <td>${element.id}</td>
           </tr>
           <tr>
               <th>Name</th>
               <td>${element.name}</td>
           </tr>
           <tr>
               <th>Gender</th>
               <td>${element.gender}</td>
           </tr>
           <tr>
               <th>Email</th>
               <td>${element.email}</td>
         </tr>
           <tr>
               <th>Phone</th>
               <td>${element.phone}</td>
           </tr>
           <tr>
               <th>Degree</th>
               <td>${element.degree}</td>
           </tr>
           <tr>
               <th> Experience</th>
               <td>${element.experience}</td>
           </tr>
           <tr>
                <th>Address</th>
               <td>${element.address}</td>
           </tr>
       </tbody>
   </table>`;
      }
    })
    div1.innerHTML = data;
    }
