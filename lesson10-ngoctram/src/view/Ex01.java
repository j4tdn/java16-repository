package view;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] arr = new int[] { 7, 8, 8, 8, 6, 2, 5, 1 };
//		removeDuplicatedNumbers(arr);
//		System.out.println(compare2Halfs(arr));
		System.out.println(max3rd(arr));
	}

	private static int[] removeDuplicatedNumbers(int[] input) {
		int[] temp = Arrays.copyOf(input, input.length);
		Arrays.sort(temp);
		int index = 0;
		int[] rs = new int[input.length];
		for (int i = 0; i < temp.length; i++) {
			if (i == 0) {
				if (temp[i] == temp[i + 1]) {
					continue;
				}
			} else if (i == temp.length - 1) {
				if (temp[i] == temp[i - 1]) {
					continue;
				}
			} else if (temp[i] == temp[i - 1] || temp[i] == temp[i + 1]) {
				continue;
			}
			rs[index++] = temp[i];
		}
		return Arrays.copyOfRange(rs, 0, index);
	}

	private static int compare2Halfs(int[] input) {
		int n = input.length;
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < n / 2; i++) {
			sum1 += input[i];
			if (n % 2 == 0) {
				sum2 += input[n / 2 + i];
			} else {
				sum2 += input[n / 2 + 1 + i];
			}
		}
		return (sum2 - sum1) / (n / 2);
	}

	private static int max3rd(int[] input) {
		int[] temp = Arrays.copyOf(input, input.length);
		Arrays.sort(temp);
		int rank = 1;
		int max3 = temp[temp.length - 1];
		for (int i = temp.length - 1; i >= 0; i--) {
			if (rank == 3) break;
			if (max3 > temp[i]) {
				max3 = temp[i];
				rank++;
			}
		}
		return max3;
	}
}
