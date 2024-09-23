import { newSpecPage } from '@stencil/core/testing';
import { AdminNavbar } from '../admin-navbar';

describe('admin-navbar', () => {
  it('renders', async () => {
    const page = await newSpecPage({
      components: [AdminNavbar],
      html: `<admin-navbar></admin-navbar>`,
    });
    expect(page.root).toEqualHtml(`
      <admin-navbar>
        <mock:shadow-root>
          <slot></slot>
        </mock:shadow-root>
      </admin-navbar>
    `);
  });
});
