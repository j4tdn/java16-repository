package view;

import java.util.Random;	

import bean.Car;

public class Ex02CarApp {
	public static void mian(String agrs[]) {
		//yêu cầu: tạo 100 mẫu xe Audi với các màu sắc khác nhau
		//Màu sắc: Yellow, Red, Blue, White, Black
		Random rd = new Random();
		String[] colors =  {"yellow", "Red", "Blue", "White", "Black"};	
		for (int i = 1; i <= 100; i++) {
			Car car = new Car(i, colors[rd.nextInt(colors.length)]);
			System.out.println(car);
		}
	}
}
