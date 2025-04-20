package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.ProductPage;
import pages.CartPage;
import utils.Config;
import utils.DriverFactory;

public class CartTest extends BaseTest {
	@Test
    public void testAddItemsToCart() {
   
        driver.get(Config.getBaseUrl());

        new LoginPage(driver).login(Config.getUsername(), Config.getPassword());

        ProductPage productPage = new ProductPage(driver);
        productPage.addItemToCart("Sauce Labs Backpack");
        productPage.addItemToCart("Sauce Labs Bike Light");
        productPage.goToCart();

        CartPage cartPage = new CartPage(driver);
        Assert.assertTrue(cartPage.isItemInCart("Sauce Labs Backpack"), "Backpack not found in cart!");
        Assert.assertTrue(cartPage.isItemInCart("Sauce Labs Bike Light"), "Bike Light not found in cart!");
        Assert.assertEquals(cartPage.getItemQuantity(), 2, "Cart quantity does not match expected value!");


        driver.quit();
    }
	

}
