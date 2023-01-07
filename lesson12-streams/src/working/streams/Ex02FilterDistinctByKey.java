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
//		distinct dishes by calories
		// my way
		Map<Integer, List<Dish> > map = menu.stream().collect(Collectors.groupingBy(d -> (d.getCalories())));
//		map.entrySet().stream().forEach(System.out::println);

		// c1
		Map<Integer, Dish> res = menu.stream()
		.collect(Collectors.toMap(Dish::getCalories, Function.identity(), (v1, v2)->v1, LinkedHashMap::new));
		res.values().forEach(System.out::println);
		System.out.println("================");
		// c2 : use hashcode, equal
		menu.stream().distinct().forEach(System.out::println);
		System.out.println("================");
		// c3 : level up c2
		Set<Integer> set = new HashSet<>();
		menu.stream()
		.filter(d -> set.add(d.getCalories())).forEach(System.out::println);
		System.out.println("================");
		
		
		menu.stream()
		.filter(distinctByKey(Dish::getCalories)).forEach(System.out::println);
		
		
		// distinguish dishes by any key
	}
	
	private static <T, R> Predicate<T> distinctByKey(Function<T, R> func){
		Set<R> set = new HashSet<>();
		return t ->set.add(func.apply(t));
	}
	
}
