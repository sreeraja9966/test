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





public class HttpURLConnectionExample extends TestBase{
	
/*	public static String  getDb(String query) throws  ClassNotFoundException, SQLException {	
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
@Test	(dataProvider="accountinfo")
public static void splInstr(String instructionId,String instructionIdDb)  throws JSONException,InterruptedException {
		 
		//Initializing Rest API's URL
	String APIUrl ="http://localhost:9090/API/iris/v1/iris/customers/customerInfo";
			//"http://192.168.1.45:8080/vsoft-iris-interface-rest/iris/v1/iris/accountNumberSearch";
	
			//"http://192.168.0.133:8080/vsoft-iris-interface-rest-1.0.0-2-SNAPSHOT/iris/v1/iris/customer/accountslist "; 
			
			
			//"http://192.168.0.133:8080/vsoft-iris-interface-rest-1.0.0-2-SNAPSHOT/iris/v1/iris/customer/splinstructions";
			
		//Initializing payload or API body
		//"{\"customerName\":\"All\",\"accType\":\"IN\",\"prdId\":\"299\",\"selectBranch\":\"*\",\"branchId\":\"002\"}";
				
	//"{\"customerId\": \"DS0000000053\",\"userId\": \"\",\"instituteId\": \"\",\"displayType\": \"A\",\"branchId\":\"002\", \"accountType\":\"*\" }";
			
			
	String APIBody ="{\"customerId\":\"DS0000000068\"}";
			//"{\"customerId\":\"DS0000000015\",\"userId\":\"\",\"instituteId\":\"\",\"businessDate\":\"\"}"; //e.g.- "{\"key1\":\"value1\",\"key2\":\"value2\"}"
					
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
		//System.out.println("---------->"+resp);
		String fin=resp.substring(resp.indexOf("[")+1,resp.indexOf("]"));
		
		
		System.out.println("fin is "+fin);
		//System.out.println("final string---------->"+fin);
		JSONObject JSONResponseBody = new JSONObject(fin);
			
		org.json.JSONArray jsonArray = JSONResponseBody.getJSONArray("");
		
		for(int i=0;i<jsonArray.length();i++){
			JSONObject json = jsonArray.getJSONObject(i);
			String dataFromPS=json.get(instructionId).toString();
			System.out.println("accountNumber from postman->"+json.get(instructionId));
			String datafromDB=null;
			try {datafromDB=getDb(instructionIdDb);
				System.out.println("acc no from db--->"+getDb(instructionIdDb));
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ReportActionKeys.appendToExstingReport("C:\\Report\\wingsPostCall.html");
			ReportActionKeys.startTest("API TESTING");
			ReportActionKeys.writeLogInfo("COMPARING DATA");
			if(dataFromPS==datafromDB){
				
			ReportActionKeys.writeLogInCaseOfPass("Instruction  Sucessfully fetched");
			
				System.out.println("Instruction  Sucessfully fetched");
			}
			else{ReportActionKeys.writeLogInCaseOfFail("DATA NOT MATCHED WITH DATABASe");
				
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
		
		
}
@DataProvider(name="accountinfo")
public Object[][] postData(){
	return DataDrivenFor.data("C://Users//sgarlapati//Desktop//testingPostman.xls","Sheet1");
}*/
}