package condition.loop;

public class Ex01If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 8;
		boolean isValid = isEven(number);
		if(isValid) {
			System.out.println(number + " is even number!!");
		}
	}
	
	private static boolean isEven(int number) {
		return number % 2 ==0;
	}
}
