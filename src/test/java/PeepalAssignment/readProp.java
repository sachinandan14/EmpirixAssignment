package PeepalAssignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;


public class readProp {

	//@Test
	public static java.util.Properties readProperties()  {
		String path = System.getProperty("user.dir");
		File file=new File(path+"//config.properties");

		FileInputStream input;
		java.util.Properties prop=new java.util.Properties();
		try {
			input = new FileInputStream(file);
			
			try {
				prop.load(input);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		return prop;
		//String user=prop.getProperty("UserName");


	}
}