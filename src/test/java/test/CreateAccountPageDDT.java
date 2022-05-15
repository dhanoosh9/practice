package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.XLUtils;

public class CreateAccountPageDDT extends BaseClass {
	
	public static By email = By.cssSelector("[id=email_create]");
	public static By firstname = By.id("customer_firstname");
	public static By lastname = By.id("customer_lastname");
	public static By password = By.cssSelector("[type=password]");
	public static By create_btn = By.cssSelector("[id=SubmitCreate]");
	public static By optin = By.id("optin");
	
	@Test(dataProvider = "AccountData")
	public void createDDT(String Email, String Firstname, String Lastname,
			String Password, String Day, String Month, String Year, String Company,
			String Address1, String Address2,
			String City, String State, String Postcode, String Country, String AddInfo,
			String Hphone, String Mphone) {
		
		driver.findElement(signinbtn).click();
		driver.findElement(email).sendKeys(Email);
		driver.findElement(create_btn).click();
		//driver.findElement(By.cssSelector("[for=id_gender1]")).click();
		click(By.cssSelector("[for=id_gender1]"));
		driver.findElement(firstname).sendKeys(Firstname);
		driver.findElement(lastname).sendKeys(Lastname);
		driver.findElement(password).sendKeys(Password);
		WebElement days = driver.findElement(By.cssSelector("[id=days]"));
		selectValue(days, Day);
		WebElement months = driver.findElement(By.cssSelector("[id=months]"));
		selectValue(months, Month);
		WebElement years = driver.findElement(By.cssSelector("[id=years]"));
		selectValue(years, Year);
		driver.findElement(By.name("newsletter")).click();
		driver.findElement(By.id("optin")).click();
		driver.findElement(By.id("company")).sendKeys(Company);
		driver.findElement(By.name("address1")).sendKeys(Address1);
		driver.findElement(By.name("address2")).sendKeys(Address2);
		driver.findElement(By.name("city")).sendKeys(City);
		WebElement state = driver.findElement(By.name("id_state"));
		selectValue(state, State);
		driver.findElement(By.id("postcode")).sendKeys(Postcode);
		WebElement country = driver.findElement(By.name("id_country"));
		selectValue(country, Country);
		driver.findElement(By.name("other")).sendKeys(AddInfo);
		driver.findElement(By.name("phone")).sendKeys(Hphone);
		driver.findElement(By.id("phone_mobile")).sendKeys(Mphone);
		driver.findElement(By.xpath("//span[contains(.,'Register')]")).click();
		click(logout);
		
	}
	
	@DataProvider(name = "AccountData")
	String [][] getData() throws Exception
	{
		String path = System.getProperty("user.dir")+"/src/test/java/data/AccountData.xlsx";
		int rownum = XLUtils.getRowCount(path, "Sheet1");
		int colcount = XLUtils.getCellCount(path, "Sheet1", 1);
		
		String accountdata[][] = new String[rownum][colcount];
		for(int i=1;i<=rownum;i++) {
			for(int j=0;j<colcount;j++) {
				accountdata[i-1][j]=XLUtils.getCellData(path, "Sheet1",i, j);
			}
		}
		return accountdata;
	}
}
