package ex02_movernumber;

public class MoverNumber {
	
	public static void main(String[] args) {
		
		int [] numbers = {12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};
		int index = 0;
		System.out.print("Input: ");
		for(int n : numbers ) {
			System.out.print(n+ " ");
		}
		for(int i = 0 ; i < numbers.length; i++) {
			if(numbers[i] % 7 == 0 && numbers[i] % 5 != 0 ) {
				int tmp = numbers[i];
				numbers[i] = numbers[index];
				numbers[index] = tmp;
				 index++;
			}	
		}
		
		for(int i = 0 ; i < numbers.length; i++) {
			if((numbers[i] % 7 == 0 && numbers[i] % 5 == 0) || (numbers[i] % 7 != 0 && numbers[i] % 5 != 0)) {
				int tmp = numbers[i];
				numbers[i] = numbers[index];
				numbers[index] = tmp;
				index++;
			}
		}
		
		System.out.print("\nOutput: ");
		for(int n : numbers ) {
			System.out.print(n+ " ");
		}
		
	}

}
