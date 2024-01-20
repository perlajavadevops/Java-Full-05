class Generic<T> {
	
	T obj;

	T getObj() {
		return obj;
	}

	void add(T obj) {
		this.obj = obj;
	}

}

class WithoutGeneric {
	int obj;
	
	int getObj() {
		return obj;
	}

	void add(int obj) {
		this.obj = obj;
	}
}
public class GenericClassDemo {

	public static void main(String[] args) {
		Generic<String> gen = new Generic<String>();
		gen.add("Reddy");
		System.out.println(gen.getObj());
		Generic<Integer> gen1 = new Generic<Integer>();
		gen1.add(12);
		System.out.println(gen1.getObj());
		
		WithoutGeneric withoutGeneric = new WithoutGeneric();
		withoutGeneric.add(10);
		System.out.println(withoutGeneric.getObj());
	} 
}
