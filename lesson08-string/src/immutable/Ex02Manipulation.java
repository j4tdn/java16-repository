package immutable;

public class Ex02Manipulation {
	public static void main(String[] args) {
		String s = "hello all";
		System.out.println(s.length());
		
		String s1 = "- I'm Teo";
		System.out.println(s + s1);
		System.out.println(s.concat(s1));
		System.out.println(s.charAt(3));
		for(int i = 0; i <s.length(); i ++) {
			System.out.println(i + s.charAt(i));
		}
		System.out.println(s.indexOf("l"));
		System.out.println(s.lastIndexOf("l"));
	}

}
