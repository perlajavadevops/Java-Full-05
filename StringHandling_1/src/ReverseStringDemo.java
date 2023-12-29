
public class ReverseStringDemo {

	public static String reverseString(String original) {// Hello --> olleH

		if (original.length() <= 1) {
			return original;
		} else {
			return reverseString(original.substring(1)) + original.charAt(0);// elloH
		}

	}

	public static void main(String[] args) {
		System.out.println(reverseString("Hello"));

		String s1 = "Hi";// iH
		for (int i = s1.length() - 1; i >= 0; i--) {
			System.out.print(s1.charAt(i));

		}
	}

}
