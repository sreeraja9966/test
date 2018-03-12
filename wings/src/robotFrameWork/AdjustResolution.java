package robotFrameWork;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;

import excel.ExcelUtils;
import framework.DriverScript;
import testBase.TestBase;

public class AdjustResolution extends TestBase {

public static Robot robo;
	static int width;
	static int height;
	
	
	
public static void getSystemResolution() {
		
		try {
			robo=new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		 width = (int) screenSize.getWidth();
		 
		 height = (int) screenSize.getHeight();
		System.out.println(screenSize);
		System.out.println(width);
		System.out.println(height);
		
		
	}



public static void moveUrMouse(int x,int y){
	
	robo.mouseMove(x, y);
	
	
}


public static void moveUrMouseInDifferentResolution(int old_x,int new_screen_width,int old_screen_width,int new_screen_height,int old_screen_height,int old_y){
	
	
	int x;
	int y;
	System.out.println(old_x%old_screen_width);
	int x_percentage=(old_x*100/old_screen_width);
	
	int y_percentage=(old_y*100/old_screen_height);
	
	System.out.println("x_percentage  "+x_percentage+"    y_percentage  "+y_percentage);
	
	if(x_percentage < 50 && y_percentage < 50){
		x=old_x;
		y=old_y;
		System.out.println("x<50 && y<50"+x+"  "+y);
		robo.delay(3000);
		robo.mouseMove(x, y);
	}
	else if(x_percentage == 50 || y_percentage == 50){
		x=old_x;
		y=old_y;
		System.out.println("x=50 || y=50"+x+"  "+y);
		robo.delay(3000);
		robo.mouseMove(x, y);
	}
	
	else if(x_percentage == 50 && y_percentage < 50){
		x=old_x;
		y=old_y;
		System.out.println("x=50 && y<50"+x+"  "+y);
		robo.delay(3000);
		robo.mouseMove(x, y);
	}
	
	else if(x_percentage == 50 && y_percentage > 50){
		x=old_x;
		y=old_y * new_screen_height / old_screen_height;
		System.out.println("x=50 && y>50"+x+"  "+y);
		robo.delay(3000);
		robo.mouseMove(x, y);
	}
	
	else if(x_percentage > 50 && y_percentage < 50){
		x=old_x;
		y=old_y;
		System.out.println("x>50 && y<50"+x+"  "+y);
		robo.delay(3000);
		robo.mouseMove(x, y);
	}
	
	else if(x_percentage < 50 && y_percentage > 50){
		x=old_x;
		y=old_y * new_screen_height / old_screen_height;
		
		System.out.println("x<50 && y>50"+x+"  "+y);
		robo.delay(3000);
		robo.mouseMove(x, y);
	}
	
	else if(x_percentage > 50 && y_percentage > 50){
		x=x = old_x * new_screen_width / old_screen_width;
		y=old_y * new_screen_height / old_screen_height;
		
		System.out.println("x>50 && y>50"+x+"  "+y);
		robo.delay(3000);
		robo.mouseMove(x, y);
	}
	
	else{System.out.println("check coordinates");}
	/*x = old_x * new_screen_width / old_screen_width;
	
	y = old_y * new_screen_height / old_screen_height;
	
	int change=((old_screen_height-new_screen_height)/2);
	
	int dif=change-(change/10);
	
	int new_y=y+dif;
	System.out.println(x);
	System.out.println(new_y);
	robo.delay(50000);
	robo.mouseMove(x, new_y);
	*/
	
	
	
	
}





	public static void mouseHoverUsingRobo(int x,int y){
		AdjustResolution obj=new AdjustResolution();
		
		obj.getSystemResolution();
		
		
           
           
            int systemWidthInInt = 1280;
            
           
            
           
            
            int systemHeightInInt = 1024;
		
		if(systemWidthInInt==width && systemHeightInInt==height){
			robo.delay(5000);
			System.out.println("if condition");
			obj.moveUrMouse(x, y);
			
			
		}
		
		else{
			System.out.println("else condition");
			obj.moveUrMouseInDifferentResolution(x, width,1280,  height, 1024, y);
		}
		
	}
	
}
