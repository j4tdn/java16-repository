package view;

import java.util.Vector;

public class Ex01CommonElement {
	public static void main(String[] args) {
		int [] arr1= {2, 8, 9, 1, 6};
		int [] arr2 = {2, 1, 1, 8, 9};
		Vector<Integer> v = CommonElement(arr1, arr2);
		for(int i : v) {
			System.out.print(i + " ");
		}
		
	}
	
	private static Vector<Integer> CommonElement(int[] arr1, int [] arr2) {
		Vector<Integer> v = new Vector<Integer>();
		String tmp = "";
		String res = "";
		for(int i : arr1) {
			tmp += i + " ";
		}
		
		for( int i : arr2) {
			if(tmp.contains(i + " ") && !res.contains(i + " ")) {
				res += i + " ";
				v.add(i);
			}
		}
			
		return v;
	}
}
