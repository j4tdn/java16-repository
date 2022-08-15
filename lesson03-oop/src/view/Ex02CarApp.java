package view;

import java.util.Random;

import bean.Car;

public class Ex02CarApp {

	public static void main(String[] args) {
		Random rd = new Random();
		String[] colors = { "yello", "red", "blue", "white", "black" };
		Car[] cars = new Car[100];
		for (int i = 0; i < 100; i++) {
			Car car = new Car(i,  colors[rd.nextInt(colors.length)]);
			System.out.println(car);
			cars[i] = car;

		}
		System.out.println("===after name===");
		for (Car car : cars) {
			Car.model = "MG";
			System.out.println(car);

		}
		
	    
		System.out.println("===after name===");
		for (Car car : cars) {
			car.color = "blue";
			cars[3].setColor("silver");
			System.out.println(car);

		}
		

	}

}
