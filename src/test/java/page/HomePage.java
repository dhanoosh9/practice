package page;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.WebDriver;
//import java.util.NoSuchElementException;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import test.BaseClass;



public class HomePage extends BaseClass {

	By homebtn = By.xpath("//img[@alt='My Store']");
	By search = By.xpath("(//input[contains(@class,'input')])[1]");
	By contactus = By.xpath("//a[contains(@title,'Contact Us')]");
	
	
	public void homeBtn()
	{	
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//				.withTimeout(Duration.ofSeconds(30))
//				.pollingEvery(Duration.ofSeconds(5))
//				.ignoring(NoSuchElementException.class);
		waitE = new WebDriverWait(driver, Duration.ofSeconds(10));
		waitE.until(ExpectedConditions.elementToBeClickable(homebtn)).click();
	}
	
	public void Search(String text) {
		driver.findElement(search).sendKeys(text);
		driver.findElement(search).sendKeys(Keys.RETURN);
	}
	
	
	
}
