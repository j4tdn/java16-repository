package baitap;

import java.util.Random;

public class Ex07Random5 {

	public static void main(String[] args) {
		Random rd = new Random();
		int[] a = new int[5];
		for (int i = 0; i <a.length; i++) {
			int number = 0;
			while(!check(a, number)) {
				number = 20 + rd.nextInt(10);
			}
			a[i] = number;
			System.out.println("Number " +(i)+ ": " + (a[i]));
		}
	} 
	// check so trung
	private static boolean check(int[] b, int number) {
		for (int i = 0; i < b.length; i++) {
			if (b[i] == number)
				return false;
		}
		return true;
   }
}