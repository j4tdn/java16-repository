package condition.loop;

public class Ex01If {
	public static void main(String[] arges) {
		int number = 0;
		boolean isValid = isEvent(number);
		if (isValid) {
			// statement
			System.out.println(number + " is even number!!! ");
		}
		System.out.println("Finish...");
	}

	private static boolean isEvent(int number) {
		 return number % 2 == 0;
		//if (number % 2 == 0) {
			//return true;
		//}
		//eturn false;
	}
}
