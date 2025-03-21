package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile {
	public static void main(String[] args) throws IOException {
		
		// to specify the location of the file
		FileInputStream fis = new FileInputStream("./testData/config.properties");
		
		// o make file ready to read
		Properties prop = new Properties();
		prop.load(fis);
		
		//to read the data from property file
       String url = prop.getProperty("url");
       
       System.out.println(url);
	}
}
