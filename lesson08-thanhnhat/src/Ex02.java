
public class Ex02 {
	public static void main(String[] args) {
		String s = "aDam Le vAN john Son";
		// nameAfterFormat = {aDam, Le, vAN, john, Son};
		String[] nameAfterFormat = s.split("\\s");
		String name = "";
		for (int i = 0; i < nameAfterFormat.length; i++) {
			String text = nameAfterFormat[i];
			String firstLetter = text.substring(0, 1);
			String remainingLetters = text.substring(1, text.length());
			firstLetter = firstLetter.toUpperCase();
			remainingLetters = remainingLetters.toLowerCase();
			text = firstLetter + remainingLetters;
			name = name.concat(text + " ");
		}
		System.out.println("Name after format: " + name);
	}

}
