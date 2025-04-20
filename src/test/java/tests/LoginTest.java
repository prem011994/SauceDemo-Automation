package tests;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.LoginPage;
import utils.Config;
import utils.DriverFactory;
import utils.ScreenshotUtil;

public class LoginTest extends BaseTest {
	@Test
 
		 public void testLoginSuccess() {
		        driver.get(Config.getBaseUrl());

		        LoginPage loginPage = new LoginPage(driver);
		        loginPage.login(Config.getUsername(), Config.getPassword());
		        
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        boolean isOnInventoryPage = wait.until(ExpectedConditions.urlContains("inventory"));

		       
		       

		        Assert.assertTrue(isOnInventoryPage, "Login failed: Did not reach inventory page.");
		        
    }
	
	
		
	}


