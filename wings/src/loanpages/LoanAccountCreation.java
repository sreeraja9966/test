package loanpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import actions.Action_Keys;
import actions.ReportActionKeys;
import common.FindElement;
import loanCommon.LoanAccountNumber;
import loanCommon.loanDisbursmentVouchers;
import testBase.TestBase;
import framework.DriverScript;




public class LoanAccountCreation extends TestBase{
	
	
	
	public static DriverScript used=new DriverScript();
	
	/*@BeforeMethod
	public void login(){
	
		used.loadExcel("E://wings//wingslogin.xls","Sheet1","TC_01");
	
	
	}*/
	
	@Test
	public void loanaccount(){
	
		used.loadExcel("E://wings//Loanaccountcreation.xls","Login Test","BeforePassing");
	
	
	}
	
	
	@AfterMethod
	public void handle(){
		ReportActionKeys.endParent();
		ReportActionKeys.writeLogToReport();
			
		}

	
	/*@Test(dependsOnMethods="loanaccount")
	public void getLoanAccountNumber(){
		LoanAccountNumber.setaccNumber();
	}
	@Test(dependsOnMethods="getLoanAccountNumber")
	public void loanaccountPassing(){
	
		used.loadExcel("E://wings//Loanaccountcreation.xls","Login Test","Passing");
	
	
	}
	*/
	
	
	
	
	
	
	/*@CacheLookup
	@FindBy(how=How.XPATH,using="//input[@id='txtUserId']") WebElement username;
	
	@CacheLookup
	@FindBy(how=How.CSS,using="input#txtPassWd" ) WebElement passwd;
	
	@CacheLookup
	@FindBy(how=How.ID,using="Button1") WebElement login_button;
	
	public void LoginPages(){
		
		username.sendKeys();
		passwd.sendKeys();
		login_button.click();
			
	}*/

}
