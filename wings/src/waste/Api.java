package waste;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;



public class Api {
	public class ReadJsonObject{
		
		
		@Test
		public void aptTesting() throws Exception {
		try {
		//URL url = new URL("http://maps.googleapis.com/maps/api/geocode/json?address=hyderabad&sensor=false&#8221;");
			URL url = new URL("http://203.212.238.164:8091/vsoft-iris-interface-digital/iris/v1/iris/accounts;");
			Logger log =Logger.getLogger(Api.class);
			log.info("");
			
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Accept", "application/json");

		if (conn.getResponseCode() != 200) {
		throw new RuntimeException(" HTTP error code : "+ conn.getResponseCode());
		}
		JSONObject jsonObject = new JSONObject();
		jsonObject.accumulate("customerId", "");
		jsonObject.accumulate("accountNumber", "");
		System.out.println("Request Obj : "+jsonObject);

		HttpClient httpClient = HttpClientBuilder.create().build(); //Use this instead

		try {
		HttpPost request = new HttpPost("http://203.212.238.164:8091/vsoft-iris-interface-digital/iris/v1/iris/accounts");
		StringEntity params =new StringEntity("details={\"name\":\"myname\",\"age\":\"20\"} ");
		request.addHeader("content-type", "application/x-www-form-urlencoded");
		request.setEntity(params);
		HttpResponse response = httpClient.execute(request);

		System.out.println(" POST Response : "+response.toString());
		// handle response here…
		}catch (Exception ex) {
		// handle exception here
		}
		
		Scanner scan = new Scanner(url.openStream());
		String entireResponse = new String();
		while (scan.hasNext())
		entireResponse += scan.nextLine();

		System.out.println("Response : "+entireResponse);
		
		

		scan.close();

		JSONObject obj = new JSONObject(entireResponse);
		//obj.accumulate("response", entireResponse);
		String responseCode = obj.getString("status");
		System.out.println("status : " + responseCode);

		JSONArray arr = obj.getJSONArray("results");
		for (int i = 0; i < arr.length(); i++) {
		String placeid = arr.getJSONObject(i).getString("place_id");
		System.out.println("Place id : " + placeid);
		String formatAddress = arr.getJSONObject(i).getString(
		"formatted_address");
		System.out.println("Address : " + formatAddress);

		//validating Address as per the requirement
		if(formatAddress.equalsIgnoreCase("Chicago, IL, USA"))
		{
		System.out.println("Address is as Expected");
		}
		else
		{
		System.out.println("Address is not as Expected");
		}
		}

		conn.disconnect();
		} catch (MalformedURLException e) {
		e.printStackTrace();

		} catch (IOException e) {

		e.printStackTrace();

		}

		}
		}

}
