package view;

public class Ex02IntegerString {
	public static void main(String[] args) {
		String numberAsString = "01a2b3456cde478";
		String[] tokens = numberAsString.split("[a-zA-Z0]+");
		printf(tokens);

	}

	private static void printf(String[] tokens) {
		int i = 0;
		int max = 0;
		for (String token : tokens) {
			i = Integer.parseInt(token);
			if (max < i) {
				max = i;
			}
			System.out.println(max);
		}
	}
}
