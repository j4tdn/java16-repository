package exercise;

import java.util.Random;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		int count = 0;
		String[] text = {};
		do {
			System.out.print("nhap vao` khoang muon Rand(Eg:20 30) :");
			Scanner ip = new Scanner(System.in);
			text = ip.nextLine().split(" ");
		}while(text.length<2 || text.length>2);
		
		int start = 0;
		int end = 0;
		if(Integer.parseInt(text[0]) < Integer.parseInt(text[1])) {
			start = Integer.parseInt(text[0]);
			end = Integer.parseInt(text[1]);
		}else {
			start = Integer.parseInt(text[1]);
			end = Integer.parseInt(text[0]);
		}
		
		int[] rsArr = new int[5];
		while(count<=4) {
			int tmp =  randomRange(start, end);
			if(!contains(rsArr, tmp)) {
				rsArr[count] = tmp;
				count++;
			}else continue;
		}
		
		System.out.print("Result : ");
		for (int i : rsArr) {
			System.out.print(i + " ");
		}
	}
	
	private static boolean contains(int[] arr, int number) {
		for (int i : arr) {
			if(i == number) return true;
		}
		return false;
	}
	
	private static int randomRange(int start, int end) {
		Random rd = new Random();
		int rs = start + rd.nextInt((end-start) + 1);
		return rs;
	}

}
