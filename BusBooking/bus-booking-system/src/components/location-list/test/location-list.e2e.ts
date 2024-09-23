import { newE2EPage } from '@stencil/core/testing';

describe('location-list', () => {
  it('renders', async () => {
    const page = await newE2EPage();
    await page.setContent('<location-list></location-list>');

    const element = await page.find('location-list');
    expect(element).toHaveClass('hydrated');
  });
});
