package view;

import java.util.Random;

import bean.Car;

public class Ex02CarApp {
	public static void main(String[] args) {
		// yeu cau tao 100 mau xe audi voi mau sac khac nhau
		//
		Random rd = new Random();
		Car[] cars = new Car[100];
		String[] colors = { "Yellow", "Red", "Blue", "White", "Black" };
		for (int i = 0; i < cars.length; i++) {
			Car car = new Car(i, colors[rd.nextInt(colors.length)]);
			cars[i] = car;
		}
		cars[2].model = "Mazda";
		//

		System.out.println("=====================");
		for (Car car : cars) {
			System.out.println(car);
		}
	}
}
