package test;

import org.testng.annotations.Test;

import page.CreateAccountPage;

public class CreateAccountPageTest extends BaseClass {
	
	@Test
	public void createaccountpagetest() throws Exception {
		CreateAccountPage.createAccount("ryan","ryder","test123");
		CreateAccountPage.days();
		CreateAccountPage.months();
		CreateAccountPage.years();
		CreateAccountPage.news();
		CreateAccountPage.afname("ryan");
		CreateAccountPage.alname("ryder");
		CreateAccountPage.company("tech geek");
		CreateAccountPage.address("blah");
		CreateAccountPage.city("monster");
		CreateAccountPage.state();
		CreateAccountPage.Zip("30003");
		CreateAccountPage.Country();
		CreateAccountPage.Addinfo("something");
		CreateAccountPage.Homephone();
		CreateAccountPage.Mobilephone();
		CreateAccountPage.register();
		
	}
}
