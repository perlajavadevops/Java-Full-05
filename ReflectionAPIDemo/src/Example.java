import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Example {

	public void m() {
		System.out.println("m instance method");
	}

	public static void n() {
		System.out.println("n static method");
	}

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {

		Example exmple = new Example();

		Class<Example> clazz = (Class<Example>) exmple.getClass();

		Method[] methods = clazz.getDeclaredMethods();

		/*
		 * for(Method emth : methods) { System.out.println(emth.getName()); }
		 */

		/*
		 * A a = new A(); a.get();
		 */
		
		Class<A> aObject = (Class<A>) Class.forName("A");
		System.out.println(aObject.getName());
		
		//A aa = aObject.getDeclaredConstructor().newInstance(A.class);
		//aa.get();
 
		// A a = (A) aObject.newInstance();
		 //a.get();

	}
}
