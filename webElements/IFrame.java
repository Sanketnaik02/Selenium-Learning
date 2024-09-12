package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {

	public static void main(String[] args) {
	
		// Open broswer
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver-win64\\chromedriver-win64\\cd.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Open URL 
		driver.get("https://demoqa.com/frames");
		
		// targert First iFrame Window
		driver.switchTo().frame("frame1");
		
		WebElement heading = driver.findElement(By.id("sampleHeading"));
		String H1 = heading.getText();
		System.out.println("this is First iFrame Window Text : "+H1);
		
		
		// Target Second iframe Window
		driver.switchTo().frame("frame2");
		
		WebElement heading2 = driver.findElement(By.id("sampleHeading"));
		String H2 = heading2.getText();
		System.out.println("this is Second iFrame Window Text : "+H2);
		
		//Close the broswer
		driver.close();
		
		

	}

}
