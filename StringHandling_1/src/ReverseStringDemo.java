
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

		String s1 = "Hello";// iH
		for (int i = s1.length() - 1; i >= 0; i--) {
			System.out.print(s1.charAt(i));
		}
		System.out.println("============");
		char[] chArr = s1.toCharArray();
		for (int i = chArr.length-1; i >=0; i--) {
			System.out.print(chArr[i]);
		}
	}

}
