package condition.loop;

import java.util.Scanner;

public class Ex06Loop {
	public static void main(String[] args) {
		// 1st --> using for

//	for(int i = 0;i<10;i++)
//	{
//		System.out.print(i + " ");
//	}
//	
//	System.out.println("\n===================");
//	// 2nd --> using while
//	
//	int i =0;
//	while(i < 10)
//	{
//		System.out.print(i + " ");
//		i++;
//	}
//	
//	System.out.println("\n===================");
//		Scanner ip = new Scanner(System.in);
//
//		String numberAsText = " ";
//		int t = 1;
//		do {
//			System.out.print("Enter valid number: ");
//			numberAsText = ip.nextLine();
//			if (numberAsText.matches("\\d+")) {
//				System.out.println("value: " + numberAsText);
//			}
//			t++;
//
//		} while (!numberAsText.matches("\\d+") && t <= 3);

//		String numberAsString = ip.nextLine();
//		int number = Integer.parseInt(numberAsString);
//		System.out.println("value: " + number);
		Scanner sc = new Scanner(System.in);
		String numberAsText = "";
		int t = 0;
		do {
			String wrongTimesAsText = t > 0 ? "(" + t + ")" : "";
			System.out.println("Enter the number" + wrongTimesAsText + ":");
			numberAsText = sc.nextLine();
			if (!numberAsText.matches("\\d+")) {
				t++;
				if (t == 3) {
					System.out.println("Wrong time = 3 ==> EXIT");
					return;
				}
				continue;
			}
			break;

		} while (true);
		int number = Integer.parseInt(numberAsText);
		System.out.println("Value: " + number);
	}
}
