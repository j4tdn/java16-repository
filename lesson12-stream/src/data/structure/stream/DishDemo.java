package data.structure.stream;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import model.DataModel;

public class DishDemo {

	public static void main(String[] args) {
		List<Dish> dishes = DataModel.GetDishes();
		
		dishes.stream().filter(o->o.getCalories()>250).forEach(System.out::println);
		
		Set<String> namesOfDishes = dishes.stream().map(Dish::getName).collect(Collectors.toCollection(LinkedHashSet::new));
		namesOfDishes.forEach(o -> System.out.print(o + " "));
		System.out.println("================");
		Set<String> namesOfDishesWithVEGGIE = dishes.stream().filter(o->o.getCategory() == FoodCategogy.VEGGIE).map(Dish::getName).collect(Collectors.toCollection(LinkedHashSet::new));
		namesOfDishesWithVEGGIE.forEach(o -> System.out.print(o + " "));
		System.out.println();
		Map<String, Integer> mapp = DataModel.getMap();
		
		mapp = mapp.entrySet()
				.stream()
				.sorted(Comparator.comparing(Entry::getValue))
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
		
		mapp.forEach((k,v) -> System.out.println(k + " - " + v));
	
	}

}
