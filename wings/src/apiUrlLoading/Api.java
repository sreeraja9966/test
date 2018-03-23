package apiUrlLoading;

import static io.restassured.RestAssured.given;

import java.sql.SQLException;

import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import actions.ReportActionKeys;
import excel.ExcelUtils;
import io.restassured.response.Response;
import waste.DataDrivenFor;
import waste.Db;
import waste.ImplementJson;
import waste.UrlPrinting;
import waste.callGson;

public class Api {
	/*public static String instructionId=null;
	public static String query=null;
	public static int size=0;
	public static String keyFromExcel=null;
	public static	String dataFromPS=null;
	public static	String datafromDB=null;
	public static JSONObject JSONResponseBody;
	@BeforeTest
	public static void StartReport(){
		ReportActionKeys.setReportLocation("C:\\Report\\wingsGetAPI.html");
		ReportActionKeys.appendToExstingReport("C:\\Report\\wingsGetAPI.html");
		
	}
	@Test 
	public void getRequestFindCapital() throws JSONException {
		
	for(int k=1;k<5;k++){
		//Loading URL 
		String APIUrl=UrlPrinting.testurl().get(k-1);
		System.out.println(APIUrl);
		ReportActionKeys.startTest(ExcelUtils.getCellData(k-1, 0));
		//Getting response of the URl
		Response response =given().authentication().preemptive().basic("", "").get(APIUrl);
		String resp=response.asString();
		System.out.println(resp);
		//Converting the response into JSON Object
		
		 JSONResponseBody = new JSONObject(resp);
				
		
		
		
	
		//Defining Sheet Name of the excel sheet 
		String	sheetName="Sheet"+k;
	String	path="C://Users//sgarlapati//Desktop//api.xls";
	//Loading keys & Queries
	ExcelUtils.setExcelFile(path, sheetName);
	int row=ExcelUtils.getRowCount(sheetName);
	System.out.println("row---->"+row);
	int col=ExcelUtils.getColumnCount(sheetName);	
	
	
	for(int i=0;i<row;i++){
		
	
		
			instructionId=ExcelUtils.getCellData(i,0);
			System.out.println(instructionId);
			keyFromExcel=instructionId.trim();
			dataFromPS = JSONResponseBody.getString(keyFromExcel);
			query=ExcelUtils.getCellData(i, 1);
			System.out.println(query);
			try {
				datafromDB=Db.getDb(query, 1);
				
			} catch (ClassNotFoundException e) {
			e.printStackTrace();
			}
			catch (SQLException e) {
			e.printStackTrace();
			}
			
			if(dataFromPS.equals(datafromDB)){
				
				System.out.println(sheetName+" Instruction  Sucessfully fetched");
				ReportActionKeys.writeLogInCaseOfPass("for "+datafromDB+"  is"+keyFromExcel+"="+dataFromPS);
					
				}
			else{
				ReportActionKeys.writeLogInCaseOfFail("for "+datafromDB+"  is  "+keyFromExcel+"!="+dataFromPS);
			}
	}
	

	
	
	}}
		
	@AfterTest
	public void writeReport(){
		ReportActionKeys.endParent();
		ReportActionKeys.writeLogToReport();
	}
	*/
		}
		
	
	

