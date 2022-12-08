package designpattern.strategy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

import model.DataModel;

public class AppleMethodReference {
	public static void main(String[] args) {
		// get list contries from inventory
		List<Apple> inventory = DataModel.getApples();
		getContries(inventory, apple -> apple.getOriginal() ).forEach(o -> System.out.println(o));
		inventory.stream().map(o -> o.getColor()).forEach(System.out::println);
	}
	
	private static <T, R> Set<R> getContries(List<T> elements, Function<T, R> function){
		Set<R> rs = new HashSet<>();
		for (T t : elements) {
			
			rs.add(function.apply(t));
		}
		return rs;
		
	}

}
