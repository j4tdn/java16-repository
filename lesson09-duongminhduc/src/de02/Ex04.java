package de02;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {

		String s =  "xyz";
		
		
	}
	public static void permutation(String s)
	{
		 char[]ch = s.toCharArray();
		for(int i = 0;i < ch.length-1;i++)
		{
			for(int j = 0 ; j <ch.length;j++)
			{
				swapArray(ch, i, j);
			}
		}
	}
	public static  void swapArray(char arr[], int i, int j){
	        char temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }
}
