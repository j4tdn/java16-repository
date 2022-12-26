package immutable;

public class Ex02Manipulation {
	public static void main(String[] args) {
		String s = "Hello ";
		System.out.println("length: " + s.length());

		String s1 = "Jasmine";
		System.out.println(s + s1);
		System.out.println("Concatenate: " + s.concat(s1));
		System.out.println(s); // s = "Hello " after s.concat

		System.out.println("index(3): " + s.charAt(3));

		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}

		System.out.println("start index of 'l': " + s.indexOf("l"));
		System.out.println("last index of 'l': " + s.lastIndexOf("l"));
	}
}
