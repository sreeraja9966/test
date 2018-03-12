/*package apiUrlLoading;

import org.testng.Assert;

import excel.ExcelUtils;
import waste.Db;
import waste.ImplementJson;
import waste.callGson;

public class SplInstrctionsApi {

	public static void getResponse(String resp) {
		ImplementJson[] imp = callGson.parseArrayGsonResponse(resp, ImplementJson[].class);
		
		
		
		
		
//		ImplementJson	imp = gson.fromJson(resp, ImplementJson.class);
		
		System.out.println(imp);
		//ImplementJson[] implementJson = imp.getImplementJson();
		System.out.println(imp.length);
		for(int i=0;i<imp.length;i++)
		{imp[i].getAccountNumber();
		Assert.assertEquals(imp[i].getAccountNumber(), Db.getDb(ExcelUtils.getCellData(RowNum, ColNum), 1));
		imp[i].getEnteredby();
		imp[i].getInstituteId();
			System.out.println(imp[i].getStatus().getKey());
			System.out.println(imp[i].getStatus().getValue());
		}
	}
	
	
}
*/