package Ex02;

public class Bai2 {
	public static void main(String[] args) {
		String input = "aaaaabbbbbdeess";
		System.out.println("input: " + input);
		countLetter(input);
	}
	
	public static void countLetter(String input) {
		char kytu; boolean kt = true; int k = 0;
		Letter[] arrayChar = new Letter[26];
		for (int i = 0; i < arrayChar.length; i++) {
			arrayChar[i] = new Letter();
		}
		for (int i = 0 ; i < input.length(); i++) {
			kt = true;
			kytu = input.charAt(i);
			for (int j = 0; j < arrayChar.length; j++) {
				if (kytu == arrayChar[j].getValue()) {
					arrayChar[j].setCount(arrayChar[j].getCount()+1);
					kt = false;
				}
			}
			if (kt) {
				arrayChar[k].setValue(kytu);
				arrayChar[k].setCount(1);
				k++;
			}
		}
		int max = 0;
		for (int i = 0 ; i < k; i++) {
			System.out.println(arrayChar[i].getValue() + " " + arrayChar[i].getCount());
			if (max < arrayChar[i].getCount()) {
				max = arrayChar[i].getCount();
			}
		}
		System.out.print("output: ");
		kt = true;
		for (int i = 0; i < k; i++) {
			if (arrayChar[i].getCount() == max) {
				if (kt) {
				System.out.print(arrayChar[i].getValue());
				kt = false;
				} else {
					System.out.print(", " + arrayChar[i].getValue());
				}
			}
		}
	}
}
