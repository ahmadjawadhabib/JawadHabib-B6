package com.noorteck.java.HWday19;

public class QuestionOne {

	public static void main(String[] args) {

		boolean myResult = isEqual("sdet", "SDET");
		boolean myResult2 = isEqual("java", "java");
		boolean myResult3 = isEqual("java", "java Prograamming");

		System.out.println(myResult);
		System.out.println(myResult2);
		System.out.println(myResult3);

	}

	 static boolean isEqual(String strOne, String strTwo) {
		boolean result = false;
		if (strOne.equals(strTwo)) {
			result = true;

		}
		return result;
	}
}
/**
 * 1. Write a method that takes two String parameter and checks if the two
 * strings are equal or not. If they are equal return true, otherwise return
 * false Access Modifier: Default Non-Access Modifier: static Return Type:
 * boolean Method Name: isEqual Parameter1: String strOne Parameter2: String
 * strTwo Test Data: isEqual (“sdet”, “SDET”) ----- FALSE isEqual (“testing”,
 * “testing”) ----- TRUE isEqual (“java”, “java”) ----- TRUE isEqual (“java”,
 * “java Programming”) ----- FALSE
 */