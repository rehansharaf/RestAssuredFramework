package helpers;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import com.fasterxml.jackson.core.JsonProcessingException;
import constants.Endpoints;
import models.person.AllUsers;
import utils.ConfigReader;

public class GetAllUsersService {


	public GetAllUsersService() {

		baseURI = (String) ConfigReader.getProperty("baseUrl");
		basePath = (String) ConfigReader.getProperty("basePath");

	}

	public AllUsers getAllUser() throws JsonProcessingException {

		AllUsers alluser = new AllUsers();
		alluser  = given().contentType("application/json").pathParam("id", 2).when().get(Endpoints.ALL_USERS).as(AllUsers.class);
		return alluser;
		
	}

}
