import java.util.Iterator;
import java.util.Stack;


public class StackDemo {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		/*
		 * stack.push("Mahesh"); stack.push("PerlaReddy"); stack.push("Bhargav");
		 * stack.push("Dinesh");
		 */
		
		//stack.pop();
		//stack.pop();
		//stack.pop();
		//System.out.println(stack.peek());
		
		Iterator<String> itr = stack.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println(string);
		}
		
		System.out.println(stack.empty());
		
		
		
	}
}
