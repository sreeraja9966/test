package loanCommon;

import common.FindElement;
import testBase.TestBase;

public class LoanAccountNumber extends TestBase {

	
	public static String accnum; 
	
	public static void setaccNumber(){
		accnum=FindElement.searchClickableElement(d, "//td[contains(text(),'002')]").getText();
		
	}
	
	public static void getaccnumberInLoanDis(){
		
		FindElement.searchClickableElement(d, "//input[@id='AccountNumber']").sendKeys(accnum);
		
	}
	
}
