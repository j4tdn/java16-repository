package designpatterns.strategy;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

import model.DataModel;

public class AppleMethodReference {
	public static void main(String[] args) {
		// get list of country from inventory
		List<Apple> inventory = DataModel.getApples();
		map(inventory, AppleMethodReference::getStaticWeight)
		.forEach(System.out::println);
	}
	public static Double getStaticWeight(Apple apple) {
		return apple.getWeight();
	}

	private static <T,R> Set<R> map(List<T> elements, Function<T, R> function) {
		Set<R> result = new HashSet<>();
		elements.forEach(element -> {
			result.add(function.apply(element));
		});
	return result;
	}
	
	private static Set<String> getWeights(List<Apple> inventory) {
		Set<String> result = new HashSet<>();
		for (Apple apple : inventory) {
			result.add(apple.getWeight());
		}
		return result;
	}
}
