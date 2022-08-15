package view;

import java.util.Random;

import bean.Car;

public class Ex02CarApp {
	public static void main(String[] args) {
		Random rd = new Random();
		Car[] c = new Car[100];
		Car.setModel("Audi");
		Car.setModel("MG");
		String[] colors = { "Yellow", "Red", "Blue", "White", "Black" };
		for (int i = 0; i < 100; i++) {
			int index = rd.nextInt(5);
			c[i] = new Car(colors[index]);
			System.out.println(c[i]);
		}
	}
}
