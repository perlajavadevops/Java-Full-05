
public class RecursionDemo {

	public static String reverseString(String originalString){
		String reversedString=  null;
		if(originalString==null || originalString.length()==0){
			return originalString;
		}else{
			reversedString = reverseString(originalString.substring(1))+originalString.charAt(0);
			return reversedString;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(reverseString("Perla"));
	}
}
