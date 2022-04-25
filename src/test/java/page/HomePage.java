package page;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import test.BaseClass;



public class HomePage extends BaseClass {

	public static By homebtn = By.xpath("//img[@alt='My Store']");
	public static By search = By.xpath("(//input[contains(@class,'input')])[1]");
	By contactus = By.xpath("//a[contains(@title,'Contact Us')]");
	
	
	public static void homeBtn()
	{	
		click(homebtn);
	}
	
	public static void Search(String text) {
//		driver.findElement(search).sendKeys(text);
//		driver.findElement(search).sendKeys(Keys.RETURN);
		sendKeys(search,text + Keys.RETURN);
	}
	
	
	
}
