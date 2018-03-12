package accountClosure;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import framework.DriverScript;
import testBase.TestBase;

public class Savings extends TestBase {
	
	@BeforeTest
	public void login(){
		
		DriverScript.loadExcel("E://wings//wingslogin.xls","Sheet1","TC_01");
	
	
	}

	
	@Test()
	
	public void savingClosure(){
		
		DriverScript.loadExcel("E://wings//SavingClosure.xls","Sheet1","BeforePassing");
		
	}

}
