package view;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Ex02Topic2 {
	public static void main(String[] args) {
		System.out.println(happyNumber(44));
		
	}
	
	private static boolean happyNumber(int number) {
		while(true) {
			String listnums[] = String.valueOf(number).split("");
			int tmp = 0 ;
			String text = "";
			for (int i = 0; i < listnums.length; i++) {
				int num = Integer.parseInt(listnums[i]);
				tmp += Math.pow(num, 2);
				text += num + "^2" + " + ";
			}
			System.out.println(text.substring(0,text.length()-2));
			number = tmp;
			if(number == 1)
				return true;
		}
	}
}
