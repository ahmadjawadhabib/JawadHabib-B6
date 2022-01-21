package Day12Homework;

public class Question2 {

	public static void main(String[] args) {

		boolean myResult = multipleOf(3);//true
		System.out.println(myResult);

		boolean myResult2 = multipleOf(10);// true
		System.out.println(myResult2);

		boolean myResult3 = multipleOf(8);// false
		System.out.println(myResult3);

	}

	public static boolean multipleOf(int number) {
		boolean result = false;

		if ((number % 3 == 0) || (number % 5 == 0)) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}

}
