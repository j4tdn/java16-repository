package view;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ex05RandumNumber {
	public static void main(String[] args) {
		int[] arr = new int[95];
		RandomNumber(arr);
	}

	public static void RandomNumber(int[] arr) {

		  Set<Integer> mySet = new HashSet<>();
	        Random random = new Random();
	        
	        while (mySet.size() < 95) {
	            int randomNumber = random.nextInt(100) + 1;
	            mySet.add(randomNumber);
	        }
	        
	        int[] array = new int[mySet.size()];
	        int index = 0;
	        for (int number : mySet) {
	            array[index] = number;
	            index++;
	        }
	        
	        System.out.println("Array:");
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + " ");
	        }
	        
	        System.out.println("\nMissing numbers:");
	        int count = 0;
	        for (int number = 1; number <= 100; number++) {
	            boolean found = false;
	            for (int i = 0; i < array.length; i++) {
	                if (array[i] == number) {
	                    found = true;
	                    break;
	                }
	            }
	            if (!found) {
	                System.out.print(number + " ");
	                count++;
	                if (count == 5) {
	                    break;
	                }
	            }
	        }
	}
}
