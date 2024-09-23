import { newE2EPage } from '@stencil/core/testing';

describe('bus-show', () => {
  it('renders', async () => {
    const page = await newE2EPage();
    await page.setContent('<bus-show></bus-show>');

    const element = await page.find('bus-show');
    expect(element).toHaveClass('hydrated');
  });
});
