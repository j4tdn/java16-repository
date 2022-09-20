package view;

import java.util.Arrays;
import java.util.Iterator;

public class Ex02Sale {
	public static void main(String[] args) {
		int n = 5;
		int[] da = {35, 40, 100};
	    System.out.println(saleBill(da));
		// 45 56 23 100 12 21 32 102 123 133
	    // 12 21 23 32 45 56 100 102 123 133
	}
	
	public static int saleBill(int[] numbers) {
		
		int totalOfMoney = 0;
		int tmp = 0;
		int k[] = new int[tmp];
		System.out.println(Arrays.toString(numbers));
		for(int i = 0 ; i < numbers.length; i ++)
		{
			if(numbers[i] >= 100)
			{
				System.out.println(i + "thu nhat");	
				tmp = i;
				System.out.println(numbers[i]);
				System.out.println(tmp);
				break;
			}
			System.out.println(tmp);
		}
		
		for(int i = 0 ; i < numbers.length; i ++) {
			totalOfMoney += numbers[i];
		}
		for(int i = tmp + 1 ; i < numbers.length; i ++) {
			totalOfMoney -= numbers[i];
		}
		for(int i = tmp-1; i < numbers.length; i ++) {
			totalOfMoney -=numbers[i];
			break;
		}
	
		return totalOfMoney;
	}
	


}
