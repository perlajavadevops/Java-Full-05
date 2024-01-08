
public class EnumDemo {

	public static void main(String[] args) {
		
		/*
		 * Level level = Level.HIGH; System.out.println(level);
		 */		
		Level[]  levels = Level.values();
		
		for(Level leve : levels) {
			System.out.println(leve);
		}
	}
}
