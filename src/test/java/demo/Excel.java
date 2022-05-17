package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static FileInputStream fi;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	public static int getRowCount(String xlfile, String xlsheet) throws IOException {
		fi =new FileInputStream(xlfile);
		wb = new XSSFWorkbook(xlsheet);
		ws = wb.getSheet(xlsheet);
		int rowcount = ws.getLastRowNum();
		wb.close();
		fi.close();
		return rowcount;
	}
	
	public static int getCellCount(String xlfile, String xlsheet, int rownum) throws IOException {
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(xlsheet);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rownum);
		int cellcount = row.getLastCellNum();
		wb.close();
		fi.close();
		return cellcount;
	}
	
	public static String getCellData(String xlfile, String xlsheet, int rownum, int cellnum) throws IOException {
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(xlsheet);
		ws = wb.getSheet(xlsheet);
		row = ws.createRow(rownum);
		cell = row.getCell(cellnum);
		String data;
		try {
			DataFormatter formatter = new DataFormatter();
			data = formatter.formatCellValue(cell);
		} catch(Exception e) {
			data="";
		}
		wb.close();
		fi.close();
		return data;
	}
	
	public void writeExcel(String sheetName, String cellvalue, int row, int col) throws Exception {
		  
		  String excelPath=System.getProperty("user.dir")+"/Data/ExampleData.xlsx";
		  
		  File file= new File(excelPath);
		  
		  FileInputStream fis= new FileInputStream(file);
		  
		  XSSFWorkbook wb= new XSSFWorkbook(fis);
		  
		  XSSFSheet sheet= wb.getSheet(sheetName);
		  sheet.createRow(0);
		  sheet.getRow(row).createCell(col).setCellValue(cellvalue);
		  
		  FileOutputStream fos= new FileOutputStream(new File(excelPath));
		  
		  wb.write(fos);
		  
		  wb.close();
		  
		  fos.close();
	}
}
