// Check Box Button 				
package webElements;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {

		// Open broswer 
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver-win64\\chromedriver-win64\\cd.exe");
		driver.manage().window().maximize();
		
		driver.get("C:\\Users\\sanket1.naik\\eclipse-workspace\\AutomationTesting\\src\\Links\\demo.html");
		Thread.sleep(2000);
		
		// Multiple click  check box : 
		
		List<WebElement> checkboxs = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement checkbox : checkboxs) {
			
			if(!checkbox.isSelected()) {
				checkbox.click();
			}
		}

	
	
		driver.close();
		System.out.println("Test Case Passed");
	
	
	}

}
