package WebMathTestScenarios;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class TS_06MathFunctionsWorkingValidation extends TS_05QuickJumpToMathSelection {

	@Test
	public void NumbersAddition() {
		NumbersAdditionPage();
		driver.findElement(By.xpath(mathfunctionsprop.getProperty("Number1"))).sendKeys(mathfunctionsprop.getProperty("FirstNumber"));
		driver.findElement(By.xpath(mathfunctionsprop.getProperty("Number2"))).sendKeys(mathfunctionsprop.getProperty("SecondNumber"));
		driver.findElement(By.xpath(mathfunctionsprop.getProperty("AddButton"))).click();
		
		if (driver.findElement(By.xpath(mathfunctionsprop.getProperty("Error"))).isDisplayed()) {
			Assert.assertTrue(false);
		}
	}

	@Test
	public void CoinsCounting() {
		CoinsCountingPage();
		driver.findElement(By.xpath(mathfunctionsprop.getProperty("quarter"))).sendKeys(mathfunctionsprop.getProperty("Quarters"));
		driver.findElement(By.xpath(mathfunctionsprop.getProperty("dime"))).sendKeys(mathfunctionsprop.getProperty("Dimes"));
		driver.findElement(By.xpath(mathfunctionsprop.getProperty("nickel"))).sendKeys(mathfunctionsprop.getProperty("Nickels"));
		driver.findElement(By.xpath(mathfunctionsprop.getProperty("penny"))).sendKeys(mathfunctionsprop.getProperty("Pennies"));
		
		driver.findElement(By.xpath(mathfunctionsprop.getProperty("CountButton"))).click();
		
		driver.switchTo().frame(1);
		
		if (driver.findElement(By.xpath(mathfunctionsprop.getProperty("CoinsAnswer"))).isDisplayed()) {
			Assert.assertTrue(true);
		}
	}
	
	Select unit;

	@Test
	public void ConversionArea() {
		ConversionAreaPage();
		driver.findElement(By.xpath(mathfunctionsprop.getProperty("input1"))).sendKeys(mathfunctionsprop.getProperty("Area"));
		
		unit = new Select(driver.findElement(By.xpath(mathfunctionsprop.getProperty("unitSelect"))));
		unit.selectByVisibleText(mathfunctionsprop.getProperty("unit1"));
		
		driver.findElement(By.xpath(mathfunctionsprop.getProperty("ConvertButton"))).click();
		
		driver.switchTo().frame(1);
		
		if (driver.findElement(By.xpath(mathfunctionsprop.getProperty("AreaAnswer"))).isDisplayed()) {
			Assert.assertTrue(true);
		}
	}

	@Test
	public void ConvertTemp() {
		ConvertTempPage();
		driver.findElement(By.xpath(mathfunctionsprop.getProperty("input1"))).sendKeys(mathfunctionsprop.getProperty("Temp"));
		unit = new Select(driver.findElement(By.xpath(mathfunctionsprop.getProperty("unitSelect"))));
		unit.selectByVisibleText(mathfunctionsprop.getProperty("unit2"));
		
		driver.findElement(By.xpath(mathfunctionsprop.getProperty("ConvertButton"))).click();
		
		driver.switchTo().frame(1);
		
		if (driver.findElement(By.xpath(mathfunctionsprop.getProperty("TempAnswer"))).isDisplayed()) {
			Assert.assertTrue(true);
		}
		
	}

	@Test
	public void NumbersMultiply() {
		NumbersMultiplyPage();
		driver.findElement(By.xpath(mathfunctionsprop.getProperty("Number1"))).sendKeys(mathfunctionsprop.getProperty("FirstNumber"));
		driver.findElement(By.xpath(mathfunctionsprop.getProperty("Number2"))).sendKeys(mathfunctionsprop.getProperty("SecondNumber"));
		driver.findElement(By.xpath(mathfunctionsprop.getProperty("MultiplyButton"))).click();
		
		driver.switchTo().frame(1);
		
		if (driver.findElement(By.xpath(mathfunctionsprop.getProperty("MultiplyAnswer"))).isDisplayed()) {
			Assert.assertTrue(true);
		}
		
	}
}
