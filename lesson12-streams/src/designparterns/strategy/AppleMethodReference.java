package designparterns.strategy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import model.DataModel;

public class AppleMethodReference {
	public static void main(String[] args) {
		// get list of country from inventory
		List<Apple> inventory = DataModel.getApples();

		map(inventory, AppleMethodReference::getStaticWeight).forEach(System.out::println);
		System.out.println("----------------------------------------------------------");

		map(inventory, apple -> apple.getOriginal()).forEach(System.out::println);
		System.out.println("----------------------------------------------------------");
		map(inventory, apple -> apple.getWeight()).forEach(System.out::println);
	}

	public static Double getStaticWeight(Apple apple) {
		return apple.getWeight();
	}

	private static <T, R> Set<R> map(List<T> elements, Function<T, R> function) {
		Set<R> result = new HashSet<>();
		// Apple
		// T -> R
		for (T t : elements) {
			result.add(function.apply(t));
		}
		return result;
	}
}
