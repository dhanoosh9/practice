package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestLogin extends BaseClass {
	
	public static void click(By element) {
		waitE = new WebDriverWait(driver, Duration.ofSeconds(10));
		waitE.until(ExpectedConditions.elementToBeClickable(element)).click();
	}
	
	public static void click(WebElement element) {
		waitE = new WebDriverWait(driver, Duration.ofSeconds(10));
		waitE.until(ExpectedConditions.elementToBeClickable(element)).click();
	}
	
	public static void sendKeys(By element,String text) {
		waitE = new WebDriverWait(driver, Duration.ofSeconds(10));
		waitE.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(text);
	}
	
	public static void sendKeys(WebElement element,String text) {
		waitE = new WebDriverWait(driver, Duration.ofSeconds(10));
		waitE.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(text);
	}
	
	@Parameters({"username","password"})
	@Test
	public void test(String username,String password) {
		login(username,password);
		
	}
	
}
