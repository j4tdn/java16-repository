package designpatterns.strategy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import model.DataModel;

public class AppleMethodRefererence {
	public static void main(String[] args) {
//		Get list of countries from inventory
		List<Apple> inventory = DataModel.getApples();
		map(inventory, Apple::getWeight).forEach(System.out::println);
		map(inventory, AppleMethodRefererence::getStaticWeight).forEach(System.out::println);
	}

	public static Double getStaticWeight(Apple apple) {
		return apple.getWeight();
	}

	private static <T, R> Set<R> map(List<T> elements, Function<T, R> function) {
		Set<R> result = new HashSet();
		// Apple --> X
		// T --> R
		elements.forEach(element -> {
			result.add(function.apply(element));
		});
		return result;
	}
}
