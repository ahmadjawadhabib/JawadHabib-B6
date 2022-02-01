package com.noorteck.HW.day22;

public class QuestionSix {

	public static void main(String[] args) {

		QuestionSix obj = new QuestionSix();
		boolean resultOne = obj.endsWithNG("Everyone is practicing");
		System.out.println(resultOne);

		boolean resultTwo = obj.endsWithNG(null);
		System.out.println(resultTwo);

		boolean resultThree = obj.endsWithNG("i like to practic ");
		System.out.println(resultThree);
		boolean resultFour = obj.endsWithNG("i am Studing");
		System.out.println(resultFour);
	}

	public boolean endsWithNG(String strOne) {
		boolean result = false;

		if (strOne == null) {
			result = false;

		} else if (strOne != null && strOne.endsWith("ng")) {
			result = true;
		}

		return result;
	}

}

/**
	Write a method that takes a string parameter and return true if the string parameter
		ends in "ng"

	Access Modifier: public
	Non-Access Modifier: non-static
	Return Type: boolean
	Method Name: endsWithNG
	Parameter1: String strOne
	
	Test Data:
	endsWithNG (null) ----- FALSE
	endsWithNG (“I like to practice”) ----- FALSE
	endsWithNG (“Everyone is practicing”) ----- TRUE
	endsWithNG (“I am studying”) ----- TRUE
*/













