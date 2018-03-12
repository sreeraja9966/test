package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import actions.Action_Keys;
import testBase.TestBase;

public class CustomerSearch extends TestBase {
	
	
	
	public static void customerIdSearch(String custId){
		
		
		d.findElement(By.xpath("//select[@id='operator']/following::img[1]")).click();
		for (String winHandle : d.getWindowHandles()) {
		    d.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
		}
		d.manage().window().maximize();
		
		Action_Keys.ddownbyindex("//select[@name='customerSearch']");
		d.findElement(By.xpath("//input[@id='txtCID']")).sendKeys(custId);
		d.findElement(By.xpath("//input[@id='txtCID']/following::img")).click();
		d.findElement(By.xpath("//input[@id='txtCID']/following::input[1]")).click();
		d.findElement(By.xpath("//input[@id='txtCID']/preceding::img")).click();
		
		
		
		
		
		
		
	}

}
