package fdPages;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import framework.DriverScript;
import testBase.TestBase;

public class FdAccountCreation extends TestBase {
	
	
	/*@Test(priority=1)
public void login(){
	
		DriverScript.loadExcel("E://wings//wingslogin.xls","Sheet1","TC_01");


}*/

@Test
public void loanaccount(){

	DriverScript.loadExcel("E://wings//FDaccountcreation.xls","Login Test","BeforePassing");


}
@AfterMethod
public void handle(ITestResult result){
	if(result.getStatus()==ITestResult.FAILURE){
		d.switchTo().defaultContent();
		
	}
}

}
