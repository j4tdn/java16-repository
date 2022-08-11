package view;

import java.util.ArrayList;
import java.util.Random;

public class Ex07Random5_Fr20To30_NoRepeat {
	public static void main(String[] args) {
		ArrayList<Integer> result = Random_NoRepeat(20, 30, 5);
		System.out.println("Result:");
		for (Integer i : result)
			System.out.print(i + " ");
	}

	public static ArrayList<Integer> Random_NoRepeat(int from, int to, int n) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Random rd = new Random();
		while (numbers.size() != n) {
			Integer temp = rd.nextInt(to - from) + from;
			if (!numbers.contains(temp))
				numbers.add(temp);
		}
		return numbers;
	}
}
