package swap.array;

import java.util.Vector;

public class SwapArrayElementbyCondition {
	public static void main(String[] args) {
		int[] arr = { 12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18 };
		processing(arr);
	}

	public static void processing(int[] arr) {
		sevenToBeginning(arr);
		fiveToEnding(arr);
		for (int i : arr)
			System.out.print(i + " ");
	}

	public static void sevenToBeginning(int[] arr) {
		Vector<Integer> divisibleBy7andNot5 = new Vector<Integer>();
		Vector<Integer> notDivisibleBy7andNot5 = new Vector<Integer>();
		for (int i : arr) {
			if (i % 7 == 0 && i % 5 != 0)
				divisibleBy7andNot5.add(i);
			else
				notDivisibleBy7andNot5.add(i);
		}
		divisibleBy7andNot5.addAll(notDivisibleBy7andNot5);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = divisibleBy7andNot5.get(i);
		}
	}

	public static void fiveToEnding(int[] arr) {
		Vector<Integer> divisibleBy5andNot7 = new Vector<Integer>();
		Vector<Integer> notDivisibleBy5andNot7 = new Vector<Integer>();
		for (int i : arr) {
			if (i % 5 == 0 && i % 7 != 0)
				divisibleBy5andNot7.add(i);
			else
				notDivisibleBy5andNot7.add(i);
		}
		notDivisibleBy5andNot7.addAll(divisibleBy5andNot7);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = notDivisibleBy5andNot7.get(i);
		}
	}
}
