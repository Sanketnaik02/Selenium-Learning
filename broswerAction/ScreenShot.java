package broswerAction;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver-win64\\chromedriver-win64\\cd.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		File Amazon = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Files.copy(Amazon, new File("C:\\Users\\sanket1.naik\\eclipse-workspace\\AutomationTesting\\src\\broswerAction\\AmazonImage.jpg"));
		
		driver.close();
		System.out.println("Scrennshot is avaible on ");
		System.out.println("Below Location");
		System.out.println("C:\\\\Users\\\\sanket1.naik\\\\eclipse-workspace\\\\AutomationTesting\\\\src\\\\broswerAction\\\\");
	}

}
