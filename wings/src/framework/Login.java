package framework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import actions.ReportActionKeys;
import testBase.TestBase;

public class Login extends TestBase{

	
	@Test
	public void login(){
		try{
		DriverScript.loadExcel("E://wings//wingslogin.xls","Sheet1","TC_01");
//		System.out.println(d.getTitle());
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	@AfterMethod
	public void handle(){
		System.out.println("afterMethod ######### Executed");
		ReportActionKeys.endParent();
		ReportActionKeys.writeLogToReport();
			
		}
}
