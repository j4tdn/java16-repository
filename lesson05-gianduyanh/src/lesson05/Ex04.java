package lesson05;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		int number[] = { 3, 15, 21, 0, 15, 17, 21 };
		sortASC(number);
		System.out.println(Arrays.toString(getUniqueNumbers(number)));
		
	}

	public static int[] getUniqueNumbers(int[] numbers) {
		int da = numbers[0];
		ArrayList<Integer> da1 = new ArrayList<>();
		int count = 0;
		
		for(int i = 0; i < numbers.length; i ++) {
			da = numbers[i];
			count = 0;
			for(int j = 0 ; j < numbers.length; j ++) {
			if(numbers[j] == da)
		     count++;
			
			}
			
			if(count == 1) {
				da1.add(da);
			}
		}
		int[] rs = new int[da1.size()];
		for(int i = 0 ; i < rs.length; i ++)
		{
			rs[i] = da1.get(i);
		}
		return rs;
		
	}
	public static void sortASC(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

}
