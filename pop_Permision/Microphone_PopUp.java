package pop_Permision;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Microphone_PopUp {

	public static void main(String[] args) throws InterruptedException {

		// Set for Permision of pop-ups
		HashMap<String, Integer> conentSettings = new HashMap<String, Integer>();
		HashMap<String, Object> profile = new HashMap<String, Object>();
		HashMap<String, Object> prefs = new HashMap<String, Object>();

		// Set Pop-up status ( Ask-0 , Allow-1, Block-2)
		conentSettings.put("media_stream", 1);

		profile.put("managed_default_content_settings", conentSettings);
		prefs.put("profile", profile);

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);

		// To disable the microphone or camera based permission popup
		 options.addArguments("disable-media-stream");

		// Open Broswer
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver-win64\\chromedriver-win64\\cd.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://mictests.com/");
		Thread.sleep(6000);
		driver.findElement(By.id("mic-launcher")).click();

	}

}
