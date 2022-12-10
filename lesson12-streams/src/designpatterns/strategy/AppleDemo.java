package designpatterns.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import model.DataModel;

/*
 * Find green apples
 * Find red apples
 * Find blue apples and heavier than 150g
 * Find apples from VietNam
 * --> boolean behavior(Apple apple)-> strategy method
 * --> implementation will be provided by invoked
 * 
 * Predicate T -> boolean
 * Consumer T -> void
 * Callable<T>, Supplier<T> () -> T
 * Function<T, R> T -> R
 */

public class AppleDemo {
	public static void main(String[] args) {
		
		Runnable r = () -> {};
		Callable<String> c1 = () -> "A";
		Callable<String> c2 = () -> {return "A";};
		Function<Integer, String> f = (Integer i) -> {return "a" + i;};
		
		// Functional interface
		// Lamda là 1 cách viết ngắn gọn để tạo ra 1 cách thể hiện của Funtional interface
		List<Apple> inventory = DataModel.getApples();
		inventory.forEach(apple -> System.out.println(apple));
		
		System.out.println("<<==================>>");
		
		filter(inventory, apple -> "green".equals(apple.getColor()))
		.forEach(apple -> System.out.println(apple));
		
		System.out.println("<<==================>>");

		filter(inventory, apple -> "VietNam".equals(apple.getOriginal()))
		.forEach(apple -> System.out.println(apple));
	}
	
	private static List<Apple> filter(List<Apple> inventory, Predicate<Apple> predicate){
		List<Apple> result = new ArrayList<>();
		for (Apple apple: inventory) {
			if (predicate.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
}	
