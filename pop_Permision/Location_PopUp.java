package pop_Permision;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Location_PopUp {

	public static void main(String[] args) throws InterruptedException {

		HashMap<String, Integer> conentSettings = new HashMap<String, Integer>();
		HashMap<String, Object> profile = new HashMap<String, Object>();
		HashMap<String, Object> prefs = new HashMap<String, Object>();

		conentSettings.put("geolocation", 1);

		profile.put("managed_default_content_settings", conentSettings);
		prefs.put("profile", profile);

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);

		// To disable the location based permission popup
		// options.addArguments("disable-geolocation");

		// Open Broswer 
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver-win64\\chromedriver-win64\\cd.exe");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://whatmylocation.com/");
		Thread.sleep(4000);
		
		String MyLocation = driver.findElement(By.id("share_loc")).getText();
//		String Location = MyLocation.getText();
		
		System.out.println("My Current Location : "+MyLocation);
		
	}

}
