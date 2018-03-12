package common;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import actions.ReportActionKeys;
import testBase.TestBase;

public class FindElement extends TestBase {
	
public static WebElement searchClickableElement(WebDriver d,String xpath){
	WebDriverWait w = new WebDriverWait(d, 30);
	WebElement ele=null;
	
	try{
	ele=w.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath.trim())));
	return ele;}
	catch(Exception e){
		System.out.println("case failed");
		ReportActionKeys.writeLogInCaseOfFail(xpath+" is invalid");
		ReportActionKeys.addScreenShotInReport("Invalid xpath");
		System.out.println("case failed22222222");
		
		try {
			throw new Exception("invalid locator",e);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	return null;
	
	
	
	
	
	
	
}




}
