package view;

public class test5 {
	public static void main(String[] args) {
		int dec = 12345;
		String sum = "";
		do {
			sum = (dec % 2) + sum;
			dec = dec / 2;
		} while (dec > 0);
		System.out.println(sum);
	}

}
