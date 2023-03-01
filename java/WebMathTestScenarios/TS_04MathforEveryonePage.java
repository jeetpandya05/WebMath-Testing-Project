package WebMathTestScenarios;

import org.testng.annotations.Test;
import org.testng.Assert;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;

public class TS_04MathforEveryonePage extends BaseClass {

	@BeforeMethod
	public void MathforEveryone() {
		driver.findElement(By.xpath(headerprop.getProperty("mathforeveryone"))).click();
	}

	@Test
	public void figuringTipPage() {
		driver.findElement(By.xpath(mathforeveryoneprop.getProperty("FiguringTip"))).click();

		if (driver.findElement(By.xpath(mathforeveryoneprop.getProperty("TipCalculatorPage"))).isDisplayed()) {
			Assert.assertTrue(true);
		}
	}

	@Test
	public void tipCalculator() {
		driver.findElement(By.xpath(mathforeveryoneprop.getProperty("FiguringTip"))).click();
		driver.findElement(By.xpath(mathforeveryoneprop.getProperty("Tip"))).clear();
		driver.findElement(By.xpath(mathforeveryoneprop.getProperty("Tip")))
				.sendKeys(mathforeveryoneprop.getProperty("TipPercent"));
		driver.findElement(By.xpath(mathforeveryoneprop.getProperty("Cost")))
				.sendKeys(mathforeveryoneprop.getProperty("TotalBill"));
		driver.findElement(By.xpath(mathforeveryoneprop.getProperty("FigureTipButton"))).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(1);

		if (driver.findElement(By.xpath(mathforeveryoneprop.getProperty("TipAnswer"))).isDisplayed()) {
			Assert.assertTrue(true);
		}
	}

	@Test
	public void simpleInterestPage() {
		driver.findElement(By.xpath(mathforeveryoneprop.getProperty("SimpleInterest"))).click();

		if (driver.findElement(By.xpath(mathforeveryoneprop.getProperty("SimpleInterestPage"))).isDisplayed()) {
			Assert.assertTrue(true);
		}
	}

	@Test
	public void simpleInterest() {
		driver.findElement(By.xpath(mathforeveryoneprop.getProperty("SimpleInterest"))).click();

		driver.findElement(By.xpath(mathforeveryoneprop.getProperty("PrincipalAmount")))
				.sendKeys(mathforeveryoneprop.getProperty("Amount"));
		driver.findElement(By.xpath(mathforeveryoneprop.getProperty("InterestRate")))
				.sendKeys(mathforeveryoneprop.getProperty("Rate"));
		driver.findElement(By.xpath(mathforeveryoneprop.getProperty("TimePeriod")))
				.sendKeys(mathforeveryoneprop.getProperty("Time"));
		driver.findElement(By.xpath(mathforeveryoneprop.getProperty("FindInterestButton"))).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(1);

		if (driver.findElement(By.xpath(mathforeveryoneprop.getProperty("SimpleInterestAnswer"))).isDisplayed()) {
			Assert.assertTrue(true);
		}
	}

}
