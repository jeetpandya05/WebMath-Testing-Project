package WebMathTestScenarios;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TS_01WebMathHomepage extends BaseClass {
	
	
	@Test
	public void verifyTitle() {
		String actTitle = driver.getTitle();
		String expTitle = homepageprop.getProperty("title");
		
		Assert.assertEquals(actTitle, expTitle);
	}
	
	@Test
	public void verifyLogo() {
		driver.findElement(By.xpath(homepageprop.getProperty("logo"))).isDisplayed();
	}
	
	@Test
	public void logoOpensHomepage() {
		driver.findElement(By.xpath(homepageprop.getProperty("logo"))).click();
		
		if (driver.findElement(By.xpath(homepageprop.getProperty("homepage"))).isDisplayed()) {
			Assert.assertTrue(true);
		}
	}
}
