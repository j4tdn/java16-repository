package designpatterns.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import model.DataModel;

/*
 * Find green apples 
 * Find red apples 
 * Find blue apples and heavier than 150g
 * Find apples from VietNam
 * 
 * --> boolean behaviour(Apple apple) --> strategy method
 * --> Implementation will be provided by invoked
 * */
public class AppleDemo {
	public static void main(String[] args) {
		// Inteface with 1 function -> Functional Interface -> Lambda Expression
		List<Apple> inventory = DataModel.getApples();
		inventory.forEach(a -> System.out.println(a));
		System.out.println("==============");
		filter(inventory, a -> a != null && "green".equals(a.getColor())).forEach(a -> System.out.println(a));
		System.out.println("==============");
		filter(inventory, a -> a != null && "VietNam".equals(a.getOrigin())).forEach(a -> System.out.println(a));
	}

	private static List<Apple> filter(List<Apple> inventory, Predicate<Apple> behavior) {
		List<Apple> result = new ArrayList<>();
		inventory.forEach(a -> {
			if (behavior.test(a))
				result.add(a);
		});
		return result;
	}
}
