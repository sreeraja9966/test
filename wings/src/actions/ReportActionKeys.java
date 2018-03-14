package actions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import testBase.TestBase;

public class ReportActionKeys extends TestBase {
	public static  ExtentReports report;
	public static ExtentTest logger;
	public static ExtentTest child;
	 

	public static void setReportLocation(String reportPath){
		System.out.println("----------->    method called");
		report=new ExtentReports(reportPath);
	report.loadConfig(new File("C:\\Users\\sgarlapati\\git\\wings\\config.xml"));
	
	}
public static void startTest(String testName){
	logger=report.startTest(testName);
	
	
}
public static void ChildTest(String testName){
	child=report.startTest(testName);

}

public static void writeLogToReport(){
	report.flush();
}
public static void appendToExstingReport(String path){
	report=new ExtentReports(path, false);
	report.loadConfig(new File(relativePath()+"\\config.xml"));
}
public static void writeLogInfo(String stepDetails){
	logger.log(LogStatus.INFO,stepDetails);
}
public static void writeLogInCaseOfPass(String stepDetails){
	logger.log(LogStatus.PASS,stepDetails);
}
public static void writeLogInCaseOfFail(String stepDetails){
	logger.log(LogStatus.FAIL,stepDetails);
}
public static void writeLogInCaseOfSkip(String stepDetails){
	logger.log(LogStatus.SKIP,stepDetails);
}

public static void endTest(){
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
		 
		 
		 
	 destination =relativePath()+"\\screenshots/"+name+".png";
	 File finalDestination = new File(destination);
	 FileUtils.copyFile(scr, finalDestination);
	 } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	
	
	logger.log(LogStatus.FAIL,"ScreentShot ::"+name+" "+logger.addScreenCapture(destination ));
}
}
