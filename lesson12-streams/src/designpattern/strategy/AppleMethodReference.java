package designpattern.strategy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

import model.DataModel;

public class AppleMethodReference {
	public static void main(String[] args) {
		// get list of countries from inventory
		List<Apple> inventory = DataModel.getApples();
		getCountries(inventory).forEach(System.out::println);
		get(inventory, apple -> apple.getColor()).forEach(System.out::println);
		
		
		// apple -> apple.getWeight() --> Apple::getWeight -> non static method
		// apple -> apple.getWeight() --> AppleMethodReference::getStaticWeight -> static method
		get(inventory, AppleMethodReference::getStaticWeight).forEach(System.out::println);
		
	}

	private static Set<String> getCountries(List<Apple> inventory) {
		Set<String> countries = new HashSet<>();
		inventory.forEach(apple -> countries.add(apple.getOrigin()));
		return countries;
	}

	private static <T, R> Set<R> get(List<T> elements, Function<T, R> function) {
		Set<R> rs = new HashSet<>();
//		for (T t : elements) {
//			rs.add(function.apply(t));
//		}
		
		// lambda
		elements.forEach(t -> {
			rs.add(function.apply(t));
		});
		
		return rs;
	}
	
	public static Double getStaticWeight(Apple apple) {
		return apple.getWeight();
	}
	
}
