package designpattern.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import model.DataModel;

/*
 * find green, red, blue & heavier than 150g
 * find apple from Viet Nam
 */

@SuppressWarnings("unused")
public class AppleDemo {
	public static void main(String[] args) {
		
		List<Apple> inventory = DataModel.getApples();
		inventory.forEach(apple -> System.out.println(apple));
		System.out.println("======================");
		filter(inventory, apple -> "green".equals(apple.getColor()))
		      .forEach(apple -> System.out.println(apple));
		
	}
	private static List<Apple> filter(List<Apple> inventory, Predicate<Apple> predicate){
		List<Apple> result = new ArrayList<>();
		for(Apple apple: inventory) {
			if(predicate.test(apple)) {
				result.add(apple);
			}
		}
		return result;
		
	}

}
