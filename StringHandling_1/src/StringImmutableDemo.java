
public class StringImmutableDemo {

	public static void main(String[] args) {
		
		String s1 = "Hello";//Hello
		s1 = s1.concat("Hi");//HelloHi
		System.out.println(s1);//HelloHi
		System.out.println(s1.concat("Hi"));//HelloHiHi
	}
}
