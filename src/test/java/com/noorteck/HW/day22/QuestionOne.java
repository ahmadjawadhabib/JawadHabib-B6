package com.noorteck.HW.day22;

public class QuestionOne {

	public static void main(String[] args) {
		
		QuestionOne obj = new QuestionOne();
		
		String myResult = obj.toUpper("Pro"); 
		System.out.println(myResult);
		
		String myResultTwo = obj.toUpper("java"); 
		System.out.println(myResultTwo);
		
		String myResultThree = obj.toUpper(null); 
		System.out.println(myResultThree);
		
		

	}

	String toUpper(String strOne) {
		
		String result = "";
 
		if (strOne != null) {
		result = strOne.toUpperCase();
		}else {
			result = null;
		}
		
		return result;

	}
}
/**
	Write a method that takes one String parameter and the method converts the
      parameter to uppercase and return the new String value

   			Access Modifier: default
			Non-Access Modifier: non-static
			Return Type: String
			Method Name: toUpper
			Parameter1: String strOne
		Test Data:
			toUpper (“Pro”) ----- PRO
			toUpper (“java”) ----- JAVA
			toUpper (null) ----- null

*/