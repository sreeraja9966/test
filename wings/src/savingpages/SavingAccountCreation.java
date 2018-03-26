package savingpages;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import framework.DriverScript;
import loanCommon.LoanAccountNumber;
import testBase.TestBase;

public class SavingAccountCreation extends TestBase {
	
	
	/*
	@BeforeTest
	public void login(){
	
		DriverScript.loadExcel("E://wings//wingslogin.xls","Sheet1","TC_01");
	
	
	}

	*/
	@Test()
	
	public void savingaccount(){
		
		DriverScript.loadExcel(relativePath()+"\\excelFile\\savingaccountcreation.xls","Login Test","TC_01");
		
	}
	
	@AfterMethod
	public void handle(ITestResult result){
		if(result.getStatus()==ITestResult.FAILURE){
			d.switchTo().defaultContent();
			
		}
	}
	/*@Test(dependsOnMethods="savingaccount")
	public void getsavingAccountNumber(){
		LoanAccountNumber.setaccNumber();
	}
	
	
@Test
(dependsOnMethods="getsavingAccountNumber")
	
	public void authsavingaccount(){
		
		DriverScript.loadExcel("E://wings//authsavingacc.xls","Login Test","TC_01");
		
	}*/
	
}
