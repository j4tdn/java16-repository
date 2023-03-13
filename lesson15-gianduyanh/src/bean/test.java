package bean;


import java.util.Scanner;


public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = 0;
		for( int i = n ; i <= m; i+= 60) {
			System.out.println("All positions change in year " +i);
		}
		

	}

}
