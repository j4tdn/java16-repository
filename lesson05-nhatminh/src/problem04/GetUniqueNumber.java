package problem04;

import java.util.Arrays;
import java.util.Vector;

public class GetUniqueNumber {
	public static void main(String[] args) {
//		int[] arr = { 3, 15, 21, 0, 15, 17, 21 };
		int[] arr = { 2, 3, 4, 5, 6, 7, 2, 3, 5, 7, 8 };
		int[] results = getUniqueNumbers(arr);
		for (int i = 0; i < results.length; i++) {
			if (i != results.length - 1)
				System.out.print(results[i] + ", ");
			else
				System.out.print(results[i]);
		}
	}

	public static int[] getUniqueNumbers(int[] arr) {
		int[] unique = Arrays.stream(arr).distinct().toArray();
		// Element with count == 1 will be added to vector
		Vector<Integer> vt = new Vector<>();
		for (int i : unique) {
			int count = 0;
			for (int j : arr) {
				if (i == j)
					count++;
			}
			if (count == 1)
				vt.add(i);
		}
		// Convert back to int[]
		int[] results = new int[vt.size()];
		for (int i = 0; i < vt.size(); i++)
			results[i] = vt.get(i);
		return results;
	}
}
