package view;

import java.util.Random;

import bean.Car;

public class Ex02CarApp {
	public static void main(String[] args) {
		Random rd = new Random();
		// Mau sac: Yellow, Red, Blue, White, Black
		String[] color = {"Yellow", "Red", "Blue", "White", "Black"};
		Car[] listCar = new Car[100];
		for (int i = 0; i < 100; i++) {
			Car c1 = new Car(color[rd.nextInt(color.length)] ,i);
			listCar[i] = c1;
			//System.out.println(c1);
		}
		for (Car car : listCar) {
			System.out.println(car);
		}
		
		Car.model = "MG";
		System.out.println("After rename");
		for (Car car : listCar) {
			System.out.println(car);
		}
		
		
		
	}
}
