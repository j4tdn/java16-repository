package view;

import java.util.Random;

import bean.Car;

public class Ex02CarApp {
	public static void main(String[] args) {
		//Tạo 100 mẫu xe Audi với màu sắc khác nhau
		//yellow, red, blue, white, black
		Random rd = new Random();
		String[] colors = {"Yellow", "Red", "Blue" , "White", "Black"};
		Car[] cars = new Car[100];
		Car.model = "Audi";
		for(int i = 0; i < cars.length; i++) {
			Car car = new Car(i, colors[rd.nextInt(colors.length)]);
			cars[i] = car;
		}
		//Đổi model thành MG
		Car.model = "MG";
		
		System.out.println("=============");
		for(Car car: cars) {
			System.out.println(car);
		}
	}
}
