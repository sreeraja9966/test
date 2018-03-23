package waste;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.net.ssl.HttpsURLConnection;

import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import actions.ReportActionKeys;
import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.mapper.factory.GsonObjectMapperFactory;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.sf.json.JSONArray;
import testBase.TestBase;

import static io.restassured.RestAssured.given;





public class HttpURLConnectionExample2 extends TestBase{
	
	/*public static String keyFromExcel=null;
public static	String dataFromPS=null;
public static	String datafromDB=null;
	
	public static String  getDb(String query) throws  ClassNotFoundException, SQLException {	
		try{String dbUrl = "jdbc:postgresql://192.168.0.32/Base_4.8.0";					
		String username = "postgres";	
			String password = "password";	
			String myName=null;
		String query1 =query;// "select acc_no  from dep_mast where acc_no  like'002%' and prd_id=278 order by acc_no desc limit 1";	
		Class.forName("org.postgresql.Driver");			
		Connection con = DriverManager.getConnection(dbUrl,username,password);
		Statement stmt = con.createStatement();					
		ResultSet rs= stmt.executeQuery(query1);
		while (rs.next()){
		    		 myName = rs.getString(1);								        
		           	
		            System. out.println(myName+"  ");		
		    }	
		con.close();			

			return myName; 	
		}
		catch(Exception e){
			
		}
		return null;}
	@BeforeTest
	public void startReport(){
		ReportActionKeys.setReportLocation("C:\\Report\\wingsAPI.html");
	}
	
@Test	(dataProvider="accountinfo")
public static void splInstr(String instructionId,String instructionIdDb)  throws JSONException,InterruptedException {
	try{	 
		//Initializing Rest API's URL
	String APIUrl ="http://localhost:9090/API/iris/v1/iris/customers/customerInfo";
			
			
	String APIBody ="{\"customerId\":\"DS0000000068\"}";
			
					
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
	
	
		String fin=resp.substring(resp.indexOf("[")+1,resp.indexOf("]"));
		
		
		 keyFromExcel=instructionId.trim();
		
		System.out.println("fin is "+fin);
		
		
		JSONObject JSONResponseBody = new JSONObject(fin);
		
		//System.out.println("**************"+JSONResponseBody.getString(instructionId));
		 dataFromPS = JSONResponseBody.getString(keyFromExcel);
		
		System.out.println("data from ps--->"+keyFromExcel+"--->"+dataFromPS);
		
		
			datafromDB=getDb(instructionIdDb);
				System.out.println("acc no from db--->"+keyFromExcel+"--->"+datafromDB);
			 
				if(datafromDB!=null||!datafromDB.equalsIgnoreCase(null)||!datafromDB.equalsIgnoreCase("")||!datafromDB.equalsIgnoreCase(" ")||dataFromPS!=null||!dataFromPS.equalsIgnoreCase(null)||!dataFromPS.equalsIgnoreCase("")||!datafromDB.equalsIgnoreCase(" ")){
			ReportActionKeys.appendToExstingReport("C:\\Report\\wingsAPI.html");
			ReportActionKeys.startTest(keyFromExcel+"  Testing");
			ReportActionKeys.writeLogInfo("ActualData of  "+keyFromExcel+" ::"+datafromDB+  "DataFrom ps of  "+keyFromExcel+" :: "+dataFromPS+"   COMPARING DATA");
			System.out.println(datafromDB);
			
			if(dataFromPS.equals(datafromDB)){
				
			ReportActionKeys.writeLogInCaseOfPass("Instruction  Sucessfully fetched");
			
				
			}
			else{ReportActionKeys.writeLogInCaseOfFail("ActualData of  "+keyFromExcel+" ::"+datafromDB+  "DataFrom ps of  "+keyFromExcel+" :: "+dataFromPS+"    DATA NOT MATCHED WITH DATABASe");
				
			}}else{ReportActionKeys.writeLogInfo(datafromDB+" is NULL");}
			}
		
			catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				ReportActionKeys.writeLogInCaseOfFail("ActualData of  "+keyFromExcel+" ::"+datafromDB+  "DataFrom ps of  "+keyFromExcel+" :: "+dataFromPS+"  Exception");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				ReportActionKeys.writeLogInCaseOfFail("ActualData of  "+keyFromExcel+" ::"+datafromDB+  "DataFrom ps of  "+keyFromExcel+" :: "+dataFromPS+"  Exception");
			}
		catch (JSONException e) {
			// TODO Auto-generated catch block
			ReportActionKeys.writeLogInfo("ActualData of  "+keyFromExcel+" ::"+datafromDB+  "DataFrom ps of  "+keyFromExcel+" :: "+dataFromPS+"  JSONException");
		}
		catch (NullPointerException e) {
			// TODO Auto-generated catch block
			ReportActionKeys.writeLogInCaseOfFail("ActualData of  "+keyFromExcel+" fetching null");
		}
			
			
			
			
			
		}
		
		//System.out.println("lenght"+jsonArray.length());
		
		

		//Fetching the desired value of a parameter
		
		System.out.println("**************"+JSONResponseBody.getString(instructionId));
		String instruction = JSONResponseBody.getString(instructionId);
		System.out.println("Result from PostMan:----->    "+instruction);
		
		String splInst=null;
		try {
			splInst = getDb(instructionIdDb);
			System.out.println("Result from DB:----->    "+splInst);
		
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		//Asserting that result of Norway is Oslo
		if(instruction==splInst){
			System.out.println("Instruction  Sucessfully fetched");
		}
		else{System.out.println("DATA NOT MATCHED WITH DATABASe");
			
		}
		
		

@DataProvider(name="accountinfo")
public Object[][] postData(){
	return DataDrivenFor.data("C://Users//sgarlapati//Desktop//testingPostman.xls","Sheet1");
}
@AfterMethod
public void writeReport(){
	ReportActionKeys.endParent();
	ReportActionKeys.writeLogToReport();
}*/
}