package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Utilis {
	
	
	public static WebDriver d;
	

public static WebDriver strartBrowser(String browser){
	System.out.println("-------> browser called");
	if(browser.equals("firefox")){
		d= new FirefoxDriver();
		d.manage().window().maximize();
		
		return d;
			}
	else if(browser.equals("chrome")){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sgarlapati\\Downloads\\chromedriver_win32");
		d= new ChromeDriver();
		return d;
		}
	else if(browser.equalsIgnoreCase("ie")){
		try{
		System.setProperty("webdriver.ie.driver", "C:\\Users\\sgarlapati\\Downloads\\IEDriverServer_Win32_2.53.0"+"\\IEDriverServer.exe");
		d= new InternetExplorerDriver();
		d.manage().window().maximize();
		return d;}
		catch(Exception e){
			e.printStackTrace();
		}
		}
	return null;
}
 
public static void implictwait(int time)
{
	d.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS );
}


public static void sleep(int time){
	try {
		Thread.sleep(time);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
