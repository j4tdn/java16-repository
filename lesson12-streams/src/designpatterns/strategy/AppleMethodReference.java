package designpatterns.strategy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import model.DataModel;

public class AppleMethodReference {
	public static void main(String[] args) {
		//get list of countries from inventory
		List<Apple> inventory= DataModel.getApples();
		
		//getCountry(inventory).forEach(System.out::println);
		// (Apple apple) -> apple.getWeight() ---> Apple::getWeight -> non static method
		getCountry(inventory, apple -> apple.getWeight()).forEach(System.out::println); 
		
		
		getCountry(inventory,AppleMethodReference::getstaticWeight)
		.forEach(System.out::println);//static method
		
	}
	private static<T,R> Set<R> getCountry(List<T> elements,Function<T, R> function){
		Set<R> result = new HashSet<>();
		for(T t : elements) {
			result.add(function.apply(t));
		}
		/*elements.forEach(t->{
			result.add(function.apply(t));
		});*/
		return result;
	}
	//in ra các cân nặng của Apple
	public static Double getstaticWeight(Apple apple) {
		return apple.getWeight()
;	}
	

}
