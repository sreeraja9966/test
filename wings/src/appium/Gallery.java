package appium;

import org.testng.annotations.Test;

public class Gallery {

	
	@Test
	
	public void workWithGallery(){
		
		FlatFormSetup.setFlatfor("com.android.gallery3d", "com.android.gallery3d.app.Gallery");
		
	}
	
}
