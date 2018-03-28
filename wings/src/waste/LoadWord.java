package waste;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import robotFrameWork.Robot_Keys;

public class LoadWord {
	
		public static void main(String[] args) throws Exception {
			BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\sgarlapati\\Desktop\\New Text Document.txt"));
			String line;
			while((line = in.readLine()) != null)
			{
			    System.out.println(line);
			}
			in.close();
			Robot robo =new Robot();
			
		
			System.out.println("MouseHover");
			/*robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);*/
			robo.keyPress(KeyEvent.VK_WINDOWS);
			robo.keyPress(KeyEvent.VK_R);
			robo.keyRelease(KeyEvent.VK_WINDOWS);
			robo.keyRelease(KeyEvent.VK_R);
			try {
				Robot_Keys.roboSendKeys("cmd");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			robo.keyPress(KeyEvent.VK_ENTER);
			robo.keyRelease(KeyEvent.VK_ENTER);

}
}