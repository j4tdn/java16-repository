package nalview;


import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int countA = 0;
		int countB = 0;
		String[] a = new String[n];
		String tmp = sc.nextLine();
		tmp = tmp.substring(0, 6);
		for(int i = 0; i < tmp.length(); i ++) {
			if(tmp.charAt(i) == 'A') {
				countA++;
			}
			if(tmp.charAt(i) == 'B') {
				countB++;
			}
		}
		if(countA > countB) {
			System.out.println("A");
			
		}
		if(countB > countA) {
			System.out.println("B");
		}
		else {
			System.out.println("Tie");
		}
		
	}

}
