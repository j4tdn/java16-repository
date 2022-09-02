package ex02_movernumber;

public class MoverNumber {
	public static void main(String[] args) {
		int [] numbers = {12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};
		
		
		int j = 0;
		for(int i = 0 ; i < numbers.length; i++) {
			if(numbers[i] % 7 == 0) {
				swap(numbers[i], numbers[j]);
				j++;
			}	
		}
		for(int n : numbers ) {
			System.out.println(n);
		}
		
	}
	
	public static void swap(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;
	}
}
