package waste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrive {
	public static WebDriver d;
	@Test(dataProvider="data")
	public static void test(String uname,String pword){
		d=new FirefoxDriver();
		d.get("http://192.168.0.32:9090/Base_4.8.0_3/Login/SlogParent.jsp");
		d.findElement(By.xpath("//input[@id='txtUserId']")).sendKeys(uname);
		d.findElement(By.xpath("//input[@id='txtPassWd']")).sendKeys(pword);
		
	}
	
	
	@DataProvider(name="data")
	public static Object[][] ra(){
		Object[][] x=new Object[1][1];
x[1][0]="raja";
x[1][1] ="123";

	
		return x;
	}

	
	
	
}
