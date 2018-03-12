package framework;


import excel.ExcelUtils;
import testBase.TestBase;

public class DriverScript extends TestBase{
	public static String actionname;
	public static String actionKeyword;
	public static String testObject;
	public static String testData;
	
	public static String testDataAsInt1;
	public static String testDataAsInt2;
	
	public static LoadActionKeys act =new LoadActionKeys();
	
	
	

	public static void loadExcel(String filepath,String sheetname,String testcaseid)  {
		try{
		String filePath = filepath;
		String sheetName = sheetname;
		String testId="";
		
		ExcelUtils.setExcelFile(filePath, sheetName);
		int nr = ExcelUtils.getRowCount(sheetName);
		
		for(int i=1; i<nr; i++){
			testId =ExcelUtils.getCellData(i, 0);
			actionname=ExcelUtils.getCellData(i, 2);
			actionKeyword = ExcelUtils.getCellData(i,3);
			testObject = ExcelUtils.getCellData(i, 4);
			testData = ExcelUtils.getCellData(i, 5);
			testDataAsInt1=ExcelUtils.getCellData(i, 6);
			testDataAsInt2=ExcelUtils.getCellData(i, 7);
			int number1=0;
			int number2=0;
			
			try{
				number1 = Integer.parseInt(testDataAsInt1);
				
			}
			catch(Exception e){
				number1=0;
			}
			try{
				number2 = Integer.parseInt(testDataAsInt2);
				
			}
			catch(Exception e){
				number2=0;
			}
			System.out.println(actionKeyword+"-"+testObject+"-"+testData+"--"+actionname+"---"+number1+"--"+number2);
			if(testId.equalsIgnoreCase(testcaseid)){
			act.actionkeys(actionKeyword, testObject, testData,number1,number2);
			
			}
			else{
System.out.println("Failed to Load");				
			}
			}
			}	
		catch(Exception e){
			
		}}
		
		
			
		
	}

