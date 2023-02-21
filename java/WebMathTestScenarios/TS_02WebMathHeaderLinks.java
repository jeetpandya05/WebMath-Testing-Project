package WebMathTestScenarios;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TS_02WebMathHeaderLinks extends BaseClass {

	@Test
	public void validateHomeHeaderButton() {
		driver.findElement(By.xpath(headerprop.getProperty("home"))).click();

		if (driver.findElement(By.xpath(homepageprop.getProperty("homepage"))).isDisplayed()) {
			Assert.assertTrue(true);
		}
	}

	@Test
	public void validateMathForEveryoneButton() {
		driver.findElement(By.xpath(headerprop.getProperty("mathforeveryone"))).click();

		if (driver.findElement(By.xpath(headerprop.getProperty("mathforeveryonepage"))).isDisplayed()) {
			Assert.assertTrue(true);
		}
	}
	
	@Test
	public void validateGeneralMathButton() {
		driver.findElement(By.xpath(headerprop.getProperty("generalmath"))).click();

		if (driver.findElement(By.xpath(headerprop.getProperty("generalmathpage"))).isDisplayed()) {
			Assert.assertTrue(true);
		}
	}
	
	@Test
	public void validateKindergartenbutton() {
		driver.findElement(By.xpath(headerprop.getProperty("kindergarten"))).click();

		if (driver.findElement(By.xpath(headerprop.getProperty("kindergartenpage"))).isDisplayed()) {
			Assert.assertTrue(true);
		}
	}
	
	@Test
	public void validateAlgebraButton() {
		driver.findElement(By.xpath(headerprop.getProperty("algebra"))).click();

		if (driver.findElement(By.xpath(headerprop.getProperty("algebrapage"))).isDisplayed()) {
			Assert.assertTrue(true);
		}
	}
	
	@Test
	public void validatePlotsnGeometryButton() {
		driver.findElement(By.xpath(headerprop.getProperty("plotsgeom"))).click();

		if (driver.findElement(By.xpath(headerprop.getProperty("plotsgeompage"))).isDisplayed()) {
			Assert.assertTrue(true);
		}
	}
	
	@Test
	public void validateTrignCalculusButton() {
		driver.findElement(By.xpath(headerprop.getProperty("trigcalculus"))).click();

		if (driver.findElement(By.xpath(headerprop.getProperty("trigcalculuspage"))).isDisplayed()) {
			Assert.assertTrue(true);
		}
	}
	
	@Test
	public void validateOtherStuffButton() {
		driver.findElement(By.xpath(headerprop.getProperty("otherstuff"))).click();

		if (driver.findElement(By.xpath(headerprop.getProperty("otherstuffpage"))).isDisplayed()) {
			Assert.assertTrue(true);
		}
	}
}
