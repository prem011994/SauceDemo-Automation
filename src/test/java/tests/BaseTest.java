package tests;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utils.DriverFactory;
import utils.ScreenshotUtil;

public class BaseTest {
	 protected WebDriver driver;
	 
	 @BeforeMethod
	    public void setup() {
	        driver = DriverFactory.getDriver();
	    }

	   
	    @AfterMethod
	    public void tearDownAndCaptureScreenshot(ITestResult result) {
	        if (ITestResult.FAILURE == result.getStatus()) {
	            ScreenshotUtil.takeScreenshot(driver, result.getName());
	        }
	        DriverFactory.quitDriver();
	    }

}
