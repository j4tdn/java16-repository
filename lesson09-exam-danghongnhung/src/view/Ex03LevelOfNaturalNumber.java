package view;

import java.util.Vector;

public class Ex03LevelOfNaturalNumber {
	public static void main(String[] args) {
		int[] arr = {8, 5, 9, 20};
		
		arr = sortByLevel(arr) ;
		for(int num : arr) {
			System.out.print(num+ " ");
		}
		
	}
	
	private static int levelOfNumber(int n) {
		Vector<Integer> v = new Vector<Integer>();
		for(int i = 1; i<n; i++) {
			if(n%i==0)
				v.add(i);
		}
		return v.size();
	}
	
	private static int[] sortByLevel(int[] arr ) {
		int[] levelOfArray = new int[arr.length];
		
		for(int i = 0; i<arr.length; i++) {
			levelOfArray[i] = levelOfNumber(arr[i]);
		}
		
		for(int i = 0; i<arr.length-1; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(levelOfArray[j] < levelOfArray[i]) {
					int tmp = levelOfArray[j];
					levelOfArray[j] = levelOfArray[i];
					levelOfArray[i] = tmp;
					
					tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
		}
		return arr;
	}
	
}


