import { newE2EPage } from '@stencil/core/testing';

describe('location-list-show', () => {
  it('renders', async () => {
    const page = await newE2EPage();
    await page.setContent('<location-list-show></location-list-show>');

    const element = await page.find('location-list-show');
    expect(element).toHaveClass('hydrated');
  });
});
