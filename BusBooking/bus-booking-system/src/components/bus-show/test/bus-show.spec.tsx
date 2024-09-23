import { newSpecPage } from '@stencil/core/testing';
import { BusShow } from '../bus-show';

describe('bus-show', () => {
  it('renders', async () => {
    const page = await newSpecPage({
      components: [BusShow],
      html: `<bus-show></bus-show>`,
    });
    expect(page.root).toEqualHtml(`
      <bus-show>
        <mock:shadow-root>
          <slot></slot>
        </mock:shadow-root>
      </bus-show>
    `);
  });
});
