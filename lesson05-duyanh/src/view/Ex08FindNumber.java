package view;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Ex08FindNumber {
	public static void main(String[] args) {
		int[]b = {2,3,5,7,9,12};
		int k = 6;
		int i = 0;
		int j = 5;
		while(i < j) {
			if(b[i] + b[j] == 16) {
				System.out.println((i +1)  + " " + (j +1)) ;
			}
			
			if(b[i] + b[j]  < 16) {
				i+=1;
			}
			else
				j-=1;
			
		}
		
		
	}

}
