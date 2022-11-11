package homeworks;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int arr1[] = { 7, 2, 6, 7, 4, 9, 8 };

		Arrays.sort(arr1);

		int size1 = remove_Duplicate_Elements(arr1, arr1.length);
System.out.println(Arrays.toString(arr1));
		show_array(arr1, size1);
		print3largest(arr1, size1);
		

	}

	public static int remove_Duplicate_Elements(int arr[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int end = 0;

		for (int i = 1; i < n; ++i) {
			if (arr[i] != arr[end]) {
				++end;
				arr[end] = arr[i];
			}
			if(arr[i]==arr[end]) {
				delete(arr, i);
				delete(arr, end);
			}
			
		}

		return end + 1;

	}

	public static void show_array(int arr[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.print("\n");

	}
	private static int[] delete(int[] a, int k) {
		int[] result = new int[a.length - 1];
		for(int i = 0; i < k; i++) {
			result[i] = a[i];
		}
		for(int i = k; i < result.length ; i++) {
			result[i] = a[i + 1];
		}
		return result;
	}
	private static void print3largest(int arr[], int arr_size) {
        int i;
        if (arr_size < 2) {
            System.out.printf("no value");
            return;
        }
        Arrays.sort(arr);
        for (i = arr_size - 3; i >= 0; i--) {
            if (arr[i] != arr[arr_size - 1] && arr[i] != arr[arr_size - 2]) {
                System.out.printf("Phan tu lon thu 2: " + arr[i]);
                return;
            }
        }
        System.out.printf("no value");
    }
}
	

	

