package page;

import static org.testng.Assert.assertEquals;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import test.BaseClass;

public class Cart extends BaseClass{
	
	Actions action;
	
	WebElement item = driver.findElement(By.xpath("(//img[@title='Faded Short Sleeve T-shirts'])[1]"));
	WebElement more = driver.findElement(By.xpath("(//span[contains(.,'More')])[1]"));
	WebElement add_to_cart = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
	
	public void Item() {
		action = new Actions(driver);
		action.moveToElement(item).perform();
		System.out.println("hovered on item");
	}
	
	public void More() {
		
		more.click();
		assertEquals(driver.getTitle(), "Faded Short Sleeve T-shirts - My Store");
		System.out.println("clicked on more");
	}

	public void addtocart() throws InterruptedException {
//		waitE = new WebDriverWait(driver, Duration.ofSeconds(10));
		add_to_cart.click();
		
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//		.withTimeout(Duration.ofSeconds(30))
//		.pollingEvery(Duration.ofSeconds(5))
//		.ignoring(StaleElementReferenceException.class);
//		wait.until(ExpectedConditions.elementToBeClickable(add_to_cart)).click();
	}
	
	
	 
	
}
