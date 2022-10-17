package view;

public class Ex03 {
	public static void main(String[] args) {
		String s = "  Welcome   toJAVA10   class";
		System.out.println("\nChuoi ban dau: " + s);
		s.split("");
		revertString("Welcome toJAVA10 class ");
	}
	
	private static void revertString (String str) {
		String [] words = str.split(" ");
		String revertString = "";
		for (int i = 0; i < words.length;i++) {
			String word = words[i];
			String revertWord = "";
			for(int j = word.length() - 1; j >=0; j--) {
				revertWord = revertWord + word.charAt(j);
			}
			revertString = revertString + revertWord + "";
		}
		System.out.println(str);
		System.out.println(revertString);
	}
}
