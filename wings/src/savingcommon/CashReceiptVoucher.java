package savingcommon;

import org.openqa.selenium.WebElement;

import common.FindElement;
import testBase.TestBase;

public class CashReceiptVoucher extends TestBase {
	
	public static String voucher;
	
	public static void getVouchernumber(){
		
		WebElement ele=FindElement.searchClickableElement(d, "//span[contains(text(),'Transaction')]");
		
		voucher=ele.getText(); 
		 voucher=voucher.replaceAll("\\D+","");
	}
	
	
	public static void setVouchernumber(){
		
		FindElement.searchClickableElement(d, "//input[@id='VoucherNumber']").sendKeys(voucher);
		FindElement.searchClickableElement(d, "//td[contains(text(),'Approval')]").click();
		FindElement.searchClickableElement(d, "//input[@id='radio1']").click();
		FindElement.searchClickableElement(d, "//input[@class='Button']").click();
	}

}
