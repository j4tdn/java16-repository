package view;

import java.util.Random;

import bean.Car;

public class Ex02CarApp {
	//yêu cầu tạo 100 mẫu xe Audi với các màu sắc khác nhau.
	//màu sắc :yellow, red ,blue,whirte,Black.
public static void main(String[] args) {
	Random rd = new Random();
	String []colors = {"yellow", "red" ,"blue","whirte","black"};
	Car [ ]cars = new Car[100];
	for(int i=0;i<100;i++) {
		Car car =new Car();
		cars[i]= car;
	}
	
	for(Car car:cars) {
		car.model="mg";
	}
	System.out.println("=======");
	for(Car car:cars) {
		System.out.println(car);
	}
}
}
