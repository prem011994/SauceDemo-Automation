package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutInfoPage {
	 WebDriver driver;
	 public CheckoutInfoPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void fillInfo(String firstName, String lastName, String postalCode) {
	        driver.findElement(By.id("first-name")).sendKeys(firstName);
	        driver.findElement(By.id("last-name")).sendKeys(lastName);
	        driver.findElement(By.id("postal-code")).sendKeys(postalCode);
	        driver.findElement(By.id("continue")).click();
	    }

}
