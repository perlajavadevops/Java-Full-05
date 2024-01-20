package com.pgr;

public class ArraysDemo {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		numbers[5] = 1;//ArrayIndexOutOfBoundsException
		
		//System.out.println(numbers.length);
		//System.out.println(numbers[5]);
		
		for(int i = 0; i<numbers.length; i++) {
			if(numbers[i]%2==1)
				System.out.println(numbers[i]);
		}
		
		for(int i : numbers) {//for-each loop
			System.out.println(i);
		}
		
		
	}
}
