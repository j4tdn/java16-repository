package designpatterns.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import model.DataModel;

/*
 * Find green apples
 * Find red apples
 * Find blue apples and heavies than 150g 
 * Find apples from VietNam
 * 
 *  --> boolean behavior (Apple apple) --> strategy method
 * --> implementation will be provided by invoked
 * */

public class AppleDemo {

	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		
//		Consumer<Apple> c1 = new Consumer<Apple>() {
//
//			@Override
//			public void accept(Apple apple) {
//				System.out.println(apple);
//				
//			}
//			
//		};
		Consumer<Apple> c1 = apple -> System.out.println(apple);
		inventory.forEach(c1);
		
		System.err.println("==========================");
		
//		Predicate<Apple> pa = new Predicate<Apple>() {
//			public boolean test(Apple apple)
//			{
//				return "green".equals(apple.getColor());
//			}
//		};
		
		filter(inventory, apple -> "green".equals(apple.getColor()))
		.forEach(apple -> System.out.println(apple));
		
		System.out.println("==========================");
		
		filter(inventory, apple -> "VietNam".equals(apple.getOriginal()))
		.forEach(apple -> System.out.println(apple));
	}
	
	private static List<Apple> filter(List<Apple> inventory,Predicate<Apple> predicate)
	{
		List<Apple> result = new ArrayList<>();
		for(Apple apple : inventory)
		{
			if(predicate.test(apple))
			{
				result.add(apple);
			}
		}
		return result;
	}
	

}
