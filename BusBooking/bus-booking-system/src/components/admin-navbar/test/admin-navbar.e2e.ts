import { newE2EPage } from '@stencil/core/testing';

describe('admin-navbar', () => {
  it('renders', async () => {
    const page = await newE2EPage();
    await page.setContent('<admin-navbar></admin-navbar>');

    const element = await page.find('admin-navbar');
    expect(element).toHaveClass('hydrated');
  });
});
