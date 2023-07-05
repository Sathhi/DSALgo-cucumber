package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configreader {
	public static Properties initializeproperties() throws FileNotFoundException
	{
		Properties prop=new Properties();
		File propfile=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Config\\config.properties");
	    try
	    {
	    	FileInputStream fis=new FileInputStream(propfile);
	    	prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	    return prop;
	}
	

}
