package com.noorteck.java.hw11;

public class Question4 {

	public static void main(String[] args) {

		int mytotal = sumDouble(2, 2);
		System.out.println(mytotal);

	}

	public static int sumDouble(int valueOne, int valueTwo) {
		int result = 0;

		if (valueOne < valueTwo) {
			result = valueOne + valueTwo;

		} else if (valueOne > valueTwo) {
			result = valueOne + valueTwo;

		} else if (valueOne == valueTwo ) {
			result = valueOne + valueTwo + (valueOne * valueTwo);
		}
		return result;
	}
}
