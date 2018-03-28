package waste;

import java.io.File;

public class FileExists {
	 public static void main(String args[]) {
		    
		  File f = new File("C:\\Users\\sgarlapati\\Desktop\\NewText Document.txt");

		  if(f.exists()){
			  System.out.println("File existed");
		  }else{
			  System.out.println("File not found!");
		  }
	      
		  
		  
		  
	  }
	  
}
