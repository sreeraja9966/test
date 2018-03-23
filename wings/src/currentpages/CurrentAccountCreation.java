package currentpages;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import actions.ReportActionKeys;
import framework.DriverScript;
import testBase.TestBase;

public class CurrentAccountCreation extends TestBase {
	

	@BeforeTest
	public void login(){
		
		DriverScript.loadExcel("E://wings//wingslogin.xls","Sheet1","TC_01");
	
	
	}
	
	@Test
	
	public void currentaccount(){
		
		DriverScript.loadExcel("E://wings//CreditAccountCreation.xls","Login Test","TC_01");
		
	}
	@AfterMethod
	public void handle(){
		ReportActionKeys.endParent();
		ReportActionKeys.writeLogToReport();
			
	}

}
