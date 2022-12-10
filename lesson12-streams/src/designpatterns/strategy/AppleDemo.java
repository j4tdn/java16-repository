package designpatterns.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import model.DataModel;
/*
 * 
 * -->boolean behavior(Apple apple) --> strategy method
 * -->implementation will be provide by invoked
 */

public class AppleDemo {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		//Functional interface
		inventory.forEach(apple -> System.out.println(apple));
		
		System.out.println("===================================");
		
		filter(inventory, apple -> "green".equals(apple.getColor()))
		.forEach(apple -> System.out.println(apple));

	}
	private static List<Apple> filter(List<Apple> inventory, Predicate<Apple> predicate){
		List<Apple> result= new ArrayList<>();
		for(Apple apple: inventory) {
			if(predicate.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}

}
