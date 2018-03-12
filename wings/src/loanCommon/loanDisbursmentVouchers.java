package loanCommon;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import actions.Action_Keys;
import common.FindElement;
import testBase.TestBase;

public class loanDisbursmentVouchers extends TestBase {
	public static String voucher; 
	
	public static void getVoucherNumber(){
		 voucher=d.switchTo().alert().getText();
		 voucher=voucher.replaceAll("\\D+","");
		 d.switchTo().alert().accept();
		
	}
	public static void setvoucher(){
		Action_Keys.backTomainwin();
		
		
		d.findElement(By.xpath("//div[@class='header-link hide-menu']")).click();
		//d.findElement(By.xpath("//a[@id='a[0]89']")).click();
		
		FindElement.searchClickableElement(d, "//a[@id='a[0]89']").click();
		
		Action_Keys.swithtoFrame("myFrame");
		d.findElement(By.xpath("//a[@href='../ExecutableMenuServlet?serialno=90&url=/Header/executablesWidget.jsp']")).click();
		Action_Keys.backTomainwin();
		Action_Keys.swithtoFrame("myFrame");
		d.findElement(By.xpath("//a[@id='li93']/div/div/h5[contains(text(),'Auth Transfer ')]")).click();
		Action_Keys.backTomainwin();
		Action_Keys.swithtoFrame("myFrame");
		d.findElement(By.xpath("//input[@id='VoucherNumber']")).sendKeys(voucher);
	}
}
