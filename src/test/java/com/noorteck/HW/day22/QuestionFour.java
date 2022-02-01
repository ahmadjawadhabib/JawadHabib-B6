package com.noorteck.HW.day22;

public class QuestionFour {
	public static void main(String[] args) {

		String myResult = getSubStr(null, 0, 2);
		String myResult2 = getSubStr("Java training ", 2, 6);
		System.out.println(myResult2);
		System.out.println(myResult);

	}

	public static String getSubStr(String str, int startindex, int endIndex) {

		String result = "";
		if (str != null) {

			result = str.substring(startindex, endIndex);
		} else {
			result = null;
		}
		return result;

	}
}
/**
   			Write a method to get a substring of a given string between 
   			two specified positions.

		Access Modifier: public
		Non-Access Modifier: static
		Return Type: String
		Method Name: getSubStr
		Parameter1: String str
		Parameter2: Int startingIndex
		Parameter2: Int endingIndex
		
		Test Data:
		getSubStr (null, 2 ,6) ----- null
		getSubStr (“java training”, 2 ,6) ----- v at
*/