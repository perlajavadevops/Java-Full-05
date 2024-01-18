import java.io.IOException;


public class ForNameDemo {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
		Class clazz = Class.forName("PropertiesClassDemo");
		System.out.println(clazz.getName());
	//	PropertiesClassDemo prope = (PropertiesClassDemo)clazz;
		PropertiesClassDemo prop = (PropertiesClassDemo) clazz.newInstance();
		System.out.println(prop);
		prop.main(args);
	}
}
