package condition.loop;

public class Ex01if {
	public static void main(String[] args) {
		int number = 8;
		if(isEven(number)) {
			System.out.println(number + " is Even number !!!");
		}
		
		System.out.println("Finish ...");
	}
	
	private static boolean isEven(int number) {
		return (number%2==0);
	}
}
