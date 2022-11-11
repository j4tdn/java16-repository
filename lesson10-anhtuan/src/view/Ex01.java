package view;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,3,1};
		remove(a);
		
		//int[] b = remove(a);
		//System.out.println(Arrays.toString(b));
	}
	private static void remove(int[] a) {
		int[] b = new int[4];
		int[] c = new int[4];
		int[] d = new int[2];
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		for(int i = 0; i < a.length -1; i++) {
			
				if(a[i] == a[i+1]) {
					b = delete(a, i);
					c = delete(b, i);
					break;
					
				}
		}
		System.out.println(Arrays.toString(c));
		for(int i = 0; i < c.length - 1 ; i++) {
			
				if(c[i] == c[i+1]) {
					d = delete(c, i);
					System.out.println(Arrays.toString(delete(d, i)));
					
				}
		}
		 
	}
	private static int[] delete(int[] a, int k) {
		int[] result = new int[a.length - 1];
		for(int i = 0; i < k; i++) {
			result[i] = a[i];
		}
		for(int i = k; i < result.length ; i++) {
			result[i] = a[i + 1];
		}
		return result;
	}

}
