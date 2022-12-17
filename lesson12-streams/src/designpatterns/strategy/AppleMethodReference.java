package designpatterns.strategy;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;

import model.DataModel;

public class AppleMethodReference {
	public static void main(String[] args) {
		List<Apple> invetory = DataModel.getApples();
		map(invetory, AppleMethodReference::getStaticWeight).forEach(System.out::println);
	}

	public static Double getStaticWeight(Apple apple) {
		return apple.getWeight();
	}

	private static <T, R> Set<R> map(List<T> elements, Function<T, R> function) {
		Set<R> result = new TreeSet<>();
		elements.forEach(element -> {
			result.add(function.apply(element));
		});
		return result;
	}
}
