package day10HomeWork;

public class Day10Question1 {
	public static void main(String[] args) {

		operators(9.0, 2.0, '+');

	}

	public static void operators(double numOne, double numTow, char mathOperationSign) {

		double result = 0; // creating variable for double
		if (mathOperationSign == '-') { //if statement to check the condition 

		} else if (mathOperationSign == '+') {
			result = (numOne + numTow);
		} else if (mathOperationSign == '*') {
			result = (numOne - numTow);
		} else if (mathOperationSign == '/') {
			result = (numOne / numTow);
		} else if (mathOperationSign == '%') {
			result = (numOne % numTow);
		} else {
			System.out.println("Error Message :" + mathOperationSign);
		}

		System.out.println(numOne + " " + mathOperationSign  +" "+ numTow + " = " + result);

	}

}
