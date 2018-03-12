package loanpages;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import framework.DriverScript;

public class GoldLoanCreation {

	
public static DriverScript used=new DriverScript();
	
	/*@BeforeMethod
	public void login(){
	
		used.loadExcel("E://wings//wingslogin.xls","Sheet1","TC_01");
	
	
	}
	*/
	@Test
	public void loanaccount(){
	
		used.loadExcel("E://wings//GoldLoanaccountcreation.xls","Login Test","BeforePassing");
	
	
	}
	
	
}
