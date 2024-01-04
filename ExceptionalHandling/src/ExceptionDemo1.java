
public class ExceptionDemo1 {

	public static void main(String[] args) {
		
		System.out.println("Started");
		try{
			String s = null;			
			System.out.println(s.length());
			
			int arr[] = new int[2];
			arr[0] = 90;
			arr[1] = 60;
			arr[2] = 80;
			System.out.println("hi");
			
		}catch(NullPointerException e){
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException exce){
			exce.printStackTrace();
			System.err.println(exce.getMessage());//Custom error messages --> later
		}
		System.out.println("handled first exception successfully");
		 
		/*try{
			
		}catch(Exception e){
			e.printStackTrace();			
		}
		
		System.out.println("handled second exception successfully");
*/
		System.out.println("After Exception");
	}
}
