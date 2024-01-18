import java.util.ArrayList;

class Employe{
	
}

public class GenericDemo1 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();//use generics to maintain typesafety
		//al.add(12);//12 --> new Integer(12);
		al.add("Manasi");
		al.add("Siri");//2+1 ==3
		for(String obj : al){
			//Employe e = (Employe)obj; //use generics to avoid class cast exp
			System.out.println(obj);
		}
	}
}
