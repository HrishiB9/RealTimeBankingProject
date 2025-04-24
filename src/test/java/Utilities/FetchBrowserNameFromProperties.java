 package Utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import Constants.ConstantsFiles;

public class FetchBrowserNameFromProperties 
{
	public static Properties readBrowserName() throws IOException
	{
			FileReader reader = new FileReader(ConstantsFiles.BrowserPath);
			Properties pro= new Properties();
			pro.load(reader);
			return pro;
	}
}
