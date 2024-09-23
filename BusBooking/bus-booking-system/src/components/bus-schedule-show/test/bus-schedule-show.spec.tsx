import { newSpecPage } from '@stencil/core/testing';
import { BusScheduleShow } from '../bus-schedule-show';

describe('bus-schedule-show', () => {
  it('renders', async () => {
    const page = await newSpecPage({
      components: [BusScheduleShow],
      html: `<bus-schedule-show></bus-schedule-show>`,
    });
    expect(page.root).toEqualHtml(`
      <bus-schedule-show>
        <mock:shadow-root>
          <slot></slot>
        </mock:shadow-root>
      </bus-schedule-show>
    `);
  });
});
