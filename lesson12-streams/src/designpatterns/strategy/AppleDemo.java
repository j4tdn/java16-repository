package designpatterns.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import model.DataModel;

public class AppleDemo {
	/*
	 * Find green apples 
	 * Find red apple 
	 * Find blue apples and heavier than 150g 
	 * Find apples from VN
	 * boolean behavior (Apple apple) -> Strategy method Implementation will be
	 * provide by invoke
	 */
	public static void main(String[] args) {
		// Functional Interface
		List<Apple> inventory = DataModel.getApples();
		inventory.forEach(apple -> System.out.println(apple));	
		// Find green apples
		filter(inventory, apple -> "green".equals(apple.getColor())).forEach(apple -> System.out.println(apple));
		System.out.println("========");
		// Find apples from VN 
		filter(inventory, apple -> "VietNam".equals(apple.getOrigin())).forEach(apple -> System.out.println(apple));
		System.out.println("========");
		// Find blue apples and heavier than 150g 
		filter(inventory, apple ->  "blue".equals(apple.getColor()) && (apple.getWeight() > 150)).forEach(apple -> System.out.println(apple));
		System.out.println("========");
		
		
	}

	private static List<Apple> filter(List<Apple> inventory, Predicate<Apple> predicate) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple: inventory) {
			if (predicate.test(apple)) {
			result.add(apple);	
			}	
		}
		return result;
	}
}
