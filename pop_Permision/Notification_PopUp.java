package pop_Permision;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_PopUp {

	public static void main(String[] args) {

		HashMap<String, Integer> conentSettings = new HashMap<String, Integer>();
		HashMap<String, Object> profile = new HashMap<String, Object>();
		HashMap<String, Object> prefs = new HashMap<String, Object>();

		conentSettings.put("notifications", 1);

		profile.put("managed_default_content_settings", conentSettings);
		prefs.put("profile", profile);

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);

		// To disable the notifications based permission popup
		// options.addArguments("disable-notifications");

		// Open Broswer
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver-win64\\chromedriver-win64\\cd.exe");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://web-push-book.gauntface.com/demos/notification-examples/");

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();

	}

}
