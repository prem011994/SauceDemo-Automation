package utils;
import io.github.cdimascio.dotenv.Dotenv;

public class Config {
	  private static final Dotenv dotenv = Dotenv.load();
	  
	  public static String getBaseUrl() {
	        return dotenv.get("BASE_URL");
	    }

	    public static String getUsername() {
	        return dotenv.get("APP_USERNAME");
	    }

	    public static String getPassword() {
	        return dotenv.get("APP_PASSWORD");
	    }

}
