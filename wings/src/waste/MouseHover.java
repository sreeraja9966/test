package waste;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.python.modules.thread.thread;
import org.testng.annotations.Test;

public class MouseHover {
	@Test
	public static void test() throws AWTException {
		
		WebDriver d ;
		System.setProperty("webdriver.gecko.driver","C:\\Users\\sgarlapati\\Desktop\\geckodriver.exe");
		 d = new FirefoxDriver();
		
		
		d.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=_lWOWrvWLIyvX9DLofAJ");
		
		Robot robo =new Robot();
		
		robo.mouseMove(396, 393);
		System.out.println("MouseHover");
		robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robo.keyPress(KeyEvent.VK_R);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		d.close();
	}

}
