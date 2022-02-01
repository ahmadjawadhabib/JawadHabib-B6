package com.noorteck.java.HWday20;

public class Question15 {

	public static void main(String[] args) {

		String myResult = removeSpace("   Java Training       ");
		System.out.println(myResult);
		
		String myResultTwo = removeSpace("    I  like to Practice       ");
		System.out.println(myResultTwo);
		
	}
	// static method 
	public static String removeSpace(String strOne) {
		
		String result ="";
		//  trim() return type for this method is String 
		result = strOne.trim();
		return result ; 		
	}

}
/**
	Write a method to trim any leading or trailing whitespace from a given string

	Access Modifier: public
		Non-Access Modifier: static
		Return Type: String
		Method Name: removeSpace
		Parameter1: String strOne
		
	Test Data:
		removeSpace (“ Java Training ”) ----- java Training
		removeSpace (“ I like to practice ”) ----- I like to practice
*/