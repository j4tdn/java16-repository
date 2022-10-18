package homework;

public class Ex03 {
	public static void main(String[] args) {
		String s1 = "Em có yêu anh không anh để anh biết còn chờ";
		String s2 = s1.replaceAll("[^\\p{ASCII}]", "");
		System.out.println(s2);
	}
}
