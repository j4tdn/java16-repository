
public class Ex02MissingNum {
	public static void main(String[] args) {
		int[] B = { 2, 8, 9, 4, 6, 3, 1, 7, 10 };
		int max = 10;
		for (int number = 1; number < max; number++) {
				for (int i = 0; i < B.length; i++) {
					if (B[i] == number) {
						break;
					}
					if (number == i)
						System.out.println("The number missing is: " + number);
				}
				

			
		}
	}
}
