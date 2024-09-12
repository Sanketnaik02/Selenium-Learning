package waitMechanisms;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {

		// Open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver-win64\\chromedriver-win64\\cd.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Open URL
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");

		// click on first text Box
		driver.findElement(By.id("btn1")).click();

		// USE Explicit wait for 5 second first text box
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		WebElement clcik = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt1")));
		clcik.sendKeys("Sanket");

		// Click on second text Box
		driver.findElement(By.id("btn2")).click();

		// USE Explicit wait for 10 seconds second text box
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement clcik2 = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt2")));
		clcik2.sendKeys("Naik");

		// Close Browser
		driver.close();

		System.out.println("test Case Passed");

	}

}
