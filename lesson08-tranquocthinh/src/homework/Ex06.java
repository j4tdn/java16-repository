package homework;

public class Ex06 {
	public static void main(String[] args) {
		System.out.println(findNumberInString(1));
	}
	private static int findNumberInString(int k) {
		String number = "";
		for(int i=0; number.length() < k; i++) {
			number += i;
		}
		return Integer.parseInt(String.valueOf(number.charAt(k)));
	}
}
