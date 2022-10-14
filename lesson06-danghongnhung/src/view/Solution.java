package view;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println(isHappyNumber(number));

	}

	static boolean isHappyNumber(int n) {
		int count = 0;
		while (n != 1) {
			n = happyNumber(n);
			count++;
			if (count > 10)
				return false;
		}
		return true;
	}

	static int happyNumber(int n) {
		int sum = 0;
		while (n != 0) {
			sum += Math.pow((n % 10), 2);
			n /= 10;
		}
		return sum;
	}
}
