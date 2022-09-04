package homework;

public class Ex02 {
	public static void main(String[] args) {
		int[] A = { 5, 12, 14, 6, 7, 23, 20, 19, 26 };
		String S = "";
		System.out.println("a.length: " + A.length);
		
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 7 == 0 && A[i] % 5 !=0) {
				S = S + A[i];
				S += ", ";
			}
			
		}
		for (int i = 0; i < A.length; i++) {
			if ((A[i] % 7 == 0 && A[i] % 5 ==0) || (A[i] % 7 != 0 && A[i] % 5 !=0)) {
				S = S + A[i];
				S += ", ";
			}
		}
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 7 != 0 && A[i] % 5 ==0){
				S = S + A[i];
				S += ", ";
			}
		}
		System.out.println("S = " + S);

}
}
