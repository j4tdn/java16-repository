package designpatterns.strategy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import model.Datamodel;

/*
 * get list country from inventory
 */
public class AppleMethodReference {
	public static void main(String[] args) {
		List<Apple> inventory = Datamodel.getApples();
		//getCountries(inventory).forEach(System.out::println);
		
		//(Apple apple) -> apple.getWeight() --> Apple::getWeight -> non static method
		//(Apple apple) -> apple.getWeight() --> AppleMethodReference::getStaticMethod
		
		map(inventory, AppleMethodReference::getStaticWeight).forEach(System.out::println);
		getWeights(inventory).forEach(System.out::println);
	}
	
	public static Double getStaticWeight(Apple apple) {
		return apple.getWeight();
	}
	private static <T, R> Set<R> map(List<T> elements, Function<T, R> function) {
		Set<R> result = new HashSet<>();
		elements.forEach(element -> {
			result.add(function.apply(element));
		});
		return result;
	}
	
	private static Set<Double> getWeights(List<Apple> inventory) {
		Set<Double> result = new HashSet<>();
		for (Apple apple: inventory) {
			result.add(apple.getWeight());
		}
		return result;	
	}
}
