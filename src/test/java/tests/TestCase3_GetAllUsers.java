package tests;

import org.testng.annotations.Test;
import com.fasterxml.jackson.core.JsonProcessingException;
import helpers.GetAllUsersService;
import models.person.AllUsers;


public class TestCase3_GetAllUsers {
	
	
	@Test
	public void testUntitled() throws JsonProcessingException {
		
//		baseURI = (String)ConfigReader.prop.get("baseUrl");
//		basePath = (String)ConfigReader.prop.get("basePath");
		
//		AllUsers alluser = new AllUsers();
//		alluser  = given().contentType("application/json").pathParam("id", 3).when().get(Endpoints.ALL_USERS).as(AllUsers.class);
//		System.out.println(alluser.toString());

		GetAllUsersService getAllUser = new GetAllUsersService();
		AllUsers jsonResponse = getAllUser.getAllUser();
		System.out.println(jsonResponse);
	}

}
