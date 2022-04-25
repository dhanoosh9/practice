package page;



import org.openqa.selenium.By;

import test.BaseClass;

public class LoginPage extends BaseClass {
	
	public static By signinbtn = By.cssSelector("[class='login']");
	public static By email = By.xpath("//input[@id='email']");
	public static By passwd = By.cssSelector("[id=passwd]");
	public static By submit = By.cssSelector("[id=SubmitLogin]");
	public static By logout = By.xpath("//a[@class='logout'][contains(.,'Sign out')]");
	
	public static void Sigin(String Username,String Password) {
		click(signinbtn);
		sendKeys(email,Username);
		sendKeys(passwd,Password);
		click(submit);
		click(logout);
	}
}
