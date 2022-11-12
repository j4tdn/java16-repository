package view;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		int number;
		ArrayList<Integer> arrListNumber = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.print("Nhập phần tử thứ " + i + ": ");
			number = scanner.nextInt();
			arrListNumber.add(number);
		}

		// tạo 1 ArrayList arrTemp
		ArrayList<Integer> arrTemp = new ArrayList<>();

		// thêm các phần tử của arrListNumber vào arrTemp
		// nếu trong arrTemp đã tồn tại phần tử giống trong arrListNumber
		// thì không thêm vào, ngược lại thêm bình thường
		for (int i = 0; i < arrListNumber.size(); i++) {
			if (!arrTemp.contains(arrListNumber.get(i))) {
				arrTemp.add(arrListNumber.get(i));
			}
		}

		// xóa các phần tử của arrListNumber
		arrListNumber.clear();

		// thêm tất cả các phần tử của arrTemp vào arrListNumber
		// lúc này ta sẽ có 1 ArrayList arrListNumber
		// không chứa các phần tử trùng nhau
		arrListNumber.addAll(arrTemp);

		System.out.println("Các phần tử có trong arrListNumber là: ");
		System.out.println(arrListNumber);
	}
}
