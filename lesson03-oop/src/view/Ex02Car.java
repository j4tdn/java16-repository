 package view;

import java.util.Random;

import bean.Car;

public class Ex02Car {
	public static void main(String[] args) {
		Random rd = new Random();
		String[] colors= {"yellow", "Red", "Blue", "White", "Black"};
		Car[] cars = new Car[100];
		Car.model="Audi";
		for (int i = 0; i < cars.length; i ++) {	
			Car car = new Car(i, "Audi", colors[rd.nextInt(colors.length)]);
			cars[i]=car;
			System.out.println(cars[i]);
		}
		Car.model="MG";
		System.out.println("====================================");
		for (Car car: cars) {
			car.model = "MG";
			System.out.println(car);
		}
	}

}
