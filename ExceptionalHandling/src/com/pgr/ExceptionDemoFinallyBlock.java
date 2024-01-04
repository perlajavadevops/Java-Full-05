package com.pgr;

public class ExceptionDemoFinallyBlock {

	public static void main(String[] args) {
		System.out.println("Started");
		try {
			String s = "";
			System.out.println(s.length());

			int arr[] = new int[2];
			arr[0] = 90;
			arr[1] = 60;
			// arr[2] = 80;
			System.out.println("hi");

			String n = "ttttt";
			int i = Integer.parseInt(n);
			System.out.println(i);

		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException exce) {
			exce.printStackTrace();
			System.err.println(exce.getMessage());// Custom error messages --> later }
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally block will be exe always whether excetion is handlde or not..");
		}

		System.out.println("handled first exception successfully");
	}
}
