package usPayments;
import java.awt.Dimension;
import java.awt.Toolkit;

import org.testng.annotations.Test;
public class Resolution {
@Test
	public static void resolution() {
		
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		System.out.println(screenSize);
		System.out.println(width);
		System.out.println(height);
		
		convert(725, 800, 1280,600,1024,425);
	}
	
	
	public static void convert(double old_x,double new_screen_width,double old_screen_width,double new_screen_height,double old_screen_height,double old_y){
		
		double new_x;
		double new_y;
		new_x = old_x * new_screen_width / old_screen_width;
		
		new_y = old_y * new_screen_height / old_screen_height;
		
		double y=((old_screen_height-new_screen_height)/2);
		
		double yy=y-(y/10);
		double yyy=new_y+yy;
		
		System.out.println(new_y+" "+y+"  "+yy+" "+yyy);
	}
	
}
