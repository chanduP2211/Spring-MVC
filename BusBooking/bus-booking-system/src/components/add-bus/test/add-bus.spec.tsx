import { newSpecPage } from '@stencil/core/testing';
import { AddBus } from '../add-bus';

describe('add-bus', () => {
  it('renders', async () => {
    const page = await newSpecPage({
      components: [AddBus],
      html: `<add-bus></add-bus>`,
    });
    expect(page.root).toEqualHtml(`
      <add-bus>
        <mock:shadow-root>
          <slot></slot>
        </mock:shadow-root>
      </add-bus>
    `);
  });
});
