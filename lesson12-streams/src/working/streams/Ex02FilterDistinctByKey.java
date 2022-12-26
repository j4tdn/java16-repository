package working.streams;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import data.structure.streams.Dish;
import model.DataModel;

public class Ex02FilterDistinctByKey {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();	
		// distinct dishes by calories
		Map<Integer, Dish> result = menu.stream()
				.collect(Collectors.toMap(
						Dish::getCalories,
						Function.identity(),
						(v1, v2) -> v1,
						LinkedHashMap::new)
						);
		
		result.values().forEach(System.out::println);
		
		System.out.println("Opt 2 ----------");
		
		menu.stream()
				.filter(distinctByKey(d -> d.getName()))
				.forEach(System.out::println);
	}
	
	private static <T, R> Predicate<T> distinctByKey(Function<T, R> func){
		Set<R> set = new HashSet<>();
		return d -> set.add(func.apply(d));
		
	}
}
