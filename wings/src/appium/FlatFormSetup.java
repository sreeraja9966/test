package appium;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class FlatFormSetup {
public static AppiumDriver<MobileElement> d ;
	public static void setFlatfor(String appPackage,String appActivity) {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "My Phone");
		caps.setCapability("udid", "0123456789ABCDEF"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "6.0");
		caps.setCapability("appPackage", appPackage);
		caps.setCapability("appActivity", appActivity);
		caps.setCapability("noReset", "true");
		
		try{
			d= new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
