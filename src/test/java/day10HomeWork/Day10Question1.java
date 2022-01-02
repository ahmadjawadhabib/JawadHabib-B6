package day10HomeWork;

public class Day10Question1 {
	public static void main(String[] args) {

		operators(8.0, 2.0, '+');

	}

	public static void operators(double numOne, double numTow, char mathOperationSign) {
		 
		
		System.out.println(numOne + " - " + numTow + " = " + (numOne - numTow));
		System.out.println(numOne + " + " + numTow + " = " + (numOne + numTow));
		System.out.println(numOne + " * " + numTow + " = " + (numOne * numTow));
		System.out.println(numOne + " % " + numTow + " = " + (numOne % numTow));
		System.out.println(numOne + " / " + numTow + " = " + (numOne / numTow));
		

	}

}
