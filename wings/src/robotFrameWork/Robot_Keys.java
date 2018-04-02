package robotFrameWork;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import testBase.TestBase;

public class Robot_Keys extends AdjustResolution{

	
	public static void robomouseHover(int x,int y){
		AdjustResolution.mouseHoverUsingRobo(x, y);
	}
	
	public static void roboMouseOperation(String mouseOperation){
		
		if(mouseOperation.equalsIgnoreCase("leftClick")){
			AdjustResolution.robo.delay(1500);
			AdjustResolution.robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			AdjustResolution.robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			
		}
		else if(mouseOperation.equalsIgnoreCase("rightClick")){
	AdjustResolution.robo.delay(1500);
	AdjustResolution.robo.mousePress(InputEvent.BUTTON3_DOWN_MASK);
	AdjustResolution.robo.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
			
		}

	}
	
	public static void roboSendKeys(String input){
		
		for (char c : input.toCharArray()) {
	        int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
	        if (KeyEvent.CHAR_UNDEFINED == keyCode) {
	            throw new RuntimeException(
	                "Key code not found for character '" + c + "'");
	        }
	        robo.keyPress(keyCode);
	        robo.delay(100);
	        robo.keyRelease(keyCode);
	        robo.delay(100);
	    		
	}
	}
	
	public static void roboMouseScroll(int height){
		
		robo.delay(500);
		robo.mouseWheel(height);
		
	
		
	}
	
	
	public static void roboDelay(int time){
		robo.delay(time);
	}
	
	public static void roboDropDown(int x,int y,String value){
		
		mouseHoverUsingRobo(x,y);
		robo.delay(500);
		roboMouseOperation("left");
		roboSendKeys(value);
		roboMouseOperation("left");
	}
	
	public static void AcceptSilverScreenAlert(){
		try {
			robo.keyPress(KeyEvent.VK_ENTER);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
