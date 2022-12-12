package designpatterns.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import model.DataModel;

/*
 * Find green apples
 * Find red apples
 * Find blue apples and heavier than 150g
 * Find apples from VN
 * 
 * --> boolean behavior(Apple apple) --> strategy method
 * --> implementation will be provided by invoked
 */
public class AppleDemo {

	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		inventory.forEach(apple -> System.out.println(apple));
		
		System.out.println("============================");
		
		
		filter(inventory, apple -> "VN".equals(apple.getOriginal()))
		.forEach(apple -> System.out.println(apple));
	}
	
	private static List<Apple> filter(List<Apple> inventory, Predicate<Apple> predicte) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple: inventory) {
			if (predicte.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
}
