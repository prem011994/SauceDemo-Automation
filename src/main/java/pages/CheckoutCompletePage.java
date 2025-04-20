package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutCompletePage {
	 WebDriver driver;

	    public CheckoutCompletePage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public String getSuccessMessage() {
	        return driver.findElement(By.className("complete-header")).getText();
	    }
}
