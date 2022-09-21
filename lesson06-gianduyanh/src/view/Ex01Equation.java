package view;

import java.util.Scanner;

public class Ex01Equation {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {	
			System.out.println(equationLv2());
	}
	private static float equationLv2() {
		int a = nextInt("a");
		int b = nextInt("b");
		try {
			if(a == 0) {
				System.out.println("Nhap lai a vi a khong the = 0");
				a = nextInt("a");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (float) -b/a;
	}
	
	private static int nextInt(String text) {
		String numbers = "";
		do {
			System.out.println("enter " + text + " ");
			numbers = sc.nextLine();
			if(numbers.matches("-?\\d+")) {
				break;
			}
		} while (true);
		return Integer.parseInt(numbers);
	}

}
