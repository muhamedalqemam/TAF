package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadProperties {
	public static Properties userdata = 
			LoadProperties(System.getProperty("user.dir")+"\\src\\main\\java\\properties\\UserData");
	
	private static Properties LoadProperties(String path) {
		Properties pro = new Properties();
		FileInputStream stream;
		try {
			stream = new FileInputStream(path);
			try {
				pro.load(stream);
			} catch (IOException e) {
				System.out.println("stream error " + e.getMessage());
			}
		} catch (FileNotFoundException e) {
			System.out.println("stream error " + e.getMessage());

		}
		
		return pro;
	}

}
