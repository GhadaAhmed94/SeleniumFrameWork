package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Loadpropirties {
	//load the propirties from the folder
	public static Properties userData= LoadProperties(System.getProperty("user.dir")+"\\src\\main\\java\\Propirties\\userdata.propirties");
	
	private static Properties LoadProperties(String path)
	{
		Properties pro=new Properties();
		//stream for reading file
		
		try {
			FileInputStream stream =new FileInputStream(path);
			try {
				pro.load(stream);
			} catch (IOException e) {
				System.out.println("error occurred :"+ e.getLocalizedMessage());
				
			}
		} catch (FileNotFoundException e) {
			System.out.println("error occurred :"+ e.getLocalizedMessage());
		}
		return pro;
	}

}
