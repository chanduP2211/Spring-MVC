import { newE2EPage } from '@stencil/core/testing';

describe('add-bus', () => {
  it('renders', async () => {
    const page = await newE2EPage();
    await page.setContent('<add-bus></add-bus>');

    const element = await page.find('add-bus');
    expect(element).toHaveClass('hydrated');
  });
});
