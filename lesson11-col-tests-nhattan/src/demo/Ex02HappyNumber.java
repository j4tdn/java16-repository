package demo;

import java.util.HashSet;
import java.util.Set;

public class Ex02HappyNumber {
	public static void main(String[] args) {
		System.out.println(isHappyNumber(4));
	}
	
	private static boolean isHappyNumber(int number) {
		Set<Integer> existed = new HashSet<Integer>();
		
		
		int replace = 0;
		while (true) {
			if (replace == 1) {
				return true;
			} 
			
			if (existed.contains(replace)) {
				return false;
			}
			existed.add(replace);
			
			replace = 0;
			while (number != 0) {
				replace += (number % 10) * (number % 10);
				number /= 10;
			}
			number = replace;
		}
	}
}
