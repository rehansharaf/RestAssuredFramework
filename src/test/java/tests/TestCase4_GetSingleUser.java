package tests;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

import helpers.GetSingleUserService;
import models.getsingleuser.GetSingleUser;

public class TestCase4_GetSingleUser {
	
	@Test
	public void testUntitled() throws JsonProcessingException {
		
		GetSingleUserService singleUser = new GetSingleUserService();
		GetSingleUser jsonResponse = singleUser.getSingleUser();
		System.out.println(jsonResponse.toString());
	}

}
