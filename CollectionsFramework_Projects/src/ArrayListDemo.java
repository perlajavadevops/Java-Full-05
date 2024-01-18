import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		//al.en
		al.add(10);
		al.add(10);//Integer
		al.add(10.90);//Double
		al.add('c');//Character
		al.add(true);//Boolean
		al.add("Hello");//String
		
		
		Object[] all = al.toArray();
		//System.out.println(al.);
		//System.out.println(al.get(4));
		//System.out.println(al);
		
		for (int i = 0; i < al.size(); i++) {
			
		}
	}
}
