package framework;

import java.sql.SQLException;

import actions.Action_Keys;
import actions.ReportActionKeys;
import common.CustomerSearch;
import common.VerifyTitle;
import robotFrameWork.Robot_Keys;
import testBase.TestBase;

public class LoadActionKeys {
	public static Action_Keys obj = new Action_Keys();
	

	public static void actionkeys(String actionKeyword,String testObject,String testData,int testDataAsInt1,int testDataAsInt2){	
		switch(actionKeyword){
		case "openBrowser":
			TestBase.strartBrowser(testData);
			break;
		
			
		case "goToURL":
			obj.goToURL(testData);
			break;
		case "input":
			obj.input(testObject, testData);
			break;
		case "clickBtn":
			obj.clickBtn(testObject);
			break;
		
		case "closeBrowser":
			obj.closeBrowser();
			break;
		case "windowhandle" :
		obj.handle();
		break;
		case "swithtoFrame":
			obj.swithtoFrame(testData);
			break;
			
		case "swithtoFramebyindex":
			obj.swithtoFrameByIndex();
			break;
			
		case "sitchToFrameByElement":
			obj.sitchToFrameByElement(testObject);
			break;
			
			
		case "backTomainwin":
			obj.backTomainwin();
			break;
		case "dropdown":
			obj.ddown(testObject, testData.trim());
			break;	
			
		case "dropdownbyvalue":
			obj.ddownbyvalue(testObject, testData.trim());
			break;
			
			
		case "dropdownbyindex":
			obj.ddownbyindex(testObject);
			break;
			
		case "clickLink":
			obj.clickLnk(testObject);
			break;
		case "cleartextbox":
			obj.cleartextbox(testObject);
			break;	
			
		case "explictwaiting":
			obj.explictwaiting(10, testObject);
			break;
		
		case "sleeping":
			obj.sleep();
			break;
		case "rightClick":
			Action_Keys.rightClick(testObject);
			break;
			
		case "downArrow":
			Action_Keys.downArrow(testObject);
			break;
			
		case "windowmaximise":
			obj.windowMaximize();
			break;
			
		case "customersearch":
			Action_Keys.customerIdSearch(testObject,testData);
			break;
			
		case "acceptalret":
			Action_Keys.AcceptAlret();
			break;
			
		case "getTextOfAlert":
			Action_Keys.gettextofAlert();
			break;
			
		case "swithToDefaultContent":
			Action_Keys.swithToDefaultContent();
			break;
			
		case "saveText":
			Action_Keys.saveText(testObject,testData);
			break;
			
		case "closeChildWindow":
			Action_Keys.closeChildWindow(testData);
			break;
			
		/*case "getVoucherNumber":
			Action_Keys.getVoucherNumber(testObject,testData);
			break;*/
		case "takeScreenShot":
			Action_Keys.takeScreenShot(testData);
			break;	
			
		case "imageSearch":
			Action_Keys.imageSearch(testObject, testData);
			break;
		case "goldImageSearch":
			Action_Keys.goldImageSearch(testObject, testData);
			break;
		case "scrollDown":
			Action_Keys.scrollDown();
			break;
		case "calender":
			Action_Keys.calender(testObject, testData);
			break;
		case "inputUsingDb":
					
				Action_Keys.inputUsingDb(testObject, testData);
			
			break;
			
		case "verifyTextWithDB":
			
			Action_Keys.verifyTextWithDB(testObject, testData);
		
		break;
					
		case "DatePicker":
			Action_Keys.DatePicker();
			break;
		case "setReportLocation":
			ReportActionKeys.setReportLocation(testData);
			break;

		case "startTestInReport":
			ReportActionKeys.startTest(testData);
			break;
		
		case "writeLogToReport":
			ReportActionKeys.writeLogToReport();
			break;
		
		
		case "appendToExstingReport":
			ReportActionKeys.appendToExstingReport(testData);
			break;
			
		case "writeLogInfo":
			ReportActionKeys.writeLogInfo(testData);
			break;
		case "writeLogInCaseOfPass":
			ReportActionKeys.writeLogInCaseOfPass(testData);
			break;
		
		case "writeLogInCaseOfFail":
			ReportActionKeys.writeLogInCaseOfFail(testData);
			break;
		
		
		case "endTest":
			ReportActionKeys.endTest();
			break;
			
		case "addScreenShotInReport":
			ReportActionKeys.addScreenShotInReport(testData);
			break;
		case "VerifyTitle":
			VerifyTitle.verify(testData);
			break;
			
		case "clickElementUsingLoop":
			Action_Keys.clickElementUsingLoop(testData);
			break;
			
		case "goldOrnamentLink":
			Action_Keys.goldOrnamentLink(testObject, testData);
			break;
			
		case "verifyLinkActive":
			Action_Keys.verifyLinkActive(testData);
			break;
		case "openNewTab":
			Action_Keys.openNewTab(testObject);
			break;
		/*case "sikuliClick":
			Action_Keys.sikuliClick(testData);
			break;
			
		case "sikuliEnterText":
			Action_Keys.sikuliEnterText(testData);
			break;
			*/
		case "robotScreenShot":
			Action_Keys.robotScreenShot(testData);
			break;
			
		case "robomouseHover":
			Robot_Keys.robomouseHover(testDataAsInt1, testDataAsInt2);
			break;
			
		case "roboMouseOperation":
			Robot_Keys.roboMouseOperation(testData);
			break;
		case "roboSendKeys":
			Robot_Keys.roboSendKeys(testData);
			break;
			
		case "roboMouseScroll":
			Robot_Keys.roboMouseScroll(testDataAsInt1);
			break;
			
		case "roboDelay":
			Robot_Keys.roboDelay(testDataAsInt1);
			break;
			
		case "roboDropDown":
			Robot_Keys.roboDropDown(testDataAsInt1, testDataAsInt2, testData);
			break;
			
	
			
		default:
			System.out.println("Not found");
	}
}
}