import java.util.regex.Pattern;

public class StringRegularExpr {
	
	public static void main(String[] args) {
		
		String email = "99usernameAFFA.3333333@domain.com";
		String password = "Password@123";//
		
		String mailformat = "/^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$/";

		String regularExp = "/^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,20}$/";
		
		System.out.println(email.matches(email));
		
		Pattern patter = Pattern.compile(regularExp);
		
		boolean flag = Pattern.matches(regularExp, email);
		System.out.println(flag);
		
		String s1 = " Hi hello ";
		//System.out.println(s1);//split, trime, matches, toCharArr, getBytes...
		
		//covert string to numbers(flaot, double, int, short, long)
		
		String s2 = "80";
		float s2Val =  Float.parseFloat(s2);
		System.out.println(s2Val);
		//convert numbers to string --> wrapper classes has to used.
		
		int vl = 90;
		String valIn = Double.toString(vl);
		System.out.println(valIn);
		
		String s4 = "Welcome Hello Java Lang";
		
		System.out.println(s4.substring(8, s4.length()));
		
		
	}

}
