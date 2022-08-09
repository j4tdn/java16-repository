package condition.loop;

public class Ex05Testing {
	public static void main(String[] args) {
		//viet ham tim max cua 2 so a va b
		int a = 5;
		int b = 6;
		max(a,b);
		System.out.println(max(a,b));
	}
	
	private static int max (int a, int b) {
		return a > b ? a:b;
	}

}
