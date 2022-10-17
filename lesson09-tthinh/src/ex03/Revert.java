package ex03;

public class Revert {
	public static void main(String[] args) {
		String input = "Welcome to JAVA10 class";
		revert(input);
	}

	private static void revert(String input) {
		String output = input.replaceAll("\\s+", " ");
		System.out.println("input: " + output);

		String[] inputs = output.split(" ");
		output = "";
		for (int i = 0; i < inputs.length; i++) {
			String word = inputs[i];
			String revertInput = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				revertInput += word.charAt(j);
			}
			output = output + revertInput + " ";
		}
		System.out.println("================================");
		System.out.println("output: " + output);
	}

}
