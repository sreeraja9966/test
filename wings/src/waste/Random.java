package waste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import actions.Action_Keys;
import testBase.TestBase;

public class Random extends TestBase {
@Test
	public static void tt() {
		Action_Keys.openNewTab("firefox");
		d.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=HOqfWpy5PKOvX-a-ufAB");
		d.manage().window().maximize();
		//d.findElement(By.xpath("//input[@name='SanctionedAdviceNumber']")).click();
		
		Action_Keys.clickBtn("//input[@name='q']");
	}
	
}
