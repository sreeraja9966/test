package usPayments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.opera.core.systems.internal.input.KeyEvent;

import actions.Action_Keys;
import common.FindElement;
import framework.DriverScript;
import framework.LoadActionKeys;
import robotFrameWork.AdjustResolution;
import testBase.TestBase;

public class Login  extends TestBase{

	
	@Test
	public void logIn() throws Exception{
		
		

		
		DriverScript.loadExcel("E://uspayment//login.xls","Login","TC_01");
		
		DriverScript.loadExcel("E://uspayment//login.xls","Admin_Capture","TC_01");
		DriverScript.loadExcel("E://uspayment//login.xls","Admin_Branch Capture","TC_01");
		DriverScript.loadExcel("E://uspayment//login.xls","Admin_Customer","TC_01");
		DriverScript.loadExcel("E://uspayment//login.xls","Admin_ATM","TC_01");
		DriverScript.loadExcel("E://uspayment//login.xls","Admin_Security","TC_01");
		DriverScript.loadExcel("E://uspayment//login.xls","Admin_Site Configuration","TC_01");
		DriverScript.loadExcel("E://uspayment//login.xls","Admin_Supervisor-Capture","TC_01");
		DriverScript.loadExcel("E://uspayment//login.xls","Admin_Sort Pattern","TC_01");
		DriverScript.loadExcel("E://uspayment//login.xls","Reports","TC_01");
		DriverScript.loadExcel("E://uspayment//login.xls","Research","TC_01");
		//DriverScript.loadExcel("E://uspayment//login.xls","Reports","TC_01");
		
		
				
		System.out.println("--------------->"+d.getTitle());
		
		/*
		WebElement element = d.findElement(By.id("_ctl53"));
		JavascriptExecutor executor = (JavascriptExecutor)d;
		executor.executeScript("arguments[0].click();", element);
		Action_Keys.swithToDefaultContent();
	Action_Keys.swithtoFrame("middle");
	Action_Keys.swithtoFrame("right");
		
	System.out.println(FindElement.searchClickableElement(	d, "//*[@id='PageHeading']").getText());
		*/
		/*//Action_Keys.AcceptAlret();
		FindElement.searchClickableElement(d, "//button[@id='btn1']").click();
		
		DriverScript.loadExcel("E://uspayment//login.xls","Sheet4","TC_01");
		
		DriverScript.loadExcel("E://uspayment//login.xls","Sheet5","TC_01");
		
		AdjustResolution.mouseHoverUsingRobo(73, 732);
		
		
		
		Robot robo=new Robot();
		robo.keyPress(java.awt.event.KeyEvent.VK_TAB);
		//robo.mouseMove(86,738);
		
		AdjustResolution.robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		AdjustResolution.robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		AdjustResolution.robo.delay(1500);
		
		AdjustResolution.robo.keyPress(java.awt.event.KeyEvent.VK_5);
		AdjustResolution.robo.delay(1500);
		AdjustResolution.robo.keyPress(java.awt.event.KeyEvent.VK_1);
		
		AdjustResolution.robo.delay(1500);
		AdjustResolution.mouseHoverUsingRobo(192,732);
		
		
		AdjustResolution.robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		AdjustResolution.robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		AdjustResolution.robo.delay(1500);
		
		AdjustResolution.robo.keyPress(java.awt.event.KeyEvent.VK_5);
		AdjustResolution.robo.delay(1500);
		AdjustResolution.robo.keyPress(java.awt.event.KeyEvent.VK_1);
		AdjustResolution.robo.delay(1500);
		AdjustResolution.robo.keyPress(java.awt.event.KeyEvent.VK_TAB);
		AdjustResolution.robo.delay(1500);
		AdjustResolution.mouseHoverUsingRobo(345,49);
		AdjustResolution.robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		AdjustResolution.robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		AdjustResolution.robo.delay(1500);
		AdjustResolution.mouseHoverUsingRobo(111,45);
		AdjustResolution.robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		AdjustResolution.robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		AdjustResolution.robo.delay(500);
		AdjustResolution.robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		AdjustResolution.robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		AdjustResolution.robo.delay(1500);
		AdjustResolution.mouseHoverUsingRobo(649,55);
		AdjustResolution.robo.delay(1500);
		AdjustResolution.robo.mousePress(InputEvent.BUTTON1_MASK);
		AdjustResolution.robo.delay(500);
		AdjustResolution.robo.mouseRelease(InputEvent.BUTTON1_MASK);
		
		Action_Keys.AcceptAlret();
		
		AdjustResolution.robo.delay(1500);
		AdjustResolution.mouseHoverUsingRobo(938,55);
		AdjustResolution.robo.mousePress(InputEvent.BUTTON1_MASK);
	
		AdjustResolution.robo.mouseRelease(InputEvent.BUTTON1_MASK);
		
		Action_Keys.handle();
		FindElement.searchClickableElement(d, "//span[@id='Header_lblUserName']").click();
		
		FindElement.searchClickableElement(d, "//a[@id='Header_HyperLink1']/span").click();
		
		
		Action_Keys.AcceptAlret();
		
		
		*/
		
		
		
		
		
		
		
		
		/*DriverScript.loadExcel("E://uspayment//login.xls","Sheet3","TC_01");
		
		
		
		
		robo.mouseMove(150,48);
		
		robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		robo.delay(1500);
robo.mouseMove(630,70);
		
		robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		robo.delay(2500);
		robo.mouseMove(165,72);
		
		robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robo.delay(2500);
robo.mouseMove(630,70);
		
		robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

		
		robo.delay(1500);
robo.mouseMove(1021,736);
		
robo.delay(3500);
		robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		
		robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*DriverScript.loadExcel("E://uspayment//login.xls","Sheet2","TC_01");
		
		try {
			Robot robot = new Robot();
			
			robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
			
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
	
}
