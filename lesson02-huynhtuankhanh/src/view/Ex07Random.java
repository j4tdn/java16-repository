package view;

public class Ex07Random {

	public static void main(String[] args) {
		random();
	}
	private static void random() {
		int max = 30;
		int min = 20;
		int range = (max - min);
		System.out.print("Random number is: ");
		for (int i = 0; i < 5; i++) {
			double randomDouble = Math.random();
			randomDouble = randomDouble * range + 1;
			int randomInt = 0;
			randomInt = (int ) randomDouble + min;
			System.out.print(randomInt+" ");
		}
	}
}

