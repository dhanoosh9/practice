package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.LoginPage;

public class LoginPageTest extends BaseClass {
	
	@Parameters({"username","password"})
	@Test
	public void signintest(String username,String password) {
		LoginPage.Sigin(username,password);

	}
	
}
