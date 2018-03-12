package rdpages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import framework.DriverScript;
import testBase.TestBase;

public class RdAccountOpening extends TestBase {
	
	
/*
	@BeforeTest
	public void login(){
		
		DriverScript.loadExcel("E://wings//wingslogin.xls","Sheet1","TC_01");
	
	
	}
*/
	
	@Test()
	
	public void odaccount(){
		
		DriverScript.loadExcel("E://wings//RDaccountcreation.xls","Login Test","BeforePassing");
		
	}

}
