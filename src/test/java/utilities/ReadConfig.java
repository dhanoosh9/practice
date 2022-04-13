package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	static Properties prop;

	 public void loadconfig() {
		 
		 File src = new File("./Configuration/config.properties");
		 
		 try {
			 FileInputStream input = new FileInputStream(src);
			 prop = new Properties();
			 prop.load(input);
		 }
		 catch(Exception e) {
			 System.out.println("Exception is " + e.getMessage());
			 e.getStackTrace();
		 }
		
	 }
	 

	 
	 public static String getApplicationURL() {
			String url = prop.getProperty("baseURL");
			return url;
		}
		
		public static String getUsername() {
			String username = prop.getProperty("username");
			return username;
		}
		
		public static String getPassword() {
			String password = prop.getProperty("password");
			return password;
		}
		
		 public static void main(String[] args) {
			 getApplicationURL();
			 getUsername();
			 getPassword();
		 }
	
}
