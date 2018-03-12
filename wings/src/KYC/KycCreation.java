package KYC;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import framework.DriverScript;
import testBase.TestBase;

public class KycCreation extends TestBase {
	

	
	/*@Test(priority=1)
	public void login(){
	
		DriverScript.loadExcel("E://wings//wingslogin.xls","Sheet1","TC_01");
	
	
	}*/
	
	@Test
	public void kycCreation(){
	
		DriverScript.loadExcel("E://wings//KYC.xls","Login Test","BeforePassing");
	
	
	}
	@AfterMethod
	public void handle(ITestResult result){
		if(result.getStatus()==ITestResult.FAILURE){
			d.switchTo().defaultContent();
			
		}
	}

}
