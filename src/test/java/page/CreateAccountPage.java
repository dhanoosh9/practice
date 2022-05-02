package page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import test.BaseClass;

public class CreateAccountPage extends BaseClass {
	
	public static By email = By.cssSelector("[id=email_create]");
	public static By firstname = By.id("customer_firstname");
	public static By lastname = By.id("customer_lastname");
	public static By password = By.cssSelector("[type=password]");
	public static By create_btn = By.cssSelector("[id=SubmitCreate]");
	public static By optin = By.id("optin");
	
	public static void createAccount(String name, String lname, String Password) throws Exception {
		click(signinbtn);
		String Email = randomstring() + "@gmail.com";
		sendKeys(email,Email);
		click(create_btn);
		click(By.cssSelector("[for=id_gender1]"));
		//driver.findElement(By.cssSelector("[for=id_gender2]")).click();
		sendKeys(firstname,name);
		sendKeys(lastname,lname);
		sendKeys(password,Password);
	}
	public static void days() {
		WebElement days = driver.findElement(By.cssSelector("[id=days]"));
		Select select = new Select(days);
		select.selectByValue("4");
	}
	
	public static void months() {
		WebElement months = driver.findElement(By.cssSelector("[id=months]"));
		Select select = new Select(months);
		select.selectByIndex(2);
	}
	
	public static void years() {
		WebElement years = driver.findElement(By.cssSelector("[id=years]"));
		Select select = new Select(years);
		select.selectByValue("2000");
	}
	
	public static void news() {
		driver.findElement(By.name("newsletter")).click();
		driver.findElement(By.id("optin")).click();
//		click(By.name("newsletter"));
//		click(optin);
	}
	
	public static void afname(String text) {
		WebElement firstname = driver.findElement(By.name("firstname"));
		sendKeys(firstname, text);
	}
	
	public static void alname(String text) {
		WebElement lastname = driver.findElement(By.id("lastname"));
		sendKeys(lastname, text);
	}
	
	public static void company(String text) {
		sendKeys(By.id("company"), text);
	}
	
	public static void address(String text) {
		sendKeys(By.name("address1"), text);
		sendKeys(By.name("address2"), text);
	}
	
	public static void city(String text) {
		sendKeys(By.name("city"), text);
	}
	
	public static void state() {
		WebElement State = driver.findElement(By.name("id_state"));
		Select select = new Select(State);
		select.selectByValue("22");
	}
	
	public static void Zip(String text) {
		sendKeys(By.id("postcode"), text);
	}
	
	public static void Country() {
		WebElement country = driver.findElement(By.name("id_country"));
		Select select = new Select(country);
		select.selectByValue("21");
	}
	
	public static void Addinfo(String text) {
		sendKeys(By.name("other"), text);
	}
	
	public static void Homephone() {
		String hphone = randomNum();
		sendKeys(By.name("phone"), hphone);
	}
	
	public static void Mobilephone() {
		String mphone = randomNum();
		sendKeys(By.id("phone_mobile"), mphone);
	}
	
	public static void register() {
		click(By.xpath("//span[contains(.,'Register')]"));
	}
 }
