import { Component, Host, h } from '@stencil/core';
import { createRouter, Route } from 'stencil-router-v2';
const Router = createRouter();
@Component({
  tag: 'libe-router',
})
export class LibeRouter {
  render() {
    return (
      <Host>
        <Router.Switch>
          <Route path="/">
            <add-bus />
          </Route>
          <Route path="/schedule">
            <bus-schedule/>
          </Route>
          <Route path="/bookedList">
            <admin-signup />
          </Route>
          <Route path="/busList">
            <bus-show />
          </Route>
          <Route path="/locationList">
            <location-list-show />
          </Route>
        </Router.Switch>
      </Host>
    );
  }
}
