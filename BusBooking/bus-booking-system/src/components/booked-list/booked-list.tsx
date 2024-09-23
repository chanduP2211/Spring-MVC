import { Component, Host, h } from '@stencil/core';

@Component({
  tag: 'booked-list',
  styleUrl: 'booked-list.css',
  shadow: true,
})
export class BookedList {

  render() {
    return (
      <Host>
        <slot></slot>
      </Host>
    );
  }

}
