let div = document.querySelector(".main2");
apiProfile();
async function apiProfile(){
    let response = await fetch('http://localhost:8080/Spring_Mvc/getLog');
    let details = await response.json();
    let check = "";
    details.forEach((element)=>{
      check = element.username;
    })

    let res = await fetch('http://localhost:8080/Spring_Mvc/getStudent');
    let student = await res.json()
    let data = "";
    student.forEach((element)=>{
        if(check === element.id){
            data += ` <table>
            <tbody>
                <tr>
                    <th>ID</th>
                    <td>${element.id}</td>
                </tr>
                <tr>
                    <th>Name</th>
                    <td>${element.fname+" "+element.lname}</td>
                </tr>
                <tr>
                    <th>Gender</th>
                    <td>${element.gender}</td>
                </tr>
                <tr>
                    <th>DOB</th>
                    <td>${element.dob}</td>
                </tr>
                <tr>
                    <th>Phone</th>
                    <td>${element.phone}</td>
                </tr>
                <tr>
                    <th>Class</th>
                    <td>${element.section}</td>
                </tr>
                <tr>
                    <th>Address</th>
                    <td>${element.address}</td>
                </tr>
              </tbody>
           </table>`;
        }
    })
    div.innerHTML = data;
}