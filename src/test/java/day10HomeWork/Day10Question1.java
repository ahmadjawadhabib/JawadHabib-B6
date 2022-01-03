package day10HomeWork;

public class Day10Question1 {
	public static void main(String[] args) {

		operators(9.0, 2.0, 'g');

	}

	public static void operators(double numOne, double numTow, char mathOperationSign) {
		 
		 double result =0;
		  if(mathOperationSign =='-') {
			  
		  }else if (mathOperationSign =='+') {
			  result = (numOne + numTow);
		  }else if (mathOperationSign =='*') {
			  result = (numOne -numTow);
		  }else if (mathOperationSign =='/') {
			  result = (numOne /numTow);
		  }else if (mathOperationSign =='%') {
			  result = (numOne %numTow);
		  }else {
			  System.out.println("Error Message :"+mathOperationSign);
		  }
		
		System.out.println(result);

	}

}
