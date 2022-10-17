package Ex03;

import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {
		Random rd = new Random();
		int n = rd.nextInt(18)+3;
		Number[] array = new Number[n];
		
		for (int i = 0; i < n; i++) {
			array[i].setValue(rd.nextInt(100));
			array[i].setLevel(findLevel(array[i].getValue()));
		}
		Number temp;
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				if (array[i].getLevel() > array[i].getLevel()) {
					temp = array[i];
					array[i] = array[j];	
					array[j] = temp;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(array[i].getValue()+" ");
		}
	}
	
	public static int findLevel(int value) {
		int level = 2;
		for (int i = 2; i < value; i++) {
			if (value%i == 0) {
				level++;
			}
		}
		return level;
	}
}
