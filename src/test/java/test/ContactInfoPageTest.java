package test;

import org.testng.annotations.Test;

import page.ContactInfoPage;

public class ContactInfoPageTest extends BaseClass {
	
	@Test
	public void contactInfo() throws Exception {
		ContactInfoPage.Contactus("dhanoosh369@gmail.com","ABCD123","My order is not yet delivered");
	}
	
}
