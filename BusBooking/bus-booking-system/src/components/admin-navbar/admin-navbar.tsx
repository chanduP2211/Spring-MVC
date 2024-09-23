import { Component, h, State } from '@stencil/core';

@Component({
  tag: 'admin-navbar',
  styleUrl: 'admin-navbar.css',
  shadow: true,
})
export class AdminNavbar {

  @State() valid:boolean=false
  render() {
    return (
      <div class='home'>
        <div class='navBtn'>
          <button onClick={this.validate.bind(this)} >MENU</button>
        </div>
          <div class={this.valid?'show navBar':'hide navBar'}>
              <ul class='nav'>
                  <li onClick={this.home.bind(this)}>HOME</li>
                  <li onClick={this.schedule.bind(this)}>SCHEDULE</li>
                  <li onClick={this.bookedList.bind(this)}>BOOKED LIST</li>
                  <li onClick={this.busList.bind(this)}>BUS LIST</li>
                  <li onClick={this.locationList.bind(this)}>LOCATION LIST</li>
                  <li onClick={this.logOut.bind(this)}>LOG OUT</li>
              </ul>
          </div>
      </div>
    );
  }
home(){
 location.href='../home'
}
schedule(){
  location.href='../schedule'
}
bookedList(){
   location.href='../bookedList'
}
busList(){
   location.href='../busList'
}
locationList(){
   location.href='../locationList'
}
logOut(){
   location.href='../logOut'
}
validate(){
  this.valid = !this.valid
}
}
