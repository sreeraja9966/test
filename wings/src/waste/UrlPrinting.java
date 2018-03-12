package waste;

import java.util.ArrayList;

import org.testng.annotations.Test;

import apiUrlLoading.LoadUrl;

public class UrlPrinting {
@Test
public static ArrayList<String>  testurl(){
	ArrayList<String> ur=LoadUrl.loading("C://Users//sgarlapati//Desktop//testingPostman.xls","Sheet3");
	return ur;
}
}
