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

		// (Apple apple) --> apple.getWeight() ----> Apple::getWeight -> non static method
		// (Apple apple) --> apple.getWeight() ----> AppleMethodRefence::getStaticWeight

		map(inventory, AppleMethodReference::getStaticWeight).forEach(System.out::println);
		System.out.println(">>========================<<");
		map(inventory, apple -> apple.getOriginal()).forEach(System.out::println);
	}

	public static Double getStaticWeight(Apple apple) {
		return apple.getWeight();
	}

	private static <T, R> Set<R> map(List<T> elements, Function<T, R> funtion) {
		Set<R> result = new HashSet<>();
		for (T t : elements) {
			result.add(funtion.apply(t));
		}
		return result;
	}
}
