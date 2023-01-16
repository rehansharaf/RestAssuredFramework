package tests;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import models.person.AllUsers;
import models.person.Datum;
import models.person.Support;

public class TestCase1_ListAllUserSerialization {
	
	public ObjectMapper MAPPER = new ObjectMapper();
	
	@Test
	public void testUntitled() throws JsonProcessingException {
		
		
		//System.out.println("Hello World");
		
		Support su = new Support();
		su.setText("This is first text");
		su.setUrl("https//www.google.com/");
		
		List<Datum> daList = new ArrayList<>();

		
		Datum da = new Datum();
		da.setId(1);
		da.setFirstName("Rehan");
		da.setLastName("Khan");
		da.setEmail("rehan@mail.com");
		da.setAvatar("This is my avatar");
		
		
		Datum da1 = new Datum();
		da1.setId(2);
		da1.setFirstName("Adnan");
		da1.setLastName("Khan");
		da1.setEmail("adnan@mail.com");
		da1.setAvatar("This is my avatar for adnan");
		
		daList.add(da);
		daList.add(da1);
		
	
		AllUsers allUser = new AllUsers();
		allUser.setPage(2);
		allUser.setPerPage(20);
		allUser.setTotal(12);
		allUser.setTotalPages(5);
		allUser.setData(daList);
		allUser.setSupport(su);
		
		
		String jsonObject = MAPPER.writerWithDefaultPrettyPrinter().writeValueAsString(allUser);
		System.out.println(jsonObject);
		
	}

}
