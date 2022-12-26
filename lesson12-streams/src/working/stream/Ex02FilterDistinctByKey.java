package working.stream;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


import model.DataModel;
import stream.Dish;

public class Ex02FilterDistinctByKey {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDish();
		
		// distinct dishes by calories
		Map<Integer, Dish> result = menu.stream()
		.collect(Collectors.toMap(
				Dish::getCalories, 
				Function.identity(),
				(v1, v2) -> v1,
				LinkedHashMap::new)
		);
		
		result.values().forEach(System.out::println);
		
		System.out.println("Otp2 --> ...");
		
		// set: 120, 360, 880, 970,...
		// stream: d1, d2, d3, d5,...
		
		menu.stream()
		.filter(distinctByKey(Dish::getName))
		.forEach(System.out::println);
	}
	
	public static <T, R> Predicate<T> distinctByKey(Function<T, R> function ) {
		Set<R> set = new HashSet<>();
		return d -> set.add(function.apply(d));
	}
}
