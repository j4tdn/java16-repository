import java.util.Scanner;

public class Ex05 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Nhập giá trị cần chuyển đổi: ");
		int num = sc.nextInt();	
		System.out.println("Giá trị nhị phân của " + num + " là:");
		convertBinary(num);
	}
	
	private static void convertBinary(int num) {
		int binary[] = new int[50];
		int index = 0;
		while (num > 0) {
			binary[index++] = num % 2;
			num = num / 2;
		}
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
	}

}