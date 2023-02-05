package working.streams;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import data.structure.streams.Dish;
import model.Datamodel;

public class Ex02FilterDistinctByKey {
	public static void main(String[] args) {
		List<Dish> menu = Datamodel.getDishes();
		
		//  distinct dishes by calories
		Map<Integer, Dish> result = menu.stream().collect(
				Collectors.toMap(Dish::getCalories, 
						Function.identity(), 
						(v1, v2) -> v1,
						LinkedHashMap::new)
				);
		result.values().forEach(System.out::println);
	}
}
