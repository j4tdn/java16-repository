package view;

public class Ex02 {
	public static void main(String[] args) {
		String n1 = "aa6b546c6e22h";
		String[] num = n1.trim().split("[a-zA-Z0]+");
		getLargestNumbers(num);
	}

	private static void getLargestNumbers(String[] numbers) {
		int max = 0;
		for (String number : numbers) {
			try {
				int num = Integer.parseInt(number);
				if (num > max) {
					max = num;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(max);
	}
}
