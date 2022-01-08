package com.noorteck.java.hw11;

public class Question3 {

	public static void main(String[] args) {
		int diffTotal = different21(2);
		System.out.println(diffTotal);

	}

	public static int different21(int number) {
		int result = 0;
		int i =21;
		if (number < i) {
			result = (number -21)*2 ;
			
		} else  {
			result = number - i;

		
		}
		
		return result;
	}
}
