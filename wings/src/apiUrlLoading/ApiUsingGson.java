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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import actions.ReportActionKeys;
import excel.ExcelUtils;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import waste.DataDrivenFor;
import waste.Db;
import waste.ImplementJson;
import waste.Testing;
import waste.UrlPrinting;
import waste.callGson;

public class ApiUsingGson {
	public static String instructionId=null;
	public static String query=null;
	public static int size=0;
	public static String keyFromExcel=null;
	public static	String dataFromPS=null;
	public static	String datafromDB=null;
	public static JSONObject JSONResponseBody;
/*	@BeforeTest
	public static void StartReport(){
		ReportActionKeys.setReportLocation("C:\\Report\\wingsGetAPI.html");
		ReportActionKeys.appendToExstingReport("C:\\Report\\wingsGetAPI.html");
		
	}*/
	@Test 
	public void getRequestFindCapital() throws JSONException {
		

		String APIUrl ="http://192.168.4.33:8080/vsoft-iris-interface-rest-1.0.0-2-SNAPSHOT/iris/v1/iris/account/splinstructions";
		
		
		String APIBody ="{\"productId\": \"5\",\"accountNumber\": \"002005004795\"}";
				
						
			// Building request using requestSpecBuilder
			RequestSpecBuilder builder = new RequestSpecBuilder();
				
			//Setting API's body
			builder.setBody(APIBody);
				
			//Setting content type as application/json or application/xml
			builder.setContentType("application/json; charset=UTF-8");
				
			RequestSpecification requestSpec = builder.build();

			//Making post request with authentication, leave blank in case there are no credentials- basic("","")
			
			
			@SuppressWarnings("deprecation")
			Response response =given().authentication().preemptive().basic("", "").spec(requestSpec).when().post(APIUrl);
			
		String resp=response.asString();
				System.out.println(resp);
				 
//				Gson gson = new Gson();  
//				ImplementJson[] imp = gson.fromJson(resp, ImplementJson[].class);  
//				
		ImplementJson[] imp = callGson.parseArrayGsonResponse(resp, ImplementJson[].class);
		
		
				
				
			
//				ImplementJson	imp = gson.fromJson(resp, ImplementJson.class);
				
				System.out.println(imp);
				//ImplementJson[] implementJson = imp.getImplementJson();
				System.out.println(imp.length);
				for(int i=0;i<imp.length;i++)
				{
					System.out.println(imp[i].getStatus().getKey());
					System.out.println(imp[i].getStatus().getValue());
				}
		
		 //System.out.println(imp.());
		 
		//System.out.println(imp.getAccountNumber());
		

		}
		
}
	

