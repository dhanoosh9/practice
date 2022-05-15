package page;


import org.openqa.selenium.By;



public class HomePage {

	public static By homebtn = By.xpath("//img[@alt='My Store']");
	public static By search_box = By.xpath("(//input[contains(@class,'input')])[1]");
	public static By search_button = By.xpath("//button[@name='submit_search']");
	
}
