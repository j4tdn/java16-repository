package designpatterns.strategy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
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
		// lamda syntax
		Runnable r = () -> {};
		Callable<String> c1 = () -> "Raul";
		Callable<String> c2 = () -> {return "Raul";};
		Function<Integer, String> f1 = (Integer i) -> {return "Alan " + i;};
		
		// Functional interface
		List<Apple> inventory = DataModel.getApples();
		inventory.forEach(apple -> System.out.println(apple));
		
		// keyExtractor = (A a) -> a.getColor()
		// (c1, c2) ->	c1.getColor().compareTo(c2.getColor());
		
		inventory.sort(Comparator.comparing(Apple::getColor));
		
		System.out.println(">>==============<<");
		
		filter(inventory, apple -> "green".equals(apple.getColor()))
		.forEach(apple -> System.out.println(apple));
		filter(inventory, apple -> "VietNam".equals(apple.getOriginal()))
			.forEach(apple -> System.out.println(apple));
	}
	
	// predicate = apple -> "VietNam".equals(apple.getOriginal());
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