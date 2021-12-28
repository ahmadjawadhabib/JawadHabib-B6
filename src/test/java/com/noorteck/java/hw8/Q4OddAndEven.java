package com.noorteck.java.hw8;

public class Q4OddAndEven {

	public static void main(String[] args) {
		/**
		 * write Java program to calculate the sum of Odd and even numbers. Loop through
		 * numbers between 1 and 20 and display the total of odd numbers and total of
		 * even numbers. Using for loop Using 
		 * 
		 */

		int sum = 0;
		for (int b = 1; b <= 20; b++) {
			//System.out.println(b);
			
			sum = sum +b;
			if(b % 2==0) {
				System.out.println("Even "+b);
			}else if (b % 1 ==0) {
				System.out.println("Odd " +b);
			}
			System.out.println("Sum " +sum);
		}

	}
}
