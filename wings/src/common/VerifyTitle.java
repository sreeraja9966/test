package common;

import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import actions.Action_Keys;
import actions.ReportActionKeys;
import testBase.TestBase;
import waste.verifyTitle;

public class VerifyTitle extends TestBase{
	
	public static void verify(String title){
	
		try{
			
			Assert.assertEquals(d.getTitle(), title);
			}
			catch(Error e){
				ReportActionKeys.writeLogInCaseOfFail("Expected String is "+title+"  but the String present on the screen is "+d.getTitle());
				ReportActionKeys.addScreenShotInReport(title+"  Expected String is Not Matched");
			}
			/*if(d.getTitle().equals(title.trim())){
				
			ReportActionKeys.writeLogInCaseOfPass("Titile verified ");
		
	}
			else{
				ReportActionKeys.writeLogInCaseOfFail("Titile not matched ");
			ReportActionKeys.addScreenShotInReport(verifyTitle.class.getName());
			ReportActionKeys.writeLogInfo("Actual Title is   "+d.getTitle()+"  but actual title is  "+title);
			}*/

}}
