package actions;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import testBase.TestBase;
import waste.DatePicker;

public class ReportActionKeys extends TestBase {
	public static  ExtentReports report;
	public static ExtentTest logger;
	public static ExtentTest child;
	public 	String nameOfTheReport=null;

	public  void setReportLocation(String nameOfTheReport){
		this.nameOfTheReport=nameOfTheReport;
		System.out.println("----------->    method called");
		report=new ExtentReports("C:\\Reports/"+nameOfTheReport+".html");
	report.loadConfig(new File(relativePath()+"\\config.xml"));
	
	}
public  void startTest(String testName){
	
	logger=report.startTest(testName);
	
	
}
public static void ChildTest(String testName){
	child=report.startTest(testName);

}




public static void writeLogToReport(){
	report.flush();
}
public  void appendToExstingReport(String path){
	report=new ExtentReports("C:\\Reports/"+nameOfTheReport+".html", false);
	logger=report.startTest(path);
	
	//report=new ExtentReports("C:\\Reports/"+path+".html");
	report.loadConfig(new File(relativePath()+"\\config.xml"));
	
}
public static void writeLogInfo(String stepDetails){
	logger.log(LogStatus.INFO,stepDetails);
}
public static void writeLogInfoInChildTest(String stepDetails){
	try{
	child.log(LogStatus.INFO,stepDetails);}
	catch(Exception e){
		e.printStackTrace();
	}
}
public static void writeLogInCaseOfPass(String stepDetails){
	logger.log(LogStatus.PASS,stepDetails);
}
public static void writeLogInCaseOfPassInChildTest(String stepDetails){
	child.log(LogStatus.PASS,stepDetails);
}
public static void writeLogInCaseOfFail(String stepDetails){
	logger.log(LogStatus.FAIL,stepDetails);
}
public static void writeLogInCaseOfFailInChildTest(String stepDetails){
	child.log(LogStatus.FAIL,stepDetails);
}
public static void writeLogInCaseOfSkip(String stepDetails){
	logger.log(LogStatus.SKIP,stepDetails);
}
public static void writeLogInCaseOfSkipInChildTest(String stepDetails){
	child.log(LogStatus.SKIP,stepDetails);
}

public static void endChild(){
	report.endTest(child);
	
	
	
	
}
public static void appendChild(){
	
	
	logger.appendChild(child);
	
	
}
public static void endParent(){
	
	
	report.endTest(logger);
	
}
public static void getcurrentRunStatus(){
	logger.getRunStatus();
}
public static void addScreenShotInReport(String name){
	String destination =null;
	
    //The below method will save the screen shot in d drive with name "screenshot.png"
	System.out.println("--------->addingScreenShotInReport");
	
	
	 try {
	 File scr = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
       
	System.out.println(scr);
		 
		 //FileUtils.copyFile(scr, new File(relativePath()+"/screenshots/"+ name+".png"));
		 
		 
	String date=Action_Keys.getDate();
	
	 destination ="screenShots/"+date+name+".png";
	 File finalDestination = new File("\\Reports\\screenShots/"+date+name+".png");
	 FileUtils.copyFile(scr, finalDestination);
	 } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	
	
	logger.log(LogStatus.INFO,"ScreentShot ::"+name+" "+logger.addScreenCapture(destination ));
}


public static void addScreenShotInReportInCaseOfChild(String name){
	String destination =null;
	
    //The below method will save the screen shot in d drive with name "screenshot.png"
	System.out.println("--------->addingScreenShotInReport");
	
	
	 try {
	 File scr = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
       
	System.out.println(scr);
		 
		 //FileUtils.copyFile(scr, new File(relativePath()+"/screenshots/"+ name+".png"));
		 
		 
	String date=Action_Keys.getDate();
	
	 destination ="screenShots/"+date+name+".png";
	 File finalDestination = new File("\\Reports\\screenShots/"+date+name+".png");
	 FileUtils.copyFile(scr, finalDestination);
	 } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	
	
	child.log(LogStatus.INFO,"ScreentShot ::"+name+" "+child.addScreenCapture(destination ));
}

public static void addScreenShotInCaseOfFailInReport(String name){
	String destination =null;
	
    //The below method will save the screen shot in d drive with name "screenshot.png"
	System.out.println("--------->addingScreenShotInReport");
	
	
	 try {
	 File scr = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
       
	System.out.println(scr);
		 
		 //FileUtils.copyFile(scr, new File(relativePath()+"/screenshots/"+ name+".png"));
		 
	String date=Action_Keys.getDate();
	
	 destination ="screenShots/"+date+name+".png";
	 File finalDestination = new File("\\Reports\\screenShots/"+date+name+".png");
	 FileUtils.copyFile(scr, finalDestination);
	 } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	
	
	logger.log(LogStatus.FAIL,"ScreentShot ::"+name+" "+logger.addScreenCapture(destination ));
}
public static void addScreenShotInCaseOfFailInReportInChild(String name){
	String destination =null;
	
    //The below method will save the screen shot in d drive with name "screenshot.png"
	System.out.println("--------->addingScreenShotInReport");
	
	
	 try {
	 File scr = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
       
	System.out.println(scr);
		 
		 //FileUtils.copyFile(scr, new File(relativePath()+"/screenshots/"+ name+".png"));
		 
	String date=Action_Keys.getDate();
	
	 destination ="screenShots/"+date+name+".png";
	 File finalDestination = new File("\\Reports\\screenShots/"+date+name+".png");
	 FileUtils.copyFile(scr, finalDestination);
	 } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	
	
	child.log(LogStatus.FAIL,"ScreentShot ::"+name+" "+child.addScreenCapture(destination ));
}
}
