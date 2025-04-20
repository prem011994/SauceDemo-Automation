package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewPage {

	 WebDriver driver;

	 public CheckoutOverviewPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public String getTotalText() {
	        return driver.findElement(By.className("summary_total_label")).getText();
	    }

	    public void clickFinish() {
	        driver.findElement(By.id("finish")).click();
	    }

	   

	    public double getItemPrice(String itemName) {
	        String itemPriceLocator = String.format("//div[text()='%s']/ancestor::div[@class='cart_item']//div[@class='inventory_item_price']", itemName);
	        String priceText = driver.findElement(By.xpath(itemPriceLocator)).getText();
	        return Double.parseDouble(priceText.replace("$", "").trim());
	    }

	    public double getItemTotal() {
	        String totalText = driver.findElement(By.className("summary_subtotal_label")).getText();
	        return Double.parseDouble(totalText.split(":")[1].replace("$", "").trim());
	    }


	    public double getTax() {
	        String taxText = driver.findElement(By.className("summary_tax_label")).getText();
	        return Double.parseDouble(taxText.split(":")[1].replace("$", "").trim());
	    }
	    public double getTotal() {
	        String totalText = driver.findElement(By.className("summary_total_label")).getText();
	        return Double.parseDouble(totalText.split(":")[1].replace("$", "").trim());
	    }

}
