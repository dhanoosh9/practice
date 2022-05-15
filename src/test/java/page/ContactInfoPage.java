package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import test.BaseClass;


public class ContactInfoPage extends BaseClass{
	
	public static By Contactus = By.xpath("//a[contains(@title,'Contact Us')]");
	public static By Email = By.xpath("//input[@id='email']");
	public static By Order = By.xpath("//input[contains(@id,'id_order')]");
	public static By Message = By.xpath("//textarea[contains(@id,'message')]");
	public static By Submit = By.xpath("//span[contains(.,'Send')]");
	
	
	public static void Contactus(String email, String order, String message) {
		
		click(Contactus);
		WebElement dropdown = driver.findElement(By.xpath("//select[contains(@id,'id_contact')]"));
		selectValue(dropdown,"2");

//		select.selectByVisibleText("Webmaster");
		sendKeys(Email,email);
		sendKeys(Order,order);
		sendKeys(Message,message);
		click(Submit);
	}
}
