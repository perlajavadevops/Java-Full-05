
public class PatternDemo {

	public static void main(String[] args) {
		int no = 6;

		for (int i = 1; i < no; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("===============");
		for (int i = no; i >=1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
		System.out.println("================");
		int number = 1;
		for (int i = 1; i < no; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(number + " ");
				number++;
			}
			System.out.println();
		}
	}
}

/*
1
1 2
1 2 3
1 2 3 4
*/