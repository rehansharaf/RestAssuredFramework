package helpers;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestSpecificationHelper {

	
	public RequestSpecification requestSpecification() {
		
		RequestSpecBuilder req = new RequestSpecBuilder();
		req.setBaseUri("https://reqres.in/api/");
		req.setBasePath("users");
		
		RequestSpecification reqSec = req.build();
		return reqSec;
	}
}
