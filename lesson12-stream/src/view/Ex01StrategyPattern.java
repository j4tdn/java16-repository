package view;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import bean.Apple;
import model.DataModel;

public class Ex01StrategyPattern {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		
		
		
		List<Apple> rEApples = findApples(inventory, apple -> apple.getColor().contains("red"));
		
		rEApples.forEach(a -> System.out.println(a));
//		rEApples.forEach(new Consumer<Apple>() {
//			
//
//			@Override
//			public void accept(Apple t) {
//				System.out.println(t);
//				
//			}
//
//			
//		});
		
		List<Apple> heavyApple = findApples(inventory,apple -> apple.getWeight()> 300);
		heavyApple.forEach(a ->  System.out.println(a));
	}
	//custom
	private static List<Apple> findApples(List<Apple> inventory, Predicate<Apple> predicate){
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if(predicate.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
	
	//tim theo color
	private static List<Apple> findApples(List<Apple> inventory, String color){
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if(color.equals(apple.getColor())) {
				result.add(apple);
			}
		}
		return result;
	}
	//tim aple theo weight
	private static List<Apple> findApples(List<Apple> inventory, int weight){
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if(apple.getWeight() > weight) {
				result.add(apple);
			}
		}
		return result;
	}

}
