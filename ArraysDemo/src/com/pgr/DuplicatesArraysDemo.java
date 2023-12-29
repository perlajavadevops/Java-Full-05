package com.pgr;

import java.util.Iterator;

public class DuplicatesArraysDemo {

	public static void main(String[] args) {
		int[] arr = new int[6];// 3
		arr[0] = 1;
		arr[1] = 3;
		arr[2] = 7;
		arr[3] = 1;
		arr[4] = 7;
		arr[5] = 7;
		
		// below logic will help u to print only duplicates

		/*
		 * for (int i = 0; i <= arr.length - 1; i++) {// 2<2 normal for-loop ascending
		 * or decending if (arr[i] == arr[i + 1]) { // 0 0+1 =1{
		 * System.out.println(arr[i]); break; } }
		 */

		/*
		 * for(int i = 0; i<arr.length; i++) { for (int j = i+1; j < arr.length; j++) {
		 * if(arr[i]==arr[j]) { System.out.println(arr[j]); }else {
		 * System.out.println(arr[i]); } } }
		 */
		
		
	}
}