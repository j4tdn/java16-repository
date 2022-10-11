package immutable;

public class Ex02Manipulation {

	public static void main(String[] args) {
		String s = "hello all";
		// Tinh chieu dai chuoi
		System.out.println("length: " + s.length());
		
		// Noi s1 vao s
		String s1 = " - I'm Teo";
		System.out.println("Plus: " + (s + s1));
		System.out.println("Concatenate: " + s.concat(s1));
		
		// Lay mot ki tu tai vi tri index(3)
		System.out.println("index: " + s.charAt(3));
		
		// Duyet tung ki tu 
		for(int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		
		// Tim vi tri dau, cuoi cua ki tu l 
		System.out.println("start index of 'l' --> " + s.indexOf("l"));
		System.out.println("last index of 'l' --> " + s.lastIndexOf("l"));
	}
	
	

}
