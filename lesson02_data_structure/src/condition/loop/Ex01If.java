package condition.loop;

public class Ex01If {
	public static void main(String[] args) {
		int number =8;
		if(isEven(number)) {
			System.out.println(number +"is isVen");
		}
		
	}
	
	private static boolean isEven(int number ) {
		return number %2 ==0;
	}
}
