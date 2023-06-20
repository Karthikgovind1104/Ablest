package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	public static Properties getPropertyObject() throws IOException {
		
		FileInputStream fp = new FileInputStream("C:\\Users\\yuvar\\eclipse-workspace\\Project\\Config.properties");
		
		Properties prop = new Properties();
		
		prop.load(fp);
		
		return prop;
	}
	
	
	public static String getUrl() throws IOException {
		return getPropertyObject().getProperty("url");
		
	}
	
	public static String getUsername1() throws IOException {
		return getPropertyObject().getProperty("username1");
	}
	
	public static String getPassword1() throws IOException {
		return getPropertyObject().getProperty("password1");
	}
	
	public static String getUsername2() throws IOException {
		return getPropertyObject().getProperty("username2");
	}
	
	public static String getPassword2() throws IOException {
		return getPropertyObject().getProperty("password2");
	}
	
	
	

}
