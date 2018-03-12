package framework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import actions.ReportActionKeys;
import testBase.TestBase;

public class Login extends TestBase{

	
	@Test
	public void login(){
		
		DriverScript.loadExcel("E://wings//wingslogin.xls","Sheet1","TC_01");
//		System.out.println(d.getTitle());
	
	}
	@AfterMethod
	public void handle(){
		ReportActionKeys.endTest();
		ReportActionKeys.writeLogToReport();
			
		}
}
