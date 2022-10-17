package view;

public class Ex06 {
	public static void main(String[] args) {
		
		StringBuilder s = new StringBuilder();
		for (int i = 1; i <= 200; i++) {
			s.append(i);
		}
		System.out.println(s);
		for (int i = 0; i < s.length(); i++) {
			System.out.println(i + " " + s.charAt(i));
		}
	}
}
