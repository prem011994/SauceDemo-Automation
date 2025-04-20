package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
	WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isItemInCart(String itemName) {
    	return driver.findElements(By.xpath("//div[@class='inventory_item_name' and text()='" + itemName + "']")).size() > 0;
    }
    
    
    public int getItemQuantity() {
        try {
            String quantityText = driver.findElement(By.className("shopping_cart_badge")).getText().trim();
            return Integer.parseInt(quantityText);
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return 0; // No badge means cart is empty
        }
    }

    public void clickCheckout() {
        driver.findElement(By.id("checkout")).click();
    }

}
