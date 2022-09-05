package exam04;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumbers {
	public static void main(String[] args) {
        int[] input = { 3, 15, 21, 0, 15, 17, 21 };
        int count = 0;
        int[] output = new int[input.length];
        System.out.println(Arrays.toString(input));
        for (int i = 0; i < input.length; i++) {
            if (isUniqueNumber(input, i) == 1) {
                output[count++] = input[i];
            }
        }
        System.out.println("List after sort");
        sort(output, count);
        for (int i = 0; i < count; i++) {
            System.out.print(output[i] + " ");
        }
    }

    private static int isUniqueNumber(int[] arr, int count) {
        for (int i = 0; i < arr.length; i++) {
            if (count != i && arr[count] == arr[i]) {
                return 0;
            }
        }
        return 1;
    }

    private static void sort(int[] output, int count) {
        int tmp = 0;
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (output[i] > output[j]) {
                    tmp = output[i];
                    output[i] = output[j];
                    output[j] = tmp;
                }
            }
        }
    }
}
