package page;



import org.openqa.selenium.By;

import test.BaseClass;

public class LoginPage extends BaseClass {
	
	By signinbtn = By.cssSelector("[class='login']");
	By email = By.xpath("//input[@id='email']");
	By passwd = By.cssSelector("[id=passwd]");
	By submit = By.cssSelector("[id=SubmitLogin]");
	By logout = By.xpath("//a[@class='logout'][contains(.,'Sign out')]");
	
	public void Sigin() {
		driver.findElement(signinbtn).click();
	}
	
	public void enterEmail(String Username) {
		driver.findElement(email).sendKeys(Username);
	}
	
	public void enterPasswd(String Password) {
		driver.findElement(passwd).sendKeys(Password);
	}
	
	public void clickSubmit() {
		driver.findElement(submit).click();
	}
	
	public void Logout() {
		driver.findElement(logout).click();
	}
	
}
