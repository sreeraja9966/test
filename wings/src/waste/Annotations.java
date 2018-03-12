package waste;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeSuite
	public void test9(){
		System.out.println("BeforeSuite");
	}
	@AfterSuite
	public void test10(){
		System.out.println("AfterSuite");
	}
	@BeforeClass
	public void test7(){
		System.out.println("Before Class");
	}
	@Test(priority=1)
	public void test1(){
		System.out.println("test1");
	}
	
	@BeforeMethod
	public void test2(){
		System.out.println("BeforeMethod");
	}
	
	@AfterMethod
	public void test3(){
		System.out.println("AfterMethod");
	}
@AfterTest
public void test4(){
	System.out.println("AfterTest");
}

@Test(priority=2)
public void test5(){
	System.out.println("Test2");
}
@BeforeTest
public void test6(){
	System.out.println("Before TEst");
}

@org.testng.annotations.AfterClass
public void test8(){
	System.out.println("After class");
}
}
