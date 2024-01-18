
/*Q1.
Write a program for the below mentioned question:

Create a string variable, str1 and assign it some value, say “abcd”
Find the number of times the letter ‘a’ occurs in str1 and print the count to console.
For example, if str1 = aba, the output should 02 2

Note :
You can take syntax help from w3schools.com*/

/*
 * Q2. (A)
Write a program for the below mentioned question and show the output: 

Print the exchange rate of EUR to INR and USD to INR. 
URLs to call:
GET https://api.exchangeratesapi.io/latest?symbols=INR,GBP&base=EUR
GET https://api.exchangeratesapi.io/latest?symbols=INR,GBP&base=USD
 
The output should be formatted as give below:
The exchange rate of EUR to INR = ____
The exchange rate of USD to INR = ____


Q2. (B). Given an array, rotate the array to the right by k steps, where k is non-negative. 

Example: 
Input: [1,2,7,8,9] & k=3 (3 steps)

 */

public class Testing13 {

	public static void main(String[] args) {
		
		String s1 = "mno";
		char ch = 'a';
		int count = 0 ;
		for(int i = 0; i<s1.length();i++) {
			if(s1.charAt(i) == ch) {
				count++;
			}
		}
		
		System.out.println(ch+" count :: "+count);
		
		
		
	}
}
