package designpatterns.strategy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import model.DataModel;

public class AppleMethodReference {
	public static void main(String[] args) {
    // get list of countries from inventory
		List<Apple> inventory = DataModel.getApples();
		// (Apple apple) -> apple.getOrigin() == Apple::getOrigin --> non-static
		map(inventory, apple -> apple.getOrigin()).forEach(System.out::println);
		// (Apple apple) -> apple.getOrigin() == AppleMethodReference::setStaticWeight  --> static 		
	}
	
	public static Double setStaticWeight(Apple apple) {
		return apple.getWeight();
	}
	
	private static <T, R> Set<R> map(List<T> elements, Function<T, R> function) {
		Set<R> result = new HashSet<>();
		/*
		 for (T t:elements) {
			result.add(function.apply(t));
		}
		return result;
		 */
		elements.forEach(element -> {
			result.add(function.apply(element));
		});
		return result;
	}
}
