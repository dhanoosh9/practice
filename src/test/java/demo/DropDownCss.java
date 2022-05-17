package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownCss {
	
	@Test
	public void dropdowncss() throws InterruptedException {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		//driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("select[name='cars'] > option[value='volvo']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("form[target='_blank'] > input[type='submit']")).click();
		Thread.sleep(3000);
		driver.close();
	}
	
}
