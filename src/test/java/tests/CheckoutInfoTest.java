package tests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.*;
import utils.Config;
import utils.DriverFactory;
import java.util.UUID;

public class CheckoutInfoTest extends BaseTest  {
	@Test
    public void testFillUserInfo() {
     
        driver.get(Config.getBaseUrl());

        new LoginPage(driver).login(Config.getUsername(), Config.getPassword());

        ProductPage productPage = new ProductPage(driver);
        productPage.addItemToCart("Sauce Labs Backpack");
        productPage.addItemToCart("Sauce Labs Bike Light");
        productPage.goToCart();

        CartPage cartPage = new CartPage(driver);
        cartPage.clickCheckout();

        String firstName = UUID.randomUUID().toString().substring(0, 5);
        String lastName = UUID.randomUUID().toString().substring(0, 5);
        String zip = String.valueOf((int)(Math.random() * 90000) + 10000);

        CheckoutInfoPage infoPage = new CheckoutInfoPage(driver);
        infoPage.fillInfo(firstName, lastName, zip);

        driver.quit();
    }
	

}
