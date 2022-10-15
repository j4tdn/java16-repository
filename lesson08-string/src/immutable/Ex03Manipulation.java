package immutable;

public class Ex03Manipulation {
	public static void main(String[] args) {
		String s = "hello all, hope you enjoy";
		String s1 = "hello";
		
		System.out.println("is s starts with s1 ?"+ s.startsWith(s1));
		System.out.println("is s ends with s1 ?"+ s.endsWith(s1));
		
		String s2 = "hi";
		System.out.println("repalce: "+ s.replace(s1, s2));
		
		s= "   hello all, hope you    enjoy";
		s=s.trim()
				.replaceAll("\\s+", " ");
		System.out.println("remove redundant space|||"+ s +"|||");
		
		
		System.out.println("substring: "+ s.substring(4));
		
		
		System.out.println("contains: "+s.contains("you2"));
		
		
		
		
		
	}

}
