package view;

import java.util.Scanner;

public class Ex05MultipleException {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {


		
		System.out.println("X: " + findXLevel2());
		
	}

	private static float findXLevel2()
	{
		int a = nextInt("a");
		int b = nextInt("b");
		
		if(a == 0)
		{
			throw new ArithmeticException("please enter a != 0");
		}
		return (float) -b/a;
	}
	private static int nextInt(String text)
	{
		String numberAsText = "";
		do
		{
			System.out.println("Enter " + text + ": ");
		 numberAsText = sc.nextLine().trim();
			if(numberAsText.matches("-?\\d+"))
			{
				break;
			}
		}
		while(true);
		return Integer.parseInt(numberAsText);
	}
}
