package page;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import test.BaseClass;

public class Cart extends BaseClass{
	
	static Actions action;

	public static void Item() {
		WebElement item = driver.findElement(By.xpath("(//img[@title='Faded Short Sleeve T-shirts'])[1]"));
		action = new Actions(driver);
		action.moveToElement(item).perform();
		System.out.println("hovered on item");
		
		WebElement more = driver.findElement(By.xpath("(//span[contains(.,'More')])[1]"));
		click(more);
		assertEquals(driver.getTitle(), "Faded Short Sleeve T-shirts - My Store");
		System.out.println("clicked on more");
		
		WebElement add_to_cart = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
		click(add_to_cart);
		System.out.println("Clicked on cart button");
		
		WebElement checkout = driver.findElement(By.xpath("//span[contains(.,'Proceed to checkout')]"));
		click(checkout);
		System.out.println("Clicked on checkout button");
		
		WebElement checkout2 = driver.findElement(By.xpath("(//span[contains(.,'Proceed to checkout')])[2]"));
		click(checkout2);
		System.out.println("Clicked on checkout2 button");
		
		WebElement checkout3 = driver.findElement(By.xpath("(//span[contains(.,'Proceed to checkout')])[2]"));
		click(checkout3);
		System.out.println("Clicked on checkout3 button");
		
		WebElement terms = driver.findElement(By.xpath("//label[contains(@for,'cgv')]"));
		click(terms);
		System.out.println("Clicked on terms button");
		
		WebElement checkout4 = driver.findElement(By.xpath("(//span[contains(.,'Proceed to checkout')])[2]"));
		click(checkout4);
		System.out.println("Clicked on checkout4 button");
		
		WebElement bankwire = driver.findElement(By.xpath("//a[contains(@class,'bankwire')]"));
		click(bankwire);
		System.out.println("Clicked on bnakwire button");
		
		WebElement confirm_order = driver.findElement(By.xpath("//span[contains(.,'I confirm my order')]"));
		click(confirm_order);
		System.out.println("Clicked on confirm order button");
	} 	
}
