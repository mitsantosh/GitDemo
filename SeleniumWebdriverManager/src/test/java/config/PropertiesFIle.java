package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import tests.GoogleSearchTestwithTestNG;

public class PropertiesFIle {
	static Properties prop=new Properties ();
	static String projectpath=System.getProperty("user.dir");

	public static void main(String[] args) {
		getProperties() ;
		
	}

	public static void getProperties() {
		

		try {
			InputStream input= new FileInputStream(projectpath+"/src/test/java/config/config.properties");
			prop.load(input);
			String browser=prop.getProperty("browser");
			System.out.println(browser);
			GoogleSearchTestwithTestNG.browserName=browser;
		}
		catch (Exception exc) {
			System.out.println(exc.getMessage());
			System.out.println(exc.getCause());
			exc.printStackTrace();
		}

	}

	public static void setProperties() {
		try {
			OutputStream output=new FileOutputStream(projectpath+"/src/test/java/config/config.properties");
			prop.setProperty("browser", "firefox");
			prop.store(output, null);
		}
		catch (Exception exc) {
			System.out.println(exc.getMessage());
			System.out.println(exc.getCause());
			exc.printStackTrace();
		}
	}

}
