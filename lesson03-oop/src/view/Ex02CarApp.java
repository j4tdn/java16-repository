package view;
import java.util.Random;

import bean.Car;
public class Ex02CarApp {
	public static void main(String[] args) {
		// Yêu cầu: Tạo 100 mẫu xe Audi với màu sắc khác nhau
		// color : Yellow ,Red, Blue,While ,Black
		Random rd = new Random();
		String[] colors = { "Yellow", "Red", "Blue", "White", "Black" };
		Car[] cars = new Car[100];
		Car.model = "Audi";
		for (int i = 1; i < cars.length;i++) {
			Car car = new Car(colors[rd.nextInt(colors.length)] ,i);
			cars[i] = car;
		}
		
		// Yêu cầu: số lượng car còn lại đổi model thành mg
		Car.model = "md";
		System.out.println("=================");
		for(Car car:cars) {
			System.out.println(car);
		}
	}

}
