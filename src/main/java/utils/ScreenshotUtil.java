package utils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtil {
	 public static void takeScreenshot(WebDriver driver, String screenshotName) {
	        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        
	        // Create a timestamped filename to avoid overwriting
	        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	        String finalScreenshotName = screenshotName + "_" + timestamp + ".png";
	        
	        File destDir = new File("./screenshots/");
	        if (!destDir.exists()) {
	            destDir.mkdirs(); 
	        }

	        try {
	            File destFile = new File(destDir, finalScreenshotName);
	            FileUtils.copyFile(srcFile, destFile);
	            System.out.println("Screenshot saved: " + destFile.getAbsolutePath());
	        } catch (IOException e) {
	            System.err.println("Failed to save screenshot: " + e.getMessage());
	        }
	    }

}
