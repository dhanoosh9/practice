package demo;

import java.io.IOException;

import org.testng.annotations.Test;

import utilities.XLUtils;

public class SetData {
	
//	 Excel obj= new Excel();
//	 
//	 @Test
//	 public void writeExcelTest() throws Exception {
//	  obj.writeExcel("Sheet1", "Male", 0, 2);
//	 }
	
	@Test
	public void addData() throws IOException {
		String path = System.getProperty("user.dir")+"/Data/ExampleData.xlsx";
		XLUtils.setCellData(path, "Sheet1", 0, 0, "Name");
		XLUtils.setCellData(path, "Sheet1", 1, 1, "Password");
		XLUtils.setCellData(path, "Sheet1", 2, 2, "Password");
	}
	
}
