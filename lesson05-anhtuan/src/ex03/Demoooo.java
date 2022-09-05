package ex03;

import java.util.Scanner;

public class Demoooo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int A[] = new int[n];
		System.out.print("nhap cac so cho mang  ");

		for (int i = 0; i < n; i++) {
			System.out.print("A" +"["+ i+"]= ");
			A[i] = sc.nextInt();
	    
		}
	}
	private static int UCLN(int a , int b) {
		if(a==b) return a;
	    if(a>b) 
	        UCLN(a-b ,b);
	    else
	        UCLN(a, b-a);
		return b;
	}
	private static int BCNN(int a, int b) {
		return (a*b/UCLN(a,b));
	}
	private static int BCNN_Array(int a[] int n) {
		
	        int temp = BCNN(a[0], a[1] );
	        for(int i=2;i<n;i++){
	            temp = BCNN(temp, a[i]);    
	        }
	        return temp;
	    }
	}


