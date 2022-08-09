package condition.loop;

public class Ex01If {

	public static void main(String[] args) {
		int number = 7;
		boolean isValid = isEven(number);
		if (isValid) {
			System.out.println(number + "is even number !!!");
			
		}
		System.out.println("finish ...");
	}
	private static boolean isEven(int number) {
		return number % 2 == 0;
		
	}
}
