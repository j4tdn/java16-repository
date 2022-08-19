package view;

import java.util.Random;

import bean.Car;

public class Ex02CarApp {
    public static void main(String[] args) {
        // Requirement: Create 100 Audi cars with color
        // Colour : Yellow, Blue, Black, Red, White
        Car[] storageCars = new Car[100];
        String[] colors = {"Yellow", "Blue", "White", "Red", "Black"};
        for(int i = 0; i < storageCars.length; i++){
            Car car = new Car(i,  colors[new Random().nextInt(colors.length)]);
            storageCars[i] = car;
        }
        Car.setModel("MG");
    }
}
