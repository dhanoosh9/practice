package test;

import org.testng.annotations.Test;

import page.ContactInfoPage;



public class ContactInfoPageTest extends BaseClass {
	
	@Test
	public void cpage() {
		ContactInfoPage.Contactus("testers123@gmail.com", "ABC123", "something");
	}
}
