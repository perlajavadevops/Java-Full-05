
public class SeasonsDemo {

	public static void main(String[] args) {
		
		/*
		 * Level level = Level.HIGH; System.out.println(level);
		 */		
		
		 Seasons ee = Seasons.valueOf("RAIN");
		 System.out.println(ee);
		
		Seasons[]  seasons = Seasons.values();
		
		for(Seasons seasons2 : seasons) {
			System.out.println(seasons2.val);
		}
	}

}
