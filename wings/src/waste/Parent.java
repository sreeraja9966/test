package waste;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parent {
	
	WebDriver d =new FirefoxDriver();
	@Test
	public void parentwin(){
		d.get("file:///C:/Users/sgarlapati/Desktop/Extra/r.html");
		String x=d.getWindowHandle();
		d.findElement(By.xpath("//a[contains(text(),'raja')]")).click();
		for (String winHandle : d.getWindowHandles()) {
		  System.out.println(winHandle);
			d.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
		JavascriptExecutor je=(JavascriptExecutor)d;
		System.out.println(je.executeScript("return window.length"));
		}
		d.switchTo().window(x);
		System.out.println("switched to dc");
		d.findElement(By.xpath("//a[contains(text(),'raja')]")).click();
	}

}
