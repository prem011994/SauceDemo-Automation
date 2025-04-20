package tests;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utils.Config;
import utils.DriverFactory;

public class CheckoutOverviewTest extends BaseTest {
	@Test
    public void testOverviewAndTotal() {
       
        driver.get(Config.getBaseUrl());

        new LoginPage(driver).login(Config.getUsername(), Config.getPassword());

        ProductPage productPage = new ProductPage(driver);
        String item1 = "Sauce Labs Backpack";
        String item2 = "Sauce Labs Bike Light";

        productPage.addItemToCart(item1);
        productPage.addItemToCart(item2);
        productPage.goToCart();

        new CartPage(driver).clickCheckout();
        new CheckoutInfoPage(driver).fillInfo("Test", "User", "12345");

        CheckoutOverviewPage overviewPage = new CheckoutOverviewPage(driver);

        
        double price1 = overviewPage.getItemPrice(item1);
        double price2 = overviewPage.getItemPrice(item2);
        double expectedSubtotal = price1 + price2;

        double actualSubtotal = overviewPage.getItemTotal();
        Assert.assertEquals(actualSubtotal, expectedSubtotal, 0.01, "Subtotal mismatch!");

        double tax = overviewPage.getTax();
        double expectedTotal = expectedSubtotal + tax;

        double actualTotal = overviewPage.getTotal();
        Assert.assertEquals(actualTotal, expectedTotal, 0.01, "Total mismatch!");

        
        overviewPage.clickFinish();

       
        String successMessage = new CheckoutCompletePage(driver).getSuccessMessage();
        Assert.assertEquals(successMessage.trim(), "Thank you for your order!", "Order confirmation mismatch!");
    }

}
