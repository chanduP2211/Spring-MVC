import { newSpecPage } from '@stencil/core/testing';
import { LocationList } from '../location-list';

describe('location-list', () => {
  it('renders', async () => {
    const page = await newSpecPage({
      components: [LocationList],
      html: `<location-list></location-list>`,
    });
    expect(page.root).toEqualHtml(`
      <location-list>
        <mock:shadow-root>
          <slot></slot>
        </mock:shadow-root>
      </location-list>
    `);
  });
});
