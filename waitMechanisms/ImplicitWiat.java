	package waitMechanisms;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWiat {

	public static void main(String[] args) {
		
		//Open Broswer
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver-win64\\chromedriver-win64\\cd.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Open URL
		driver.get("file:///C:/Users/sanket1.naik/eclipse-workspace/AutomationTesting/src/Links/loading.html");
		
		// wait for 12 seconds window
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		// enter first name
		WebElement firstName = driver.findElement(By.xpath("//input[@name='fname']"));
		firstName.sendKeys("Sanket");
		
		// enter last name
		WebElement lastName = driver.findElement(By.xpath("//input[@name='lname']"));
		lastName.sendKeys("Naik");
		
		// press submit butto
		Boolean btn = driver.findElement(By.xpath("//input[@name='login']")).isEnabled();
				System.out.println(btn);
				
				driver.close();
				System.out.println("Test Case Passed");
				
	}

}
