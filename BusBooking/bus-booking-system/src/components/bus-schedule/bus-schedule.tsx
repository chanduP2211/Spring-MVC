import { Component, State, h, Prop } from '@stencil/core';

@Component({
  tag: 'bus-schedule',
  styleUrl: 'bus-schedule.css',
  shadow: true,
})
export class BusSchedule {

  @State() bus_name:HTMLInputElement
  @State() from:HTMLSelectElement
  @State() to:HTMLSelectElement
  @State() departure_time:HTMLInputElement
  @State() estimated_arrival:HTMLInputElement
  @State() availability:HTMLInputElement
  @State() price:HTMLInputElement
  @State() busData:any[]
  @State() locationData:any[]
  @Prop() city:string
  @Prop() state:string

componentWillLoad(){
this.busData = JSON.parse(localStorage.getItem('busDetails'))
this.locationData = JSON.parse(localStorage.getItem('locationDetails'))
}
    render() {

      return (
          <div>
          <div class='parent'>
          <form>
            <div class='parent-ele'>
           <div class="child">
            <select>
              {
                 this.busData.map(element=>
                  <option value={element.busName | element.busNumber }>{element.busNumber | element.busName}</option>
              )
              }
             </select>
           </div>
           <div class="child">
           <select ref={el=>this.from = el}>
              {
                this.locationData.map(element=>{
                  return(
                    <option value={ element.terminal | element.city | element.state }>{element.city}</option>
                  )
                })
              }
             </select>
           </div>
           <div class="child">
           <select ref={el=>this.to = el}>
              {
                this.locationData.map(element=>{
                  return(
                    <option value={ element.terminal | element.city | element.state }>{element.city}</option>
                  )
                })
              }
             </select>
           </div>
           <div class="child">
             DEPARTURE <input type='datetime-local' placeholder='DEPARTURE TIME' ref={el=>this.departure_time=el}/>
           </div>
           <div class="child">
             ARRIVAL <input type="datetime-local" placeholder='ESTIMATED ARRIVAL' ref={el=>this.estimated_arrival=el}/>
           </div>
           <div class="child">
              <input type="number"  placeholder='AVAILABILITY' ref={el=>this.availability=el}/>
           </div>
           <div class="child">
              <input type="number"  placeholder='PRICE' ref={el=>this.price=el}/>
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
       if(this.bus_name.value === ''||this.from.value === ''||this.to.value === ''||this.availability.value === ''||this.departure_time.value === ''||this.estimated_arrival.value === ''||this.price.value === ''){
           alert('Plz Fill All The data')
           return false
       }
       else{
        let scheduleDetails:any[] = JSON.parse(localStorage.getItem('scheduleDetails')||'[]')
        scheduleDetails.push(
          {
            busName : this.bus_name.value,
            from : this.from.value,
            to : this.to.value,
            departure : this.departure_time.value,
            arrival : this.estimated_arrival.value,
            availability : this.availability.value,
            price : this.price.value
          }
        )
        localStorage.setItem('scheduleDetails',JSON.stringify(scheduleDetails))
       }
    }

}
