package utilities;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import framework.DriverScript;
import testBase.TestBase;

public class AccountModification extends TestBase {
	
	@Test
	public void login(){
		
		DriverScript.loadExcel("E://wings//wingslogin.xls","Sheet1","TC_01");
	
	
	}
	
	
/*	@Test
	public void modificationModule(){
		DriverScript.loadExcel("E://wings//AccountModification.xls","modificationModule","BeforePassing");
	}*/
	/*@AfterTest
	public void modifyDeposit(){
		DriverScript.loadExcel("E://wings//AccountModification.xls","Modify Deposit","BeforePassing");
	}*/
	
	
	@AfterTest
	public void changeOG(){
		DriverScript.loadExcel("E://wings//AccountModification.xls","Change O-G","BeforePassing");
	}
}
