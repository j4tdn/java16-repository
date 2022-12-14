package saddle_point;

import java.util.*;

public class TestSaddlePoint {
	static int sh, sc;

	public static void main(String[] args) {
		int arr[][] = new int[10][10];
		Input(arr);
		System.out.println();
		Show(arr);
		System.out.println();
		Saddle(arr);
	}

	public static void Input(int arr[][]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap so hang: ");
		sh = input.nextInt();
		System.out.print("Nhap so cot: ");
		sc = input.nextInt();
		for (int i = 0; i < sh; i++) {
			for (int j = 0; j < sc; j++) {
				System.out.print("Nhap phan tu [" + i + " ; " + j + "] = ");
				arr[i][j] = input.nextInt();
			}
		}
	}

	public static void Show(int arr[][]) {
		System.out.println("Hien thi ma tran");
		for (int i = 0; i < sh; i++) {
			for (int j = 0; j < sc; j++) {
				System.out.printf("%d  ", arr[i][j]);
			}
			System.out.println();
		}
	}

	public static void Saddle(int arr[][]) {
		int min;
		int max;
		int n = 0;
		for (int i = 0; i < sh; i++) {

			min = arr[i][0];
			for (int j = 0; j < sc; j++) {
				if (min > arr[i][j]) {
					min = arr[i][j];
					n = j;
				} // kiem tra nho nhat hang
			}
			max = min;
			for (int j = 0; j < sh; j++) {
				if (max < arr[j][n])
					max = arr[j][n]; // kiem tra lon nhat cot
			}
			if (max == min)
				System.out.println("Phan tu yen ngua la: " + max);
		}
	}

}
