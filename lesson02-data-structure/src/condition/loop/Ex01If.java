package condition.loop;

public class Ex01If {
	public static void main(String[] args) {
		int number =8;
		if(isEvent(number)) {
			System.out.println(number+" is event number!!!");
		}
		System.out.println("Finish...");
	}

	private static boolean isEvent(int a) {
		return a % 2 == 0;
	}
}
