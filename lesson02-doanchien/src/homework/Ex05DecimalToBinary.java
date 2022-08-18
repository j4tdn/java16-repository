package homework;

public class Ex05DecimalToBinary {
	public static void main(String[] args) {
		Ex05DecimalToBinary obj = new Ex05DecimalToBinary();
		System.out.println("Gia tri nhi phan cua 124 la : ");
		obj.covertBinary(124);
	}

	public static void covertBinary(int num) {
		int binary[] = new int[40];
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
