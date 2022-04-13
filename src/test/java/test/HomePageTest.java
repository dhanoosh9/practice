package test;

import org.testng.annotations.Test;


import page.HomePage;

public class HomePageTest extends BaseClass {
	

	@Test
	public void homepageTest() throws InterruptedException {
		
		HomePage homepage = new HomePage();
		homepage.homeBtn();
		homepage.Search("t-shirt");
		
	}
}
