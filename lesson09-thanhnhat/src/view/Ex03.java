package view;

public class Ex03 {
	public static void main(String[] args) {
		String s = "Welcome    to JAVA10     class";
		revert(s);
	}

	private static void revert(String s) {
		String[] outputs = s.trim().split("[\\s]+");
		String result = "";
		for (int i = 0; i < outputs.length; i++) {
			String reverseWord = "";
			String output = outputs[i];
			for (int j = output.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + output.charAt(j);
			}
			result = result.concat(reverseWord + " ");
		}
		System.out.println(result);

	}
}
