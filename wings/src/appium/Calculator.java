package appium;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import actions.Action_Keys;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Calculator {
public static void main(String[] args) {
		
		//Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "My Phone");
		caps.setCapability("udid", "0123456789ABCDEF"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "6.0");
		caps.setCapability("appPackage", "com.android.calculator2");
		caps.setCapability("appActivity", "com.android.calculator2.Calculator");
		caps.setCapability("noReset", "true");
		
		//Instantiate Appium Driver
		try {
				AppiumDriver<MobileElement> d = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
			
			//d.findElement(By.xpath("//android.widget.TextView[@text='GAMES']")).click();
				//d.switchTo().frame(1);
			d.findElement(By.xpath("//android.widget.Button[@text='7']")).click();
			d.findElement(By.xpath("//android.widget.Button[@text='+']")).click();
			d.findElement(By.xpath("//android.widget.Button[@text='3']")).click();
			System.out.println(d.findElement(By.xpath("//android.widget.EditText [@index='1']")).getText());
		Action_Keys.getAndriodScreenshot(d,"calc");
			
		/*	File f=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(f, new File("E://screenshots\\"+ "calc"+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		
		
		
			
				
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
	}

}
