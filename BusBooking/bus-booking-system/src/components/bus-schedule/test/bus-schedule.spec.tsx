import { newSpecPage } from '@stencil/core/testing';
import { BusSchedule } from '../bus-schedule';

describe('bus-schedule', () => {
  it('renders', async () => {
    const page = await newSpecPage({
      components: [BusSchedule],
      html: `<bus-schedule></bus-schedule>`,
    });
    expect(page.root).toEqualHtml(`
      <bus-schedule>
        <mock:shadow-root>
          <slot></slot>
        </mock:shadow-root>
      </bus-schedule>
    `);
  });
});
