package WebMathTestScenarios;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public Properties homepageprop;
	public Properties headerprop;
	public Properties footerprop;
	public Properties mathforeveryoneprop;
	public Properties quickjumpprop;
	public Properties mathfunctionsprop;
	
	@BeforeClass
	public void userData() throws IOException {
		FileInputStream homepagefile = new FileInputStream("./src/test/java/PropertiesFiles/homepage.properties");
		homepageprop = new Properties();
		homepageprop.load(homepagefile);

		FileInputStream headerfile = new FileInputStream("./src/test/java/PropertiesFiles/header.properties");
		headerprop = new Properties();
		headerprop.load(headerfile);

		FileInputStream footerfile = new FileInputStream("./src/test/java/PropertiesFiles/footer.properties");
		footerprop = new Properties();
		footerprop.load(footerfile);
		
		FileInputStream mathforeveryonefile = new FileInputStream("./src/test/java/PropertiesFiles/mathforeveryone.properties");
		mathforeveryoneprop = new Properties();
		mathforeveryoneprop.load(mathforeveryonefile);
		
		FileInputStream quickjumpfile = new FileInputStream("./src/test/java/PropertiesFiles/quickjump.properties");
		quickjumpprop = new Properties();
		quickjumpprop.load(quickjumpfile);
		
		FileInputStream mathfunctionsfile = new FileInputStream("./src/test/java/PropertiesFiles/mathfunctions.properties");
		mathfunctionsprop = new Properties();
		mathfunctionsprop.load(mathfunctionsfile);
	}
	
	@BeforeMethod
	public void initialization() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(homepageprop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod
	public void exit() {
		driver.quit();
	}
}
