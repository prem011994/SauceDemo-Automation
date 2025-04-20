package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ProductPage {
	WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addItemToCart(String itemName) {
        String id = "add-to-cart-" + itemName.toLowerCase().replace(" ", "-");
       
        driver.findElement(By.id(id)).click();
    }

    public void goToCart() {
    	 driver.findElement(By.id("shopping_cart_container")).click();
    }
	


}
