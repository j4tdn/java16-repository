package lesson02;

import java.util.Scanner;

public class Ex05ChangeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner ip = new Scanner (System.in);
	    System.out.print (" Nhap vao so can chuyen doi =");
	    int n = ip.nextInt();
	    Change(n);
	}
     public static void Change( int n) {
    	 int a=n;
 		String k = "";
 		while (n > 0) {
 			k = (n%2) + k;
 			n = n /2;		
 		}
       	System.out.println(" So sau khi dc chuyen doi = " + k);
     }
}
