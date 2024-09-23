import { newE2EPage } from '@stencil/core/testing';

describe('bus-schedule-show', () => {
  it('renders', async () => {
    const page = await newE2EPage();
    await page.setContent('<bus-schedule-show></bus-schedule-show>');

    const element = await page.find('bus-schedule-show');
    expect(element).toHaveClass('hydrated');
  });
});
