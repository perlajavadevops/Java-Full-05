
public class VoteEligibilityChecking {

	public static void validateAge(int age) throws InvalidAgeException{
		
		if(age<18){
			throw new InvalidAgeException("ATLS105");
		}else{
			System.out.println("Welcome");
		}
	}
	
	public static void main(String[] args) {
		try {
			validateAge(17);
		} catch (InvalidAgeException e) {
			System.err.println(e.getMessage());//ATLS105 
		}
	}
}// 2 mins 