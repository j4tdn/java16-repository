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
		
		// (Apple apple) -> apple.getWeight() ---> Apple::getWeight -> non static method
		// (Apple apple) -> apple.getWeight() --> AppleMethodReference::getStaticWeight
		
		map(inventory, AppleMethodReference::getStaticWeight)
			.forEach(System.out::println);
	}
	
	public static Double getStaticWeight(Apple apple) {
		return apple.getWeight();
	}
	
	private static <T, R> Set<R> map(List<T> elements, Function<T, R> function) {
		Set<R> result = new HashSet<>();
		// Apple --> X
		// T -> R
		elements.forEach(element -> {
			// apple.getOriginal()
			// apple.getWeight()
			result.add(function.apply(element));
		});
		
		return result;
	}
}