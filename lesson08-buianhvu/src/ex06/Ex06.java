package ex06;

public class Ex06 {
	public static void main(String[] args) {
		int K = 100 ;
		String s = "" ;
		for (int i = 1; i < K; i++) {
	    s += Integer.toString(i);
		
		}
		System.out.println(s.charAt(K-1));
	}

}
