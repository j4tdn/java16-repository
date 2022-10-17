package ex04;

public class Ex04_PermutaionOfString {
	public static void main(String[] args) {
		String s = "xyz";
		int n = s.length();
		boolean[] used = new boolean[n];
		char result[] = new char[n];
		
		permute(0, used, s, result);
	}
	
	private static void permute(int times,  boolean[] used, String s, char result[]) {
		
		int n = s.length();
	    for (int i = 0; i < n; i++) {
	        if (!used[i]) {
	            result[times] = s.charAt(i); 
	            used[i] = true;
	            if (times == n - 1)
	                printf(result);
	            else
	                permute(times + 1, used, s, result);
	            used[i] = false;
	        }
	    }
	}
	
	private static void printf(char A[]) {
	    for (int i = 0; i < A.length; i++) {
	    	System.out.print(A[i]);
	    }
	    System.out.println();
	}
}
