import { newE2EPage } from '@stencil/core/testing';

describe('booked-list', () => {
  it('renders', async () => {
    const page = await newE2EPage();
    await page.setContent('<booked-list></booked-list>');

    const element = await page.find('booked-list');
    expect(element).toHaveClass('hydrated');
  });
});
