package appium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppiumCommonFunctions extends FlatFormSetup{
	
	public static WebElement expilicWait(String locator){
		WebDriverWait wait= new WebDriverWait(d, 100);
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
	}

public static WebElement findAppiumElement(String xpath){
	WebElement ele=null;
	try{
		return expilicWait(xpath);
	}
	catch(Exception e){
		e.printStackTrace();
	}
	return null;
}

}
