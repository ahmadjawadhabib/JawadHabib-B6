package com.noorteck.java.hw11;

public class Question1 {
	public static void main(String[] args) {

		boolean amIsleeping = sleepIn(false, false);
		System.out.println(amIsleeping);
	}
  // modifier    non-void method name    parameters 
	public static boolean sleepIn(boolean isWeekday, boolean isVacation) {
		
		// boolean return type
		boolean result = false;
		
		// if statement condition 
		if (isWeekday != true || isVacation != true) {
			result = true;
			
		} else if (isVacation == true) {
			result = isVacation;
			
		} else if (isWeekday == true)
			result = isWeekday;
		
		return result;

	}

}
/**
Write a method that takes Boolean parameters
	Method Name: sleepIn
	Method Return Type: boolean
	Parameter 1 = boolean isWeekday
	Parameter 2 = boolean isVacation
	The parameter isWeekday is true if it is a weekday, the parameter isVacation is true if we are on
	vacation. We sleep in if it is not a weekday
	otherwise return false.

	if we are on a vacation. Return true if we sleep in

	Then call your function from main method: Create a Boolean variable in your main method and assign
	the value what sleepIn method returns
	
		• Variable Name: Boolean amIsleeping;
		Example:
			if pass false, false value then your method should return true
			sleepIn (false, false) → true



*/