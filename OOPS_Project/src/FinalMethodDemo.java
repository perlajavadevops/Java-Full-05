class Actor{

    public final void acting(){
        System.out.println("Actor acting....");
    }
}

class JuniorActor extends Actor{

	/*
	 * @Override public void acting() {
	 * System.out.println("Junior Actor acting...."); }
	 */
}
public class FinalMethodDemo {

    public static void main(String[] args) {
        Actor juniorActor = new JuniorActor();
        juniorActor.acting();
    }
}
