package appium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import actions.Action_Keys;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AndraBank extends FlatFormSetup {
	
	@BeforeTest
	
	public void startApp(){
		
		FlatFormSetup.setFlatfor("com.iexceed.ANDHRABANK_ONLINE", "com.iexceed.ANDHRABANK_ONLINE.AppzillonMainScreen");
		
	}
	
	@Test(priority=0)
	
	public static void verifyUserName() throws Exception{
	
		String userName=AppiumCommonFunctions.findAppiumElement("//android.view.View[@content-desc='GARLAPATI SRI RAJA VENKATRATNAM']").getText();
	if(userName.equals("GARLAPATI SRI RAJA VENKATRATNAM")){
		System.out.println("Correct user");
		
		Action_Keys.getAndriodScreenshot(d, "CorrectUser");
	}
	else{System.out.println("----------->"+userName);}
	}

@Test(priority=2)
	
	public static void enterMpin() throws Exception{
//	Action_Keys.implictwaitForAndriod(3000);
		
		AppiumCommonFunctions.findAppiumElement("//android.widget.EditText[@resource-id='login__MPinLabel']").click();
		
		AppiumCommonFunctions.findAppiumElement("//android.view.View[@resource-id='element_button_5']").click();
		
		AppiumCommonFunctions.findAppiumElement("//android.view.View[@resource-id='element_button_6']").click();
		
		AppiumCommonFunctions.findAppiumElement("//android.view.View[@resource-id='element_button_5']").click();
		AppiumCommonFunctions.findAppiumElement("//android.view.View[@resource-id='element_button_6']").click();
		
}
@Test(priority=3)

public static void menu() throws Exception{


	AppiumCommonFunctions.findAppiumElement("//android.view.View[@resource-id='MenuButton']").click();
	
	System.out.println("menu clicked");
	
	List<MobileElement> list1=d.findElements(By.xpath("//android.view.View[contains(@resource-id,'LIT_')]"));
	
	
	
	List<MobileElement> list=d.findElements(By.xpath("//android.view.View[contains(@resource-id,'LIT_')]/android.view.View/android.view.View[2]"));
	
	System.out.println("size of the list&&&&& "+list.size());
	
System.out.println("size of the list111111 "+list1.size());
	int i=1;
/*for(MobileElement e:list){
	


	e.click();
	d.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	//Thread.sleep(15000);
Action_Keys.getAndriodScreenshot(d, i+") "+e.getAttribute("contentDescription"));
	System.out.println(i+") "+e.getAttribute("contentDescription"));
	//Thread.sleep(3000);
	//AppiumCommonFunctions.findAppiumElement("//android.view.View[@resource-id='MenuButton']").click();
	i++;
}*/
d.quit();
for(MobileElement e:list1){
	

	System.out.println(i+") "+e.getAttribute("id"));
	i++;
}

	//d.findElement(By.xpath("//android.view.View[@resource-id='LIT_ACC_li']")).click();
	
}


}
