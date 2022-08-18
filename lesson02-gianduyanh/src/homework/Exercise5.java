package homework;

public class Exercise5 {
	public static void main(String[] args) {
		int n = 124;
		String k = "";
		while (n > 0) {
			k = (n%2) + k;
			n = n /2;		
		}
		System.out.println(k);
	}

}
