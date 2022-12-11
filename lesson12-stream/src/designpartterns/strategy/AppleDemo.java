package designpartterns.strategy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

import model.DataModel;

/**
 * Find green apples
 * Find red apples
 * Find blue apples and heavier than 150g
 * Find apples form VietNam
 */


public class AppleDemo {

	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		
		inventory.forEach(System.out::println);
		
		System.out.println("=======================");
		
		filterApple(inventory, o -> "green".equals(o.getColor())).forEach(System.out::println);
	}
	
	private static Set<String> getCountries(List<Apple> invent){
		Set<String> rs = new HashSet<String>();
		for (Apple apple : invent) {
			rs.add(apple.getOriginal());
		}
		return rs;
	}
	
	private static List<Apple> filterApple(List<Apple> invent, Predicate<Apple> filter){
		List<Apple> rs = new ArrayList<Apple>();
		for (Apple apple : invent) {
			if(filter.test(apple))
				rs.add(apple);
		}
		return rs;
	}

}
