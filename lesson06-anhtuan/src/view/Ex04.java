package view;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			do{
				System.out.print("nhap n = ");
				int n = sc.nextInt();
				String s = String.valueOf(n);
				if(s.length() == 1) {
					System.out.println(n + " doc la " + oneNumber(n));
				}
				if(s.length() == 2) {
					System.out.println(n + " doc la " + read2Number(n));
				}
				if(s.length() == 3) {
					System.out.println(n + " doc la " + read3Number(n));
				}
			}while(true);
		}
		
		
		
	}
	private static String oneNumber(int number) {
		switch (number) {
		case 1: {
			return "mot";
		}
		case 2: {
			return "hai";
		}
		case 3: {
			return "ba";
		}
		case 4: {
			return "bon";
		}
		case 5: {
			return "nam";
		}
		case 6: {
			return "sau";
		}
		case 7: {
			return "bay";
		}
		case 8: {
			return "tam";
		}
		case 9: {
			return "chin";
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + number);
		}
	}
	private static String read2Number(int number) {
		String a = "";
		int x = number / 10;
		int y = number % 10;
		if(x == 0) {
			return a = oneNumber(number);
		}
		if(x!=0 && y == 0) {
			return a = oneNumber(x) + " muoi ";
		}
		return a = oneNumber(x) + " muoi " + oneNumber(y);
	}
	private static String read3Number(int number) {
		String a = "";
		int x = number / 100;
		int y = number/10 % 10;
		int z = number - x*100 - y*10;
		if(x == 0) {
			return a = read2Number(number);
		}
		else if(x != 0) {
			if(y == 0 && z != 0) {
			return a = oneNumber(x) + " tram le " +oneNumber(z);
		}
			if(y == 0 && z!=0) {
				return a = oneNumber(x) + " tram ";
			}
			if(y !=0 && z ==0) {
				return a = oneNumber(x) + " tram " + oneNumber(y) + " muoi"; 
			}
			if(y != 0 && z!=0 ) {
				return a = oneNumber(x) + " tram " + oneNumber(y) + " muoi " + oneNumber(z); 
			}
		
	}
		return a;
	
}
}