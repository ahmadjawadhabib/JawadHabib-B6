package Day12Homework;

public class Question1 {
	public static void main(String[] args) {

		boolean myValue = posNeg(1, -1, false);
		System.out.println(myValue);

		boolean myValue2 = posNeg(-1, 1, false);
		System.out.println(myValue2);

		boolean myValue3 = posNeg(-4, -5, true);
		System.out.println(myValue3);

	}

	public static boolean posNeg(int numOne, int numTwo, boolean value) {
		boolean result = false;

		if ((numOne == 1 || numOne == -1) && (numTwo == 1 || numTwo == -1)) {
			result = true;
		} else {
			result = false;
		}

		return result;

	}

}
