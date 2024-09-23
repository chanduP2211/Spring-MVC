import { Component, h, Prop, State } from '@stencil/core';

@Component({
  tag: 'add-bus',
  styleUrl: 'add-bus.css',
  shadow: true,
})
export class AddBus {

@State() busName:HTMLInputElement
@State() busNumber:HTMLInputElement
@Prop() busname:string
@Prop() busnumber:string
  render() {
    return (
        <div>
        <div class='parent'>
        <form>
          <div class='parent-ele'>
         <div class="child">
            <input type="text" value={this.busname} placeholder='BUS NAME' ref={el=>this.busName=el}/>
         </div>
         <div class="child">
            <input type="text" value={this.busnumber} placeholder='BUS NUMBER' ref={el=>this.busNumber=el}/>
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
     if(this.busName.value === ''||this.busNumber.value === ''){
         alert('Plz Fill All The data')
         return false
     }
     else{
      let busDetails:any[] = JSON.parse(localStorage.getItem('busDetails')||'[]')
      busDetails.push(
        {
          busName : this.busName.value,
          busNumber : this.busNumber.value
        }
      )
      localStorage.setItem('busDetails',JSON.stringify(busDetails))
     }
  }
}
