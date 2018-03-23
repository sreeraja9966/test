package odpages;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import actions.ReportActionKeys;
import framework.DriverScript;
import testBase.TestBase;

public class OdAccountCreation extends TestBase {
	
	/*@BeforeTest
	public void login(){
		
		DriverScript.loadExcel("E://wings//wingslogin.xls","Sheet1","TC_01");
	
	
	}
*/
	
	@Test
	
	public void odaccount(){
		
		DriverScript.loadExcel("E://wings//ODaccountcreation.xls","Login Test","BeforePassing");
		
		
	}
	
	@AfterMethod
	public void handle(){
		ReportActionKeys.endParent();
		ReportActionKeys.writeLogToReport();
			
		}

}
