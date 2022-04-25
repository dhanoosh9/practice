package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import test.BaseClass;

public class ContactInfoPage extends BaseClass {
	

	static By Contactus = By.xpath("//a[contains(@title,'Contact Us')]");
	static By Email = By.xpath("//input[@id='email']");
	static By Order = By.xpath("//input[contains(@id,'id_order')]");
	static By Message = By.xpath("//textarea[contains(@id,'message')]");
	static By Submit = By.xpath("//span[contains(.,'Send')]");
	public static void Contactus(String email, String order, String message) throws InterruptedException {
		
		click(Contactus);
		WebElement dropdown = driver.findElement(By.xpath("//select[contains(@id,'id_contact')]"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Customer service");

//		select.selectByVisibleText("Webmaster");
		sendKeys(Email,email);
		sendKeys(Order,order);
		sendKeys(Message,message);
		click(Submit);
	}
	
}
