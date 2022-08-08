package datastructure;

public class Ex13BasicArray {
	public static void main(String[] args) {
		int [] digits = new int [5];
		
		System.out.println("digits[0] =" + digits[0]);
		System.out.println("digits[2] =" + digits[0]);
		
		// gan gia tri
		digits[1]=99;
		System.out.println("digits[1] =" + digits[1]);
		
		//
		String[] sequences = {"a","b","c"};
		System.out.println("length: " + sequences.length);
		
		//for-index[0-length)
		for(int i=0; i < sequences.length;i++) {
			System.out.println("value: " + sequences[1]);
		}
		for (String each: sequences) {
			System.out.println("each: " +each);
		}
	}
}
