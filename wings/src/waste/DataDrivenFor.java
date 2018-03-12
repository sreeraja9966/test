package waste;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import excel.ExcelUtils;

public class DataDrivenFor {
	
	

	

	public static Object[][] data(String datafile,String sheetName){
		
		Object[][] custdata=null;
		try {
			ExcelUtils.setExcelFile(datafile, sheetName);
			int rows=ExcelUtils.getRowCount(sheetName);
			
			int columns=ExcelUtils.getColumnCount(sheetName);
			
			custdata=new Object[rows][columns];
			for(int i=0;i<=rows-1;i++){
				for(int j=0;j<=columns-1;j++){
											custdata[i][j]=ExcelUtils.getCellData(i, j);
		
					
				}
}}catch (Exception e) {
	e.printStackTrace();
}
return custdata;

}}