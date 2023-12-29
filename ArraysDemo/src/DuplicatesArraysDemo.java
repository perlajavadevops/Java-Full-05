import java.util.Arrays;

public class DuplicatesArraysDemo {

	public static void main(String[] args) {
		int[] arr = new int[6];// 3
		arr[0] = 1;
		arr[1] = 3;
		arr[2] = 7;
		arr[3] = 1;
		arr[4] = 7;
		arr[5] = 7;

		Arrays.sort(arr);// collections//0-1,1-1,2-3,3-7
//API -- Strings, Exceptional Handling, IO Streams, Inner classes, Multithreading, Collections Framework, Java 8 Features.
		
		int j = 0;

		// below logic will help u to print only duplicates
		/*
		 * for (int i = 0; i <= arr.length - 1; i++) {// 2<2 normal for-loop ascending
		 * or decending if (arr[i] == arr[i + 1]) { // 0 0+1 =1{
		 * System.out.println(arr[i]); break; } }
		 */

		int[] tempArray = new int[arr.length];// 4
		// below logic will help u to remove duplicates//1,3,7
		for (int i = 0; i <arr.length-1; i++) {//1!=1
			if (arr[i] != arr[i + 1]) {//2+1=3!=7
				tempArray[j++] = arr[i];
			}
		}
		
		tempArray[j++] = arr[arr.length - 1];
		
		for (int i = 0; i <tempArray.length-1; i++) {// 2<2 normal for-loop
			System.out.println(tempArray[i]);
		}

	}
}


// do the sorting using Arrays.sort() method
//crate 1 temp array with same size i.e current array size;
//loop it and if condition
//add the current array last index value into temp arry


//debugging
//1. add the break points in you java code.
//print temp array without last index value
//short cut keys for debugging: F5, F6, F7, F8;