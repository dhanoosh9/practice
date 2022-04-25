package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.XLUtils;

import page.LoginPage;

public class LoginPageDDT extends BaseClass{
	
	@Test(dataProvider="LoginData")
	public void signintestddt(String username,String password) {
		LoginPage.Sigin(username,password);
	}
	
	@DataProvider(name = "LoginData")
	String [][] getData() throws Exception
	{
		String path = System.getProperty("user.dir")+"/src/test/java/data/LoginData.xlsx";
		int rownum = XLUtils.getRowCount(path, "Sheet1");
		int colcount = XLUtils.getCellCount(path, "Sheet1", 1);
		
		String logindata[][] = new String[rownum][colcount];
		for(int i=1;i<=rownum;i++) {
			for(int j=0;j<colcount;j++) {
				logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1",i, j);
			}
		}
		return logindata;
	}
}
