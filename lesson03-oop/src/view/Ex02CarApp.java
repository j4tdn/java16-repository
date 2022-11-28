package view;

import java.util.Random;

import bean.Car;

public class Ex02CarApp {
	public static void main(String[] args) {
		//yêu cầu tạo 100 mẫu xe audi với màu sắc khác nhau
		//Màu sắc: Yellow,Red,Blue,White,Black
		Random rd = new Random();
		String[] color = {"Yellow","Red","Blue","White","Black"};
		Car[] cars = new Car[100];
		Car.module="Aud";
		for(int i=0;i<cars.length;i++) {
			Car car = new Car(color[rd.nextInt(color.length)],i+1);
			cars[i]=car;
		}
		
		//yêu cầu số lượng xe còn lại thành MG
		Car.module="MG";
		for(Car car:cars) {
			System.out.println(car);
		}
	}
}
