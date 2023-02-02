package tests;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

import java.io.File;

import org.testng.annotations.Test;

import helpers.GetSingleUserService;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class TestCase5_SchemaValidaton_SingleUser {
	
	
	@Test
	public void schemaValidation() {
		
		GetSingleUserService suc = new GetSingleUserService();
		ValidatableResponse response = suc.getSingleUserSchemaValidation();
		response.body(matchesJsonSchema(new File(System.getProperty("user.dir")+"//Resources//jsonSchema//singleuser.json")));


	}

}
