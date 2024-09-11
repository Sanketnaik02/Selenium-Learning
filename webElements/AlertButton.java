package webElements;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertButton {

	public static void main(String[] args) {

		// Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver-win64\\chromedriver-win64\\cd.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Open Url
		driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");

		// click on alert
		WebElement clickAlert = driver.findElement(By.xpath("//button[@onclick=\"showAlert()\"]"));
		clickAlert.click();

		// Switch my Broswer in to the Alert Window
		Alert alert = driver.switchTo().alert();

		// using alert function for get text alert window
		System.out.println(alert.getText());
		alert.accept();

		// check another alert window
		WebElement clickAlert2 = driver.findElement(By.xpath("//button[@onclick=\"myDesk()\"]"));
		clickAlert2.click();

		System.out.println(alert.getText());

		// Accept alert window
		alert.dismiss();

		// driver close
//		driver.close();

	}

}
