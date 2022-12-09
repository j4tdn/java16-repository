package designpattern.strategy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import model.DataModel;

public class AppleMethodReference {
	public static void main(String[] args) {
		//get list of countries from inventory
		List<Apple> inventory = DataModel.getApples();
		getCountries(inventory).forEach(System.out::println);
	}
	private static Set<String> getCountries(List<Apple> inventory){
		Set<String> result = new HashSet<>();
		for(Apple apple: inventory) {
			result.add(apple.getOriginal());
		}
		return result;
	}

}
