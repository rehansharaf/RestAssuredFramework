package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	public static Properties prop;
	
	static {
		
		loadAllProperties();

	}
	
	public static void loadAllProperties() {
		
		prop = new Properties();
		String filePath = System.getProperty("user.dir")+"\\Resources\\config.properties";
		try {
			prop.load(new FileInputStream(new File(filePath)));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	
	public static Object getProperty(String key) {
		
		return prop.get(key);
	}
	
}
