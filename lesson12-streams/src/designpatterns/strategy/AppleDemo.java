package designpatterns.strategy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import model.DataModel;
/*
 * tìm táo xanh
 * tìm táo đỏ
 * tìm táo xanh và nặng hơn 150g
 * tìm táo từ viet nam
 * input: apple--output: boolean
 * -->boolean behavior(Apple apple) --> strategy method
 * -->implementation will be provide by invoked
 */

public class AppleDemo {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		//Functional interface
		inventory.forEach(apple -> System.out.println(apple));
		//duyệt từng phần tử apple và trả về void
		
		System.out.println("===================================");
		
		filter(inventory, apple -> "green".equals(apple.getColor()))
		.forEach(apple -> System.out.println(apple));
		
		inventory.sort(Comparator.comparing((Apple a)-> a.getColor()));

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
