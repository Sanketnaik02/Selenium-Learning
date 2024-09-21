package broswerAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {
		
		// open browser 
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver-win64\\chromedriver-win64\\cd.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Open Url
		driver.get("file:///C:/Users/sanket1.naik/eclipse-workspace/AutomationTesting/src/Links/demo.html");
		
		// Upload File 
		// 1. upload file in that our project
//		String ProjectPath = System.getProperty("use.dir");
//		driver.findElement(By.id("resume")).sendKeys(ProjectPath+"\\broswerAction\\AmazonImage.jpg");
		
		
		// 2. upload file mention that file location
		driver.findElement(By.id("resume")).sendKeys("C:\\Users\\sanket1.naik\\eclipse-workspace\\AutomationTesting\\src\\broswerAction\\AmazonImage.jpg");
		
		// close browser
		driver.close();
	}

}
