package com.noorteck.HW.day22;

public class QuestionThree {

	public static void main(String[] args) {

		QuestionThree obj = new QuestionThree();
		String myResult = obj.threeEqual("Java Pro", 'P', 'B');
		System.out.println(myResult);

		String myResult2 = obj.threeEqual(null, 'P', 'B');
		System.out.println(myResult2);

		String myResult3 = obj.threeEqual("Lazy mod", 'm', 'C');
		System.out.println(myResult3);
		
	}

	protected String threeEqual(String str, char oldChar, char newChar) {

		String result = "";

		if (str != null) {

			result = str.replace(oldChar, newChar);
		} else {
			result = null;
		}

		return result;
	}

}
/**
	Write a method that takes three parameters. One String parameter, 2 character
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
		threeEqual (null, ’P’, ‘B‘) ----- null
		threeEqual (“Java Pro”, ’P’, ‘B‘) ----- Java Bro
		threeEqual (“Lazy mod”, ‘m‘, ‘C‘) ----- Lazy Cod
		
*/