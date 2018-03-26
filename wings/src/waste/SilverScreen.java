package waste;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import com.sun.glass.events.KeyEvent;

import actions.Action_Keys;
import common.FindElement;
import common.VerifyTitle;
import robotFrameWork.Robot_Keys;
import testBase.TestBase;

public class SilverScreen extends TestBase{
	
	@Test
	
	public void testing(){
		Action_Keys obj=new Action_Keys();
		System.setProperty("webdriver.ie.driver", relativePath()+"\\Drivers\\IEDriverServer1.exe");
		d= new InternetExplorerDriver();
		d.get("http://192.168.1.156/eDesk50_6.0.1/logon.aspx ");
		FindElement.searchClickableElement(d, "//input[@name='txtUserId']").sendKeys("edesk50");
		
		FindElement.searchClickableElement(d, "//input[@id='txtPassWd']").sendKeys("1");
		
		FindElement.searchClickableElement(d, "//input[@id='txtInstId']").sendKeys("1");
		
		FindElement.searchClickableElement(d, "//input[@id='Button1']").click();
		Action_Keys.swithToDefaultContent();
		Action_Keys.swithtoFrame("top");
		Action_Keys.sleep(3000);
		//Action_Keys.clickWithJavaExecuter("imgOpr");
		Action_Keys.clickBtn("//img[contains(@src,'../images/ModuleButtons/mod_btn_opertn_active.gif')]");
		
	Action_Keys.swithToDefaultContent();
	Action_Keys.swithtoFrame("middle");
	
	Action_Keys.swithtoFrame("left");
	Action_Keys.sleep(3000);
Action_Keys.clickSilverlight("_ctl2");
		//obj.handle();
		/*Action_Keys.sleep(3000);
		try {
			Robot rob =new Robot();
			rob.keyPress(KeyEvent.VK_CONTROL);
			
			
			
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		Robot_Keys.robomouseHover(671, 562);
		Robot_Keys.roboMouseOperation("leftClick");
		System.out.println("Page Title----------->   "+d.getTitle());
		VerifyTitle.verify("AmountEntry");
		obj.closeSilverlight();
		Action_Keys.sleep(3000);
		Action_Keys.swithToDefaultContent();
		Action_Keys.swithtoFrame("middle");
		
		Action_Keys.swithtoFrame("left");
		Action_Keys.sleep(3000);
	Action_Keys.clickSilverlight("_ctl3");
	Robot_Keys.robomouseHover(671, 562);
	Robot_Keys.roboMouseOperation("leftClick");System.out.println("Page Title----------->   "+d.getTitle());
	VerifyTitle.verify("Reject Repair");
	obj.closeSilverlight();
	Action_Keys.sleep(3000);
	Action_Keys.swithToDefaultContent();
	Action_Keys.swithtoFrame("middle");
	Action_Keys.swithtoFrame("left");
	Action_Keys.sleep(3000);
Action_Keys.clickSilverlight("_ctl4");
Robot_Keys.robomouseHover(671, 562);
Robot_Keys.roboMouseOperation("leftClick");System.out.println("Page Title----------->   "+d.getTitle());
VerifyTitle.verify("Balancing");
obj.closeSilverlight();
Action_Keys.sleep(3000);
	}
	

}
