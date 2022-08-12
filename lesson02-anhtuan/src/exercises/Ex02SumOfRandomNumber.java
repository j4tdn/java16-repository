package exercises;

import java.util.Random;

public class Ex02SumOfRandomNumber {
	public static void main(String[] args) {
		int[] number = new int[5];
		number[0] = new Random().nextInt(1, 10);
		System.out.println(" number[0]= " + number[0]);
		number[1] = new Random().nextInt(1, 10);
		System.out.println(" number[1]= " + number[1]);
		number[2] = new Random().nextInt(1, 10);
		System.out.println("number [2]= " + number[2]);
		number[3] = new Random().nextInt(1, 10);
		System.out.println("number[3]= " + number[3]);
		number[4] = new Random().nextInt(1, 10);
		System.out.println("number[4]= " + number[4]);
		System.out.println("sum= " + sum(number));
		
    	
}
	private static int sum(int[] number) {
	    int sum = 0; 
	    for(int i: number) {
			 sum += factorial(i);
	    }
			     return sum;
			}
	public static int factorial(int n) {
        int factorial = 1;
        if (n == 0 || n == 1) {
            return factorial;
        } else {
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        }
		
		
		
		}
		
	}


