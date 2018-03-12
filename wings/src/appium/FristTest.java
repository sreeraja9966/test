package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class FristTest {
public static void main(String[] args) {
		
		//Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "My Phone");
		caps.setCapability("udid", "0123456789ABCDEF"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "6.0");
		caps.setCapability("appPackage", "com.android.vending");
		caps.setCapability("appActivity", "com.google.android.finsky.activities.MainActivity");
		caps.setCapability("noReset", "true");
		
		//Instantiate Appium Driver
		try {
				AppiumDriver<MobileElement> d = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
			
			//d.findElement(By.xpath("//android.widget.TextView[@text='GAMES']")).click();
				//d.switchTo().frame(1);
			d.findElement(By.xpath("//android.widget.LinearLayout//android.widget.RelativeLayout/android.widget.ImageView")).click();	
				
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
	}
}
