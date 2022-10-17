package exam;

public class Ex03 {
	public static void main(String[] args) {
		String S="   Welcome  to JAVA10   class  ";
		S=S.trim().replaceAll("\\s+", " ");
		System.out.println("s valid: " +S);
		
		StringBuilder str =new StringBuilder(S);
		System.out.println(str.reverse().toString());
		
	}

}

