package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.Cart;
import page.HomePage;
import page.LoginPage;

public class CartTest extends BaseClass {
	
	@Parameters({"username","password"})
	@Test
	public void carttest(String username,String password) throws InterruptedException {
		LoginPage login = new LoginPage();
		login.Sigin();
		login.enterEmail(username);
		login.enterPasswd(password);
		login.clickSubmit();
		System.out.println("cart");
		HomePage page = new HomePage();
		System.out.println("cart");
		page.homeBtn();
		Cart cart = new Cart();
		cart.Item();
		cart.More();
		System.out.println("cart");
		cart.addtocart();
	}
	
}
