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
	public static String localDir;

public static WebDriver strartBrowser(String browser){
	System.out.println("-------> browser called");
	if(browser.equals("firefox")){
		System.setProperty("webdriver.gecko.driver",relativePath()+"\\Drivers\\geckodriver.exe");
		 d = new FirefoxDriver();
		
		return d;
			}
	else if(browser.equals("chrome")){
		System.setProperty("webdriver.chrome.driver", relativePath()+"\\Drivers\\chromedriver.exe");
		d= new ChromeDriver();
		return d;
		}
	else if(browser.equalsIgnoreCase("ie")){
		try{
		System.setProperty("webdriver.ie.driver", relativePath()+"\\Drivers\\IEDriverServer.exe");
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

public static String relativePath(){
	localDir = System.getProperty("user.dir");
	return localDir;
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
