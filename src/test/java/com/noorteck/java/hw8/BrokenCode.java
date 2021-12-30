package com.noorteck.java.hw8;

public class BrokenCode {
	

	

		public static void main(String[] args) {
			double tempOne = 84.7; // int don't take decimal number but double takes decimal number
			int tempTwo = 66;//

			boolean result; // String takes double quotes condition true and false boolean
			if (tempOne <= 0 && tempTwo >= 100) { // space < = get error and && tow not three
				// "100" is int can't take double quotes
				result = true; // boolean_expression
			} else if (tempOne >= 100 && tempTwo <= 0) { // else if condition
				result = true; // boolean expression
			} else {
				result = false;
			
			}
			System.out.println(result);
		
	System.out.println("------------------------");

		String season = "Monday";

		switch(season){// switch (controling_expression) no need for == "fall" inside switch statement
				case "fall": // char takes single quotes and String double quotes
					System.out.println("Recovering from hot weather");
					break;
				case "winter":
					System.out.println("Toooo cold");			
					 
				case "s": // char takes single quotes and String double quotes
					System.out.println("Recovering from cold weather");			
					break;
				case "summer":
					System.out.println("Toooo hot");			
					 
				default:
					System.out.println("Season does not exist!");
					
				System.out.println("*************************");
		}
		
		for(int i = 0; i < 10; i++){ // int i = value of zero
		

			if (i == 5) {
				System.out.println("I equals to 5");
			} else {
				System.out.println("i not equals");
			}
		

		}
		}


}
