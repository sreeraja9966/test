package apiUrlLoading;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import excel.ExcelUtils;

public class LoadUrl {
public static ArrayList<String> url;
	public static ArrayList<String> loading(String filePath,String sheetName){
		 url=new ArrayList<String>();
		excel.ExcelUtils.setExcelFile(filePath, sheetName);
		int col= ExcelUtils.getColumnCount(sheetName);
		int row=ExcelUtils.getRowCount(sheetName);
		
		for(int i=0;i<row;i++){
			
			try {//System.out.println(ExcelUtils.getCellData(i, j));
		
			url.add(ExcelUtils.getCellData(i, 1));
			//System.out.println(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		return url;
	}
	
	
}
