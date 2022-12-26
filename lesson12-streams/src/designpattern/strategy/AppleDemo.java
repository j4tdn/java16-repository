package designpattern.strategy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import model.DataModel;

/*
 * Find green apples
 * Find red apples
 * Find blue apples and heavier than 500g
 * Find apples from Vietnam
 * 
 * --> boolean behavior (Apple apple) --> strategy method
 * --> implementation will be provided by invoked
 */
public class AppleDemo {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples(); // inventory = kho = list of apples
//		inventory.forEach(new Consumer<Apple>() {
//
//			@Override
//			public void accept(Apple t) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
		
		// Consumer : Functional interface, it is just a template functional interface
		// => we can create other functional interfaces to use (just care for datatypes of our input and output)
		// Functional interface with 1 function => use Lambda Expression
		
		
		
		// Only Iterable Interface can use method forEach
		// int[] arr = new int[5]; ==> arr can not use method forEach
//		inventory.forEach((apple) -> System.out.println(apple));
		
		//Find green apples
		System.out.println("Green ones:");
//		filter(inventory, new Predicate<Apple>() {
//			
//			@Override
//			public boolean test(Apple t) {
//				// TODO Auto-generated method stub
//				return "green".equals(t.getColor()).forEach(apple -> System.out.println(apple));
//			}
//		});
		
		filter(inventory, (t) -> "green".equals(t.getColor())).forEach(apple -> System.out.println(apple));
		
		//Find blue apples
		System.out.println("Blue ones:");
		filter(inventory, (t) -> "blue".equals(t.getColor())).forEach(apple -> System.out.println(apple));
		inventory.sort(Comparator.comparing(Apple::getWeight));
		
		Runnable r = () -> {};
	}
	
	private static List<Apple> filter(List<Apple> inventory, Predicate<Apple> predicate){
		List<Apple> result = new ArrayList<Apple>();
		for(Apple apple:inventory) {
			if(predicate.test(apple))
				result.add(apple);
		}
		return result;
	}
	
}
