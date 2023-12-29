
public class StringDemo3 {

	public static void main(String[] args) {
		String s1 = "Welcome Hello Java Lang";

		/*
		 * char[] arr = s1.toCharArray();// for (int i = 0; i < arr.length; i++) {
		 * System.out.println(arr[i]); }
		 */

		/*
		 * byte[] by = s1.getBytes();// for (int i = 0; i < by.length; i++) {
		 * System.out.println(by[i]); }
		 */
		
		String[] strArry = s1.split(" ");
		for(String s : strArry) {
			System.out.print(s);
		}
	}
}
