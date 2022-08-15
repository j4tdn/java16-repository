package view;

import java.util.Random;

import bean.Car;

public class Ex02CarApp {

	public static void main(String[] args) {
		Random rd = new Random();
		String[] colors = { "Yellow", "Red", "Blue", "White", "Black" };
		Car[] cars = new Car[100];
		Car.model = "Audi";
		
		for (int i = 0; i < cars.length; i++) {
			Car car = new Car(i, colors[rd.nextInt(colors.length)]);
			System.out.println(car);
			cars[i] = car;
		}
		
		Car.model = "MG";
		
		for (Car car : cars) {
			System.out.println(car);
		}

	}

}
