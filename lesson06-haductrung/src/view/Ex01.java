package view;

import java.util.Scanner;

public class Ex01 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println(carculater());
	}

		private static float carculater() {
		int a = nextInt("a");
		int b = nextInt("b");
		try {
			if(a == 0) {
				System.out.println("Enter again a");
				a = nextInt("a");
			}
			if(b == 0) {
				System.out.println("Enter again b");
				b = nextInt("b");
			}

			
		} catch (Exception e) {
			e.printStackTrace();
		}

	 return (float)-b/a;

	}
	
	private static int nextInt(String text) {
		String numbers = "";
		do {
			try {
				System.out.println("enter " + text + " ");
				numbers = sc.nextLine();
				if(numbers.matches("-?\\d+")) {
					break;
				}
			} catch (Exception e) {
System.out.println("enter again");
			}

		} while (true);
		return Integer.parseInt(numbers);
	
	}

}