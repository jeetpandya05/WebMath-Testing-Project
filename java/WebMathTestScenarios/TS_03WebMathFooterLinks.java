package WebMathTestScenarios;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.By;

public class TS_03WebMathFooterLinks extends BaseClass {

	@Test
	public void validateHomeFooterButton() {
		driver.findElement(By.xpath(footerprop.getProperty("home"))).click();

		if (driver.findElement(By.xpath(homepageprop.getProperty("homepage"))).isDisplayed()) {
			Assert.assertTrue(true);
		}
	}

	@Test
	public void validateContactUsButton() {
		driver.findElement(By.xpath(footerprop.getProperty("contactus"))).click();

		if (driver.findElement(By.xpath(footerprop.getProperty("contactuspage"))).isDisplayed()) {
			Assert.assertTrue(true);
		}
	}

	@Test
	public void validateAboutWebmathButton() {
		driver.findElement(By.xpath(footerprop.getProperty("aboutwebmath"))).click();

		if (driver.findElement(By.xpath(footerprop.getProperty("aboutwebmathpage"))).isDisplayed()) {
			Assert.assertTrue(true);
		}
	}

	@Test
	public void validateWhyWebmathButton() {
		driver.findElement(By.xpath(footerprop.getProperty("whywebmath"))).click();

		if (driver.findElement(By.xpath(footerprop.getProperty("whywebmathpage"))).isDisplayed()) {
			Assert.assertTrue(true);
		}
	}

	@Test
	public void validateWebsiteMapButton() {
		driver.findElement(By.xpath(footerprop.getProperty("websitemap"))).click();

		if (driver.findElement(By.xpath(footerprop.getProperty("websitemappage"))).isDisplayed()) {
			Assert.assertTrue(true);
		}
	}

	@Test
	public void validatePrivacyPolicyButton() {
		driver.findElement(By.xpath(footerprop.getProperty("privacypolicy"))).click();

		if (driver.findElement(By.xpath(footerprop.getProperty("privacypolicypage"))).isDisplayed()) {
			Assert.assertTrue(true);
		}
	}
}
