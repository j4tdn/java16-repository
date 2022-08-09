package condition.loop;

public class Ex01If {
	public static void main(String[] args) {
		int number = 6;
		boolean isValid = isEven(number);
		
		if(isValid) {
			System.out.println(number + " " + "is even number !!!");
		}
		else {
			
		
		System.out.println("deo phai");
		}
	}
	private static boolean isEven( int number) {
		if( number % 2 == 0) {
			return true;
			
		}
		else {
			return false;
			
		}
	}

}
