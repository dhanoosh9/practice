package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.Cart;
import page.HomePage;


public class CartTest extends BaseClass {
	
	@Parameters({"username","password"})
	@Test
	public void carttest(String username,String password) throws InterruptedException {
		login(username,password);
		System.out.println("Sign in completed");
		click(HomePage.homebtn);
		System.out.println("Home btn clicked");
		Cart.Item();
		System.out.println("Clicked on item and more button");
	}
	
}
