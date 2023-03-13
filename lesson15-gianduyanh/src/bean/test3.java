package bean;

import java.util.Scanner;

public class test3 {
	 static Scanner sc = new Scanner(System.in);
	static int n = sc.nextInt();
	static int m = sc.nextInt();
	public static void main(String[] args) {
		reduce();
		
	}
	public static void reduce() {
		
        int a = n;
        int b = m;
        int r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }

        // Toi gian phan so
        n /= b;
        m /= b;
        System.out.println(r);
    }

}
