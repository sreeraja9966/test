package loanpages;

import org.testng.annotations.Test;

import framework.DriverScript;
import loanCommon.LoanAccountNumber;
import loanCommon.loanDisbursmentVouchers;

public class LoanDisbursment {
	public static DriverScript used=new DriverScript();
	@Test(priority=1)
	public void loandisbursmentBeforeAccNo(){
	
		used.loadExcel("E://wings//LoanDisbursment.xls","Sheet1","BeforeAccountNumber");
	
	
	}
	
	@Test(dependsOnMethods="loandisbursmentBeforeAccNo")
	public void enterloanaccNum(){
		LoanAccountNumber.getaccnumberInLoanDis();
	}
	
	
	@Test(dependsOnMethods="enterloanaccNum")
	public void loandisbursmentAfterAccNo(){
	
		used.loadExcel("E://wings//LoanDisbursment.xls","Sheet1","AfterAccountNumber");
	
	
	}
	
	@Test(dependsOnMethods="loandisbursmentAfterAccNo")
	public void getVoucherNumber(){
		 
		loanDisbursmentVouchers.getVoucherNumber();
	}
	
	@Test(dependsOnMethods="getVoucherNumber")
	public void setvoucher(){
		loanDisbursmentVouchers.setvoucher();
	}
	
	@Test(dependsOnMethods="setvoucher")
	public void authloandisbursment(){
	
		
		used.loadExcel("E://wings//authLoanDisbursment.xls","Sheet1","TC_01");
	
	
	}
	
	
}
