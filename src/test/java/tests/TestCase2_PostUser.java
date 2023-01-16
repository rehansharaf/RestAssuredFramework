package tests;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import helpers.PostUserService;
import io.restassured.response.Response;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class TestCase2_PostUser {
	
	
	
	@Test
	public void testUntitled() throws JsonProcessingException {
				
		
//		PostUser pu = new PostUser();
//		pu.setName("Rehan");
//		pu.setJob("Automation Engineer");
//		
//		
//		String jsonObject = MAPPER.writerWithDefaultPrettyPrinter().writeValueAsString(pu);
//		System.out.println(jsonObject);
//		
//		baseURI = (String)ConfigReader.prop.get("baseUrl");
//		basePath = (String)ConfigReader.prop.get("basePath");
//
//		
//		Response response = given().body(jsonObject).when().post(Endpoints.POST_USER).andReturn();
		
		PostUserService postUser = new PostUserService();
		Response response = postUser.postUserCall();
		response.prettyPrint();
		
		assertThat(response.getStatusCode(), is(201));
		assertThat(response.getBody().jsonPath().getInt("id"), notNullValue());
		
	}

}
