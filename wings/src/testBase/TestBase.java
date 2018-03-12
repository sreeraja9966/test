package testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Utilis;



public class TestBase extends Utilis {
	
	public static File f;
	
	public 	static FileInputStream fis;
	
	public 	static 	Properties pro =new Properties();
public static HSSFWorkbook wb;
	

	public  static HSSFSheet sh;
		
	
	
	
	public static void init(){
		load();
		
		
		
		
	}
	public static void load(){
		f= new File("D://sree//test//src//porperty files//config");
		
 
		
		try {
			fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			pro.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
f= new File("D://sree//test//src//porperty files//page locaters");
		
		
		try {
			fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			pro.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
f= new File("D://sree//test//src//porperty files//configforRtgs");
		
		try {
			fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			pro.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			
			File f = new File("D:\\sree\\Excel\\excelfilee.xls");
		
				fis = new FileInputStream(f);
				
				wb = new HSSFWorkbook(fis);
				
			
				
				
					
				
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}
	public static WebElement getelement(String locater){
		sleep(3000);
		
		return 	d.findElement(By.xpath(locater));
	
		
	}
	public static String getvalue(int sheetnum,int rownum,int cellnum){
		sh = wb.getSheetAt(sheetnum);
		return sh.getRow(rownum).getCell(cellnum).getStringCellValue();
		
		}
	public static int noofrowsinexcel(int sheetno){
		sh=wb.getSheetAt(sheetno);
		return	sh.getLastRowNum();
				
	}
	public static int noofcolumns(int sheetno){
		sh=wb.getSheetAt(sheetno);
		return	sh.getRow(0).getPhysicalNumberOfCells();
				
	}
}
