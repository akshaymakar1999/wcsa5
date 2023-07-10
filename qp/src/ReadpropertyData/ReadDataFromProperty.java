package ReadpropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

public class ReadDataFromProperty {
	public static void main(String[] args) throws InvalidPropertiesFormatException, IOException {
		
		
		FileInputStream fis = new FileInputStream("./data/config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String data = prop.getProperty("Browser");
		System.out.println(data);
		
	}

}
