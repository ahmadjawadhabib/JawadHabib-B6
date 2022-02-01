package com.noorteck.java.HWday20;

public class Question11 {

	public static void main(String[] args) {
		
		Question11 obj = new Question11();
		String myResult=obj. threeEqual("Java Pro", 'P', 'B');
		String myResult1=obj. threeEqual("Lozy mode", 'm', 'C');
		String myResult2=obj. threeEqual("Training", 'T', ' ');
		
		System.out.println(myResult);
		System.out.println(myResult1);
		System.out.println(myResult2);

		
	}

	protected String threeEqual(String str, char oidChar, char newChar) {

		String result = "";

		result = str.replace(oidChar, newChar);

		return result;

	}

}
/**
	11. Write a method that takes three parameters. One String parameter, 2 character
		parameters. The method replaces old character (parameter 2) from String parameter
		with new character (parameter 3) and returns the new string

		Access Modifier: protected
		Non-Access Modifier: non-static
		Return Type: String
		Method Name: threeEqual
		Parameter1: String str
		Parameter2: char oldChar
		Parameter3: char newChar
		
		Test Data:
		threeEqual (“Java Pro”, ’P’, ‘B‘) ----- Java Bro
		threeEqual (“Lazy mode”, ‘m‘, ‘C‘) ----- Lazy Cod
		threeEqual (“Training”, ‘T’, ‘ ‘) ----- raining

----------------------------------------------------------------------------------------------------------------
*/