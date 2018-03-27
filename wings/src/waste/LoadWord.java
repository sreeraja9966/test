package waste;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LoadWord {
	
		public static void main(String[] args) throws Exception {
			BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\sgarlapati\\Desktop\\New Text Document.txt"));
			String line;
			while((line = in.readLine()) != null)
			{
			    System.out.println(line);
			}
			in.close();

}
}