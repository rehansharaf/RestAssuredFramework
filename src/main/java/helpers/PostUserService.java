package helpers;

import static io.restassured.RestAssured.given;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import constants.Endpoints;
import io.restassured.response.Response;
import models.PostUser;
import utils.ConfigReader;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;

public class PostUserService {
	
	private ObjectMapper MAPPER = new ObjectMapper();

	
	public PostUserService() {
	
		baseURI = (String)ConfigReader.getProperty("baseUrl");
		basePath = (String)ConfigReader.getProperty("basePath");
		
	}
	
	
	public Response postUserCall() throws JsonProcessingException {
		
		PostUser pu = new PostUser();
		pu.setName("Rehan");
		pu.setJob("Automation Engineer");
		
		//Serialization Pojo to Json Stream
		String jsonObject = MAPPER.writerWithDefaultPrettyPrinter().writeValueAsString(pu);
//		return jsonObject;
		
		Response response = given().body(jsonObject).when().post(Endpoints.POST_USER).andReturn();
		return response;
		
	}
	
	

}
