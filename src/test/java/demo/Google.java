package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Google extends GoogleTest{

	public static WebElement search = driver.findElement(By.name("q"));
	public static WebElement search_button = driver.findElement(By.xpath("(//input[@name='btnK'])[2]"));
	public static WebElement item = driver.findElement(By.xpath("//h3[contains(.,'Java | Oracle')]"));
	
	
//	public static By search = By.name("q");
//	public static By search_button = By.xpath("(//input[@name='btnK'])[2]");
//	public static By item = By.xpath("//h3[contains(.,'Java | Oracle')]");
}
