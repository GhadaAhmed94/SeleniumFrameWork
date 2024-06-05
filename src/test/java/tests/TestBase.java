package tests;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utilities.Helper;
public class TestBase extends AbstractTestNGCucumberTests
{
public static WebDriver driver;
@SuppressWarnings("deprecation")
@BeforeSuite
@Parameters({"browser"})//anotians parmter

public void startDriver( @Optional("chrome")  String browserName)
{
	if (browserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chromedriver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		
		driver =new ChromeDriver();
	}
	else if (browserName.equalsIgnoreCase("firefox")) {
System.setProperty("webdriver.geckodriver", System.getProperty("user.dir")+"/drivers/geckodriver.exe");
		
		driver =new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	driver.navigate().to("https://demo.nopcommerce.com/");
	
}

@AfterSuite
public void stopdriver()
{
	driver.quit();
	
}

//take screen shot when test case failed and add it in screenshots folder

@AfterMethod
public void screenshotOnFailure(ITestResult result)
{
	if (result.getStatus()==ITestResult.FAILURE) {
		System.out.println("failed");
		System.out.println("taking screenshot...");
		Helper.captureScreenshot(driver, result.getName());
		
		
		
	}
}

}
