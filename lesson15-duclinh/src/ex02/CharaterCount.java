package ex02;

import java.util.Arrays;

public class CharaterCount {

	static char[] MaxOccuringChar(String str1) {
		int ctr[] = new int[256];
		int l = str1.length();
		for (int i = 0; i < l; i++)
			ctr[str1.charAt(i)]++;
		int max = -1;
		char[] rs = new char[str1.length()];
		int k = 0;
		for (int i = 0; i < l; i++) {
			if (max <= ctr[str1.charAt(i)]) {
				max = ctr[str1.charAt(i)];			
				rs[k++] = str1.charAt(i);
			}
		}
		 
		return rs;
	}

	private static void printf(char[] a) {
		for (char arr : a) {
			System.out.println(arr+" ");
		}
	}

	public static void main(String[] args) {
		String str1 = "aaaaccdcec";
		System.out.println("Chuoi dai: " + str1);
//		System.out.println("ky tu nhieu nhat " + MaxOccuringChar(str1));
		char[] n = MaxOccuringChar(str1);
		 
		printf(n);
	}
}
