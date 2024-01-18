/*Q2. (B). Given an array, rotate the array to the right by k steps, where k is non-negative. 

Example: 
Input: [1,2,7,8,9] & k=3 (3 steps)

*/
public class Testing23 {

	public static void rotateRightArray(int arr[] , int n, int k) {
		
		k=k%n;
		
		for (int i = 0; i < n; i++) {
			if(i<k) {
				System.out.print(arr[n+i-k]+" ");				
			}else {
				System.out.print(arr[i-k]+" ");
			}
			
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,2,7,8,9};
		int n = arr.length;
		int k = 3;
		rotateRightArray(arr, n, k);
	}
}
