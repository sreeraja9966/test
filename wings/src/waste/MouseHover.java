package waste;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MouseHover {
	public static void main(String[] args) throws AWTException {
		
		WebDriver d =new FirefoxDriver();
		
		
		d.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=_lWOWrvWLIyvX9DLofAJ");
		d.manage().window().maximize();
		Robot robo =new Robot();
		
		robo.mouseMove(396, 393);
		robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robo.keyPress(KeyEvent.VK_R);
		
		
	}

}
