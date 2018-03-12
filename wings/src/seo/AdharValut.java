package seo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import common.FindElement;
import testBase.TestBase;

public class AdharValut extends TestBase{

	
	@Test(invocationCount=10)
	
	public void rerun(){
		
		d=new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=fiqVWurCJLSvX4OysPgP");
		
		FindElement.searchClickableElement(d, "//input[@name='q']").sendKeys("aadhar vault services");
		
		FindElement.searchClickableElement(d, "//input[@value='Google Search']").click();
		
		findAllLinks();
		
		
		
	}
	public static void findAllLinks()
	 
	  {
	 
		  List<WebElement> elementList = new ArrayList();
	 
		  elementList = d.findElements(By.tagName("a"));
	 
		 String url="https://digilocker.gov.in/";
	 
		  List finalList = new ArrayList(); ;
	 
		  for (WebElement element : elementList)
	 
		  {
	// System.out.println(element.getAttribute("href"));
			  if(element.getAttribute("href") != null)
	 
			  {
	 
				 if(url.equalsIgnoreCase(element.getAttribute("href"))){
					 d.navigate().to(element.getAttribute("href"));
					 break;
				 }
	 
			  }		  
	 
		  }	
	 
		 d.close();
	 
	  }
}
