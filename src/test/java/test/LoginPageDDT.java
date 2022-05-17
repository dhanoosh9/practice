package test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.XLUtils;


public class LoginPageDDT extends BaseClass{
	
	@Test(dataProvider="LoginData")
	public void signintestddt(String username,String password) {
		LoginPageTest.login(username,password);
	}
	
	@DataProvider(name = "LoginData")
	String[][] getData() throws IOException {
		String path = System.getProperty("user.dir")+"/src/test/java/data/LoginData.xlsx";
		int rownum = XLUtils.getRowCount(path, "Sheet1");
		int cellcount = XLUtils.getCellCount(path, "Sheet1", 1);
		
		String[][] logindata = new String[rownum][cellcount];
		for(int i=1;i<=rownum;i++) {
			for(int j=0;j<cellcount;j++) {
				logindata[i-1][j] = XLUtils.getCellData(path,"Sheet1",i,j);
			}
		}
		return logindata;
	}
}
