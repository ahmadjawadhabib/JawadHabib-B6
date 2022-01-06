package com.noorteck.java.hw11;

public class Question3 {

	public static void main(String[] args) {
		int diffTotal = different21(21);
		System.out.println(diffTotal);

	}

	public static int different21(int number) {
		int result = 0;
		int i =21;
		if (number == 0) {
			result = number  ;
			
		} else if (number < i) {
			result = number - i;

		} else if (number > i) {
			result = number + i;
		}
		
		return result;
	}
}
