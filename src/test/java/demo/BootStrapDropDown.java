package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropDown {
	
	@Test
	public void bootstrapdropdown() throws InterruptedException {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.automationtestinginsider.com/2019/12/bootstrap-dropdown-example_12.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='bootstrapmenu']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("ul.dropdown-menu > li a[href='https://www.automationtestinginsider.com/p/blog-page.html']")).click();
		Thread.sleep(3000);
		
		driver.close();
		
	}
	
}
