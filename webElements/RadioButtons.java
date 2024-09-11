// Click On radio buttons
package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		
		// Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver-win64\\chromedriver-win64\\cd.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Open Url 
		driver.get("https://demoqa.com/radio-button");
		
		// select radio button
		driver.findElement(By.xpath("//input[@id='yesRadio']")).click();
		
		WebElement Text = driver.findElement(By.xpath("//p[@class='mt-3']"));
		String PrintText = Text.getText();
		
		System.out.println(PrintText);
		

	}

}
