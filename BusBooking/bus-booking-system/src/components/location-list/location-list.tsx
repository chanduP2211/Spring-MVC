import { Component, State, h, Prop } from '@stencil/core';

@Component({
  tag: 'location-list',
  styleUrl: 'location-list.css',
  shadow: true,
})
export class LocationList {

  @State() loc_Terminal:HTMLInputElement
  @State() loc_City:HTMLInputElement
  @State() loc_State:HTMLInputElement
  @Prop() terminal:string
  @Prop() city:string
  @Prop() state:string
    render() {
      return (
          <div>
          <div class='parent'>
          <form>
            <div class='parent-ele'>
           <div class="child">
              <input type="text" value={this.terminal} placeholder='TERMINAL' ref={el=>this.loc_Terminal=el}/>
           </div>
           <div class="child">
              <input type="text" value={this.city} placeholder='CITY' ref={el=>this.loc_City=el}/>
           </div>
           <div class="child">
              <input type="text" value={this.state} placeholder='STATE' ref={el=>this.loc_State=el}/>
           </div>
           <div class="child">
              <button onClick={this.submiting.bind(this)}>SUBMIT</button> 
           </div>
           </div>
           </form>
           </div>
        </div>
      );
    }
    submiting(){
       if(this.loc_Terminal.value === ''||this.loc_City.value === ''||this.loc_State.value === ''){
           alert('Plz Fill All The data')
           return false
       }
       else{
        let locationDetails:any[] = JSON.parse(localStorage.getItem('locationDetails')||'[]')
        locationDetails.push(
          {
            terminal : this.loc_Terminal.value,
            city : this.loc_City.value,
            state : this.loc_State.value
          }
        )
        localStorage.setItem('locationDetails',JSON.stringify(locationDetails))
       }
    }

}
