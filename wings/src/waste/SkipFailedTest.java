package waste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SkipFailedTest {
	
	static WebDriver d ;
	@Test
	public static void skipTest(){
		d=new FirefoxDriver();
		d.get("https://www.google.com/gmail/about/");
		d.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
		
	}
	
	@AfterMethod
	public void handle(ITestResult result){
		if(result.getStatus()==ITestResult.FAILURE){
			d.get("https://www.google.co.in/?gws_rd=ssl");
		}
	}

}