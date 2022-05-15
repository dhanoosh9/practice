package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {
	public static WebDriver driver;

	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.navigate().to("https://google.com");
		
//		WebElement search = driver.findElement(By.name("q"));
//		WebElement search_button = driver.findElement(By.xpath("(//input[@name='btnK'])[2]"));
//		WebElement item = driver.findElement(By.xpath("//h3[contains(.,'Java | Oracle')]"));
		
		Google.search.sendKeys("java");
		
		Google.search_button.click();
		
		Google.item.click();
		
//		driver.findElement(Google.search).sendKeys("Java");
//		driver.findElement(Google.search_button).click();
//		driver.findElement(Google.item).click();
		
		
		
		driver.close();
		driver.quit();
		
	}
	
}
