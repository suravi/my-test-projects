package GetRequest;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetData {

	public static void main(String[] args) {
		Response resp=RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b1b15e88fa797225412429c1c50c122a1");
		int code= resp.getStatusCode();
		System.out.println("status code is "+code);
		
		String data=resp.asString();
		System.out.println("body "+data);
		System.out.println("responsetime "+resp.getTime());
	}

}
