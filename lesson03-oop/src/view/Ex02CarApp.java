package view;

import java.util.Random;

import bean.Car;

public class Ex02CarApp {

	public static void main(String[] args) {
		// Tao 100 mau xe Audi voi mau khac nhau
		Random rd = new Random();
		String[] color = {"Yellow", "Red", "Blue", "White", "Black"};
		Car[] cars = new Car[100];
		for(int i=0; i < cars.length; i++) {
			Car car = new Car(i , color[rd.nextInt(color.length)]);
			cars[i] = car;
		}
		
		Car.model = "MG";
		
		System.out.println("=============");
		for(Car car: cars) {
			System.out.println(car);
		}
	}

}
