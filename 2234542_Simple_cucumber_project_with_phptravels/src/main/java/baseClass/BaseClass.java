package baseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class BaseClass extends AbstractTestNGCucumberTests {
	public static WebDriver driver;
	public static String check;
	public static WebDriverWait eWait;
	@BeforeSuite
	public void configuration()
	{
		driver = DriverSetup.setupDriver("chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		eWait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	@AfterSuite
	public void closeDriver()
	{
		driver.quit();
	}
}
