import { newE2EPage } from '@stencil/core/testing';

describe('bus-schedule', () => {
  it('renders', async () => {
    const page = await newE2EPage();
    await page.setContent('<bus-schedule></bus-schedule>');

    const element = await page.find('bus-schedule');
    expect(element).toHaveClass('hydrated');
  });
});
