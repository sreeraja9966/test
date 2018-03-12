package robotFrameWork;

import org.testng.annotations.Test;

import framework.DriverScript;

public class Testing extends AdjustResolution {
	@Test
public static void rrr() {
	
	AdjustResolution obj=new AdjustResolution();
	Robot_Keys obj1=new Robot_Keys();
	//DriverScript.loadExcel("E://uspayment//login.xls","Sheet5","TC_01");
	
	obj.mouseHoverUsingRobo(400,1002);
	
	
	
	
	obj1.roboMouseOperation("left");
	obj.mouseHoverUsingRobo(456,356);
obj1.roboMouseOperation("left");
	obj1.roboSendKeys("TestSA");
	obj1.roboMouseOperation("left");
//obj1.roboMouseScroll(-500);
	}
}
