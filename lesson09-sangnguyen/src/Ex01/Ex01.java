package Ex01;

import java.util.Arrays;
import java.util.Random;

public class Ex01 {
	public static void main(String[] args) {
		Random rd = new Random();
		int n = rd.nextInt(10);
		int[] a1 = new int[n]; 
		int[] a2 = new int[n];
		
		for (int i = 0; i < n; i++) {
			a1[i] = rd.nextInt(n);
			a2[i] = rd.nextInt(n);
			
			System.out.println(a1[i] + " " + a2[i]);
		}	
		System.out.println("so phan tu chung cua hai mang la: ");
		for( int i: findNumer(a1, a2)) {
			System.out.print(i+" ");
		}
	}
	
	public static int[] findNumer(int a1[], int a2[]) {
		int temp = 0;
		boolean[] kiemtra = new boolean[a1.length];
		int[] a3 = new int[a1.length];
		for (int i = 0; i< a1.length; i++) {
			kiemtra[i] = true;
		}
		for (int i = 0; i< a1.length; i++) {
			for (int j = 0; j< a1.length; j++) {
				if (a1[i] == a2[j] && kiemtra[a1[i]]) {
					kiemtra[a1[i]] = false;
					a3[temp++] = a1[i];
				}
			}
		}
		return Arrays.copyOfRange( a3, 0, temp);
	}
}
