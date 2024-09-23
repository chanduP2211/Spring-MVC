import { newSpecPage } from '@stencil/core/testing';
import { LocationListShow } from '../location-list-show';

describe('location-list-show', () => {
  it('renders', async () => {
    const page = await newSpecPage({
      components: [LocationListShow],
      html: `<location-list-show></location-list-show>`,
    });
    expect(page.root).toEqualHtml(`
      <location-list-show>
        <mock:shadow-root>
          <slot></slot>
        </mock:shadow-root>
      </location-list-show>
    `);
  });
});
