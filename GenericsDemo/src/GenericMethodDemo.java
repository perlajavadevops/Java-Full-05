public class GenericMethodDemo {

	public static <E> void printArray(E[] arr) {
		for (E element : arr) {
			System.out.println(element);
		}
		System.out.println();

	}
	
	public static void main(String[] args) {
		printArray(new Integer[] {1,3,4,5});
		printArray(new String[] {"reddy"});
		printArray(new Character[] {'c','r','t'});
	}
}
