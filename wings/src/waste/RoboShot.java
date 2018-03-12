package waste;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import actions.Action_Keys;

public class RoboShot {
public static void main(String[] args) {
	WebDriver d=new FirefoxDriver();
	d.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=CCyEWpO-GdKdXr6TgbgH");
	d.manage().window().maximize();
	Action_Keys.robotScreenShot("E:\\screenshots\\chrome.png");
}
}
