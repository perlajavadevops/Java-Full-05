import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class PropertiesClassDemo {

	public static void main(String[] args) throws IOException {
		Properties prop = System.getProperties();//Reading system proper
		System.out.println(prop.getProperty("java.vm.version"));
		//FileInputStream fis = new FileInputStream("./src/application.properties");
		//Properties prop = new Properties();
		//prop.load(fis);
		
		DemoProp dp = new DemoProp();
		dp.firstName = prop.getProperty("userName");
		System.out.println(dp.firstName);
		System.out.println(prop.getProperty("firstName"));
		
		System.out.println(prop.getProperty("jdbc.mysql.username"));
	}
}
