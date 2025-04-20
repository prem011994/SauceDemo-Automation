package tests;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utils.Config;
import utils.DriverFactory;


public class OrderConfirmationTest extends BaseTest  {
	 @Test
	    public void testOrderConfirmationAndLogout() {
	       
	        driver.get(Config.getBaseUrl());

	        new LoginPage(driver).login(Config.getUsername(), Config.getPassword());

	        ProductPage productPage = new ProductPage(driver);
	        productPage.addItemToCart("Sauce Labs Backpack");
	        productPage.addItemToCart("Sauce Labs Bike Light");
	        productPage.goToCart();

	        CartPage cartPage = new CartPage(driver);
	        cartPage.clickCheckout();

	        CheckoutInfoPage infoPage = new CheckoutInfoPage(driver);
	        infoPage.fillInfo("Auto", "Test", "12345");

	        CheckoutOverviewPage overviewPage = new CheckoutOverviewPage(driver);
	        overviewPage.clickFinish();

	        CheckoutCompletePage completePage = new CheckoutCompletePage(driver);
	        assert completePage.getSuccessMessage().equalsIgnoreCase("Thank you for your order!");

	        MenuPage menuPage = new MenuPage(driver);
	        menuPage.logout();
	        Assert.assertTrue(driver.getCurrentUrl().contains("saucedemo.com"), "User not logged out properly.");


	        driver.quit();
	    }

}
