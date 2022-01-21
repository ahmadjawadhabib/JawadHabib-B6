package com.noorteck.java.HWday19;

public class QuestionFour {

	public static void main(String[] args) {

		QuestionFour obj = new QuestionFour();

		String reslutOne = obj.toLower("java");
		String reslutTwo = obj.toLower("jPro");

		System.out.println(reslutOne);
		System.out.println(reslutTwo);

	}

// non-static Method
	String toLower(String strOne) {

		String result = "";
		result = strOne.toLowerCase();

		return result;
	}

}

