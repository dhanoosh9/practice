package test;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static By signinbtn = By.cssSelector("[class='login']");
	public static By email = By.xpath("//input[@id='email']");
	public static By passwd = By.cssSelector("[id=passwd]");
	public static By submit = By.cssSelector("[id=SubmitLogin]");
	
	public static WebDriver driver;
	public static WebDriverWait waitE;
	ExtentTest test;

	@Parameters({"browser","baseURL"})
	@BeforeClass
	public void setup(String browserName,String url) throws InterruptedException {
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.navigate().to(url);
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	public static String randomstring() {
		String generatedstring = RandomStringUtils.randomAlphabetic(8);
		return generatedstring;
	}
	
	public static String randomNum() {
		String generatedstring2 = RandomStringUtils.randomNumeric(10);
		return generatedstring2;
	}
	
	public static void login(String Username, String Password) {
		driver.findElement(signinbtn).click();
		driver.findElement(email).sendKeys(Username);
		driver.findElement(passwd).sendKeys(Password);
		driver.findElement(submit).click();
	}
	
	//Click method with by element
	public static void click(By element) {
		waitE = new WebDriverWait(driver, Duration.ofSeconds(30));
		waitE.until(ExpectedConditions.elementToBeClickable(element)).click();
	}
	
	//Click method with web element element
	public static void click(WebElement element) {
		waitE = new WebDriverWait(driver, Duration.ofSeconds(30));
		waitE.until(ExpectedConditions.elementToBeClickable(element)).click();
	}
	
	//Send keys method with by element
	public static void sendKeys(By element,String text) {
		waitE = new WebDriverWait(driver, Duration.ofSeconds(30));
		waitE.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(text);
	}
	
	//Send keys method with web element element
	public static void sendKeys(WebElement element,String text) {
		waitE = new WebDriverWait(driver, Duration.ofSeconds(30));
		waitE.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(text);
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
		driver.quit();
	}
}