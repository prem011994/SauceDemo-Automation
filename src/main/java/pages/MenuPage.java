package pages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuPage {
	 WebDriver driver;

	    public MenuPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void logout() {
	        driver.findElement(By.id("react-burger-menu-btn")).click();
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link")));
	        driver.findElement(By.id("logout_sidebar_link")).click();
	    }
	

}
