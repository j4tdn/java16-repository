package homework;

import java.util.Random;

public class Ex07RandomNumber {
	public static void main(String[] args) {
		usingRandomClass();
	}
	public static void usingRandomClass() {
		Random rd = new Random();
		//vong lap in ra 5 so ngau nhien
		for (int i=0; i<5;i++) {
			int ranNum = 20 + rd.nextInt(10);
			System.out.println("Random number is: " + ranNum);
		}
	}
}
