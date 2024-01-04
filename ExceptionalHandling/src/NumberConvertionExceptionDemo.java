
public class NumberConvertionExceptionDemo {

	public static void main(String[] args) {

		System.out.println("Statement 1....");
		try {
			System.out.println("Statement 2....");
			String val = "1007h";

			int num = 120;

			try {
				String name = null;
				System.out.println(name.length());
			} catch (NullPointerException ne) {
				System.err.println(ne.getMessage());
			}

			int[] arr = new int[1];
			arr[0] = 90;
			arr[1] = 80;

			// int convertedVal = Integer.parseInt(val);
			float convertedVal = Float.parseFloat(val);
			System.out.println("Statement 3....");
			System.out.println(convertedVal);
		} catch (NumberFormatException nfe) {
			nfe.printStackTrace();
			// System.out.println(nfe.getMessage());
			// System.err.println(nfe.getMessage());
		} /*
			 * catch (ArrayIndexOutOfBoundsException ne) { ne.printStackTrace(); }
			 */ catch (Exception en) {
			en.printStackTrace();
		}

		System.out.println("Statement 4....");
	}
}
