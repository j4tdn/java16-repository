package homework2;
//Viết chương trình nhập vào một dãy các số nguyên từ bàn phím
//Tìm số lẻ lớn nhất trong dãy số và in ra
public class Ex04 {
	public static void main(String[] args) {
		int [] numbers = {5, 1 ,9, 11, 20, 12, 17, 21, 30};
		System.out.println("max odd: "+ findMaxOddElement(numbers));
	}
	private static int findMaxOddElement(int[] elements) {
		int max = Integer.MIN_VALUE;
		for(int element: elements) {
			if(isOdd(element) && element > max)
				max = element;
		}
		return max;
	}
	private static boolean isOdd(int number) {
		return number % 2 !=0;
	}
}
