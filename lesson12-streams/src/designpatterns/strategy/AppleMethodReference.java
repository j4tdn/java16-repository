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
		getCountries(inventory)
		.forEach(System.out::println);
		
	}
	
	private static Set<String> getCountries (List<Apple> inventory){
		Set<String> result = new HashSet<>();
		for(Apple apple : inventory) {
			result.add(apple.getOriginal());
		}
		return result;
	}
	
	private static Set<Double> getWeights(List<Apple> inventory){
		Set<Double> result = new HashSet<>();
		for(Apple apple:inventory) {
			result.add(apple.getWeight());
		}
		return result;
	}
	
	private static <T,R> Set<R> map(List<T> elements, Function<T,R> function){
		Set<R> result = new HashSet<>();
		// Apple --> X
		// T-> R
		
		elements.forEach(element ->{
			//apple.getWeight()
			result.add(function.apply(element));
		});
		return result;
	}
	
}
