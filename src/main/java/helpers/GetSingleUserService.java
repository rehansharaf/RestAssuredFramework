package helpers;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import com.fasterxml.jackson.core.JsonProcessingException;

import constants.Endpoints;
import io.restassured.response.Response;
import models.getsingleuser.GetSingleUser;
import utils.ConfigReader;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

public class GetSingleUserService {

	public GetSingleUserService() {
		
		baseURI = (String)ConfigReader.getProperty("baseUrl");
		basePath = (String)ConfigReader.getProperty("basePath");
		
	}
	
	public GetSingleUser getSingleUser() throws JsonProcessingException {

		GetSingleUser singleUser = new GetSingleUser();
		//singleUser  = given().contentType("application/json").pathParam("id", 2).when().get(Endpoints.SINGLE_USER).as(GetSingleUser.class);
		Response response  = given().contentType("application/json").pathParam("id", 2).when().get(Endpoints.SINGLE_USER).andReturn();
		
		assertThat(response.getStatusCode(), is(200));
		assertThat(response.body().jsonPath().getInt("data.id"), is(notNullValue()));
		singleUser = response.as(GetSingleUser.class);
		return singleUser;
	}
	
}
