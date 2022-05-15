package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class LoginPageTest extends BaseClass {
	
	@Parameters({"username","password"})
	@Test
	public static void login(String Username, String Password) {
		click(signinbtn);
		sendKeys(email,Username);
		sendKeys(passwd,Password);
		click(submit);
		click(logout);
	}
	
}
