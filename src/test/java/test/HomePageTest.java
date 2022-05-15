package test;


import org.testng.annotations.Test;


import page.HomePage;

public class HomePageTest extends BaseClass {
	
	public String item = readconfig.getSearch_item();
	
	@Test
	public void homepage() {	
		click(HomePage.homebtn);
		sendKeys(HomePage.search_box,item);
		click(HomePage.search_button);
	}
	
}
