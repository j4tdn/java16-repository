package designpatterns.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import model.DataModel;

/*
 * Find green apples
 * Find red apples
 * Find blue apples and heavier than 150g
 * Find apples form VienNam
 * 
 * boolean behavior (Apple apple) --> Strategy method
 * --> implementation will be provided by invoked 
 */
public class AppleDemo {
	public static void main(String[] args) {

		// Functional interface
		List<Apple> inventory = DataModel.getApples();
		inventory.forEach(apple -> System.out.println(apple));

		System.out.println(">>========================<<");

		filter(inventory, apple -> "green".equals(apple.getColor())).forEach(apple -> System.out.println(apple));
		System.out.println(">>========================<<");

		filter(inventory, apple -> "VietNam".equals(apple.getOriginal())).forEach(apple -> System.out.println(apple));
	}

	// predicate = pa;
	private static List<Apple> filter(List<Apple> inventory, Predicate<Apple> prediccate) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (prediccate.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
}
