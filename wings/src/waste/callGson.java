package waste;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class callGson {
	public static <T>T parseGsonResponse(String serverResponse, Class<T> target){
	    T data = null;
	   // Gson gson = new Gson();
	    Gson gson = new GsonBuilder().create();
	    try {
	        data = gson.fromJson(serverResponse, target);
	    }
	    catch (Exception e) {
	       
	    }
	   // Log.v(TAG,"data trans " + data);
	    return data;
	}
	
	public static <T>T[] parseArrayGsonResponse(String serverResponse, Type target){
	    T[] data = null;
	   // Gson gson = new Gson();
	    Gson gson = new GsonBuilder().create();
	    try {
	    	
	    //	ImplementJson[] imp = gson.fromJson(resp, ImplementJson[].class);  
	    	
	    	
	        data = gson.fromJson(serverResponse, target);
	    }
	    catch (Exception e) {
	       
	    }
	   // Log.v(TAG,"data trans " + data);
	    return data;
	}

}
