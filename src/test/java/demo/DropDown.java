package demo;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	
	@Test
	public void dropdown() throws InterruptedException {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.automationtestinginsider.com/2019/12/bootstrap-dropdown-example_12.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='bootstrapmenu']")).click();
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li"));
		
//		for(WebElement element:options) {
//			String value = element.getText();
//			System.out.println(value);
//			
//			if(value.equalsIgnoreCase("contact us")) {
//				element.click();
//				break;
//			}
//		}
		
		// css = ul.dropdown-menu > li
		
		Iterator<WebElement> element = options.iterator();
		
		while(element.hasNext()) {
			
			System.out.println(element.next().getText());
			String value = element.next().getText();
			
			if(value.equalsIgnoreCase("contact us")) {
				element.next().click();
				//break;
			}
		}
		
		Thread.sleep(3000);
		
		driver.close();
		driver.quit();
	}
}
