package immutable;

public class Ex03Manipulation {
	public static void main(String[] args) {
		String s = "Hello all, hope you enjoy";

		String s1 = "Hello";
		System.out.println("Does s start with s1? " + s.startsWith(s1));
		System.out.println("Does s end with s1? " + s.endsWith(s1));

		String s2 = "Jasmine";
		System.out.println(s.replaceFirst("all", "Jasmine"));
		
		String s3 = "       Hello all, hope              you                 enjoy";
		s3 = s3.trim(); // loáº¡i bá»� khoáº£ng tráº¯ng á»Ÿ 2 Ä‘áº§u (beginning and end)
		s3 = s3.replaceAll("\\s+", " ");
		System.out.println("Remove redundant space: " + s3);

		String sSub = s.substring(2);
		System.out.println(sSub);

		System.out.println(s.contains(s2));
	}
}
