package designpatterns.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import model.DataModel;

/**
 * Find green apples
 * Find red apples
 * Find blue apples and heavier than 150g
 * Find apples from VietNam
 * 
 * --> boolean behavior(Apple apple) --> strategy method
 * --> implementation will be provided by invoked
 */

public class AppleDemo {
	public static void main(String[] args) {
		
		// Functional interface
		List<Apple> inventory = DataModel.getApples();
		inventory.forEach(apple -> System.out.println(apple));
		
		System.out.println(">>======================<<");
		
		filter(inventory, apple -> "green".equals(apple.getColor()))
			.forEach(apple -> System.out.println(apple));
		
		System.out.println(">>======================<<");
		
		filter(inventory, apple -> "VietNam".equals(apple.getOriginal()))
			.forEach(apple -> System.out.println(apple));
		
		
	}
	
	private static List<Apple> filter(List<Apple> inventory, Predicate<Apple> predicate) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (predicate.test(apple)) {
				result.add(apple);
			}
		}
		
		return result;
	}
}
