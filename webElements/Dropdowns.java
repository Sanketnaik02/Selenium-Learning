// Check Drop-down Buttons
package webElements;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {

		// Open browser and visit Url
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

		// find drop down buttons options
		List<WebElement> DropDown = driver.findElements(By.tagName("option"));
		System.out.println("Total options is " + DropDown.size());

		WebElement DropDown2 = driver.findElement(By.tagName("select"));
		Select select = new Select(DropDown2);

		// Select by INDEX Visible Text

		select.selectByVisibleText("India");
		
		
		// broswer Close
		driver.close();
	}

}
