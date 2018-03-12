package apiDataProvider;

import org.testng.annotations.DataProvider;

import waste.DataDrivenFor;

public class DataProviderWithCondtion {
	
	@DataProvider(name="accountinfo")
	public Object[][] postData(int i){
		
		if(i==0){
		return DataDrivenFor.data("C://Users//sgarlapati//Desktop//testingPostman.xls","Sheet"+i);
	}
		
	
	
		return null;}

}
