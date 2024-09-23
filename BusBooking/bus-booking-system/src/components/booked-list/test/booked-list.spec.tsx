import { newSpecPage } from '@stencil/core/testing';
import { BookedList } from '../booked-list';

describe('booked-list', () => {
  it('renders', async () => {
    const page = await newSpecPage({
      components: [BookedList],
      html: `<booked-list></booked-list>`,
    });
    expect(page.root).toEqualHtml(`
      <booked-list>
        <mock:shadow-root>
          <slot></slot>
        </mock:shadow-root>
      </booked-list>
    `);
  });
});
