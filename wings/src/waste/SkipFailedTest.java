package waste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import actions.Action_Keys;
import testBase.TestBase;

public class SkipFailedTest extends TestBase{
	
	
	@Test
	public static void skipTest(){
		strartBrowser("firefox");
		d.get("file:///C:/Users/sgarlapati/Desktop/alert.html");
		d.findElement(By.xpath("//input[@type='button']")).click();
		Action_Keys.getNumericsofAlert();
		System.out.println("goooooooooooooooo  ");
		Action_Keys.printAlretText();
	}
	
	

}