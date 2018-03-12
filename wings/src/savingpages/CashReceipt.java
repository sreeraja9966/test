package savingpages;

import org.testng.annotations.Test;

import framework.DriverScript;
import savingcommon.CashReceiptVoucher;
import testBase.TestBase;

public class CashReceipt extends TestBase {
	
	
	@Test(priority=1)
	
	public void depositamt(){
		DriverScript.loadExcel("E://wings//CashReceipt.xls", "Login Test","TC_01");
	}
	@Test(dependsOnMethods="depositamt")
public void getvouchernum(){
	CashReceiptVoucher.getVouchernumber();
}
	@Test(dependsOnMethods="getvouchernum")
public void authrecceipt(){
	DriverScript.loadExcel("E://wings//authCashReceipt.xls", "Login Test","TC_01");
}
	@Test(dependsOnMethods="authrecceipt")
public void setvouchernum(){
	CashReceiptVoucher.setVouchernumber();
}
}
