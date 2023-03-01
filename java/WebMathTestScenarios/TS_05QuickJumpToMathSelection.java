package WebMathTestScenarios;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;

public class TS_05QuickJumpToMathSelection extends BaseClass {
	
	Select quickjump;
	
	@BeforeMethod
	public void QuickJumpDropdown() {
		quickjump = new Select(driver.findElement(By.id(quickjumpprop.getProperty("dropdown"))));
	}

	@Test
	public void NumbersAdditionPage() {				
		quickjump.selectByVisibleText(quickjumpprop.getProperty("NumbersAddition"));
		
		if (driver.findElement(By.xpath(quickjumpprop.getProperty("NumbersAdditionPage"))).isDisplayed()) {
			Assert.assertTrue(true);
		}
	}

	@Test
	public void CoinsCountingPage() {
		quickjump.selectByVisibleText(quickjumpprop.getProperty("CountingCoins"));
		
		if (driver.findElement(By.xpath(quickjumpprop.getProperty("CountingCoinsPage"))).isDisplayed()) {
			Assert.assertTrue(true);
		}
	}

	@Test
	public void ConversionAreaPage() {
		quickjump.selectByVisibleText(quickjumpprop.getProperty("ConversionArea"));
		
		if (driver.findElement(By.xpath(quickjumpprop.getProperty("ConversionAreaPage"))).isDisplayed()) {
			Assert.assertTrue(true);
		}
	}

	@Test
	public void ConvertTempPage() {
		quickjump.selectByVisibleText(quickjumpprop.getProperty("ConvertTemp"));
		
		if (driver.findElement(By.xpath(quickjumpprop.getProperty("ConvertTempPage"))).isDisplayed()) {
			Assert.assertTrue(true);
		}
	}

	@Test
	public void NumbersMultiplyPage() {
		quickjump.selectByVisibleText(quickjumpprop.getProperty("NumbersMultiply"));
		
		if (driver.findElement(By.xpath(quickjumpprop.getProperty("NumbersMultiplyPage"))).isDisplayed()) {
			Assert.assertTrue(true);
		}
	}
}
