package data.structure.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import model.DataModel;

public class DishDemo {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		
		// 1. Get dishes which have calories > 250
		// List<T>.stream() --> Stream<T>
		
		
		// B1. Convert current data structure --> stream
		
		// B2. Using stream's methods(API) --> .m1() --> stream<X>
		// --> builder pattern
		
		// B3. Convert to another data structure for storing
		
		// Interview: why we don't store data in stream
		// --> 1. Traversable once
		
		List<Dish> dishesWithHighCalories = menu.stream()// Stream<Dish> --> B1
		.filter(d -> d.getCalories() > 250) // --> B2
		.collect(Collectors.toList()); // --> B3
		dishesWithHighCalories.forEach(System.out::println);
		System.out.println("\n\n");
		
		// 2. Get names of dishes in menu
		getNames(menu, Dish::getName).forEach(name -> System.out.print(name + " "));
		
		System.out.println();
		
		Set<String> namesOfDish = menu.stream() // Stream<Dish>
			.map(Dish::getName)					// Stream<String>
			.collect(Collectors.toSet()); // Set<String> --> HashSet
		namesOfDish.forEach(name -> System.out.print(name + " "));
		
		System.out.println();
		
		// 3. Get name of dishes which is veggie food
		Set<String> namesOfVeggieDish = menu.stream()
				.filter(d -> FoodCategory.VEGGIE.equals(d.getCategory()))
				.map(Dish::getName)
				.collect(Collectors.toSet());
		namesOfVeggieDish.forEach(name -> System.out.println(name + " "));
		
		// 4. Sort a budget map
		// map -> set<entry<k, v>> --> list<entry<k, v>> --> sortByValue --> linkedHashMap
		
		Map<String, Integer> budget = sort(DataModel.getBudget());
		budget.forEach((k,v) -> System.out.println(k + ", " + v));
		
		System.out.println("--------");
		
		Map<String, Integer> sortedMap = DataModel.getBudget().entrySet()
				.stream() // Stream<Entry<K, V>>
				.sorted(Entry.comparingByValue())
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
	}
	
	public static Map<String, Integer> sort(Map<String, Integer> budget) {
		List<Entry<String, Integer>> budgetList = new LinkedList<>(budget.entrySet());
		
		budgetList.sort(Comparator.comparing(t -> t.getValue()));
		
		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		
		for (Entry<String, Integer> entry: budgetList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		return sortedMap;
	}
	
	// not use stream
	public static List<Dish> getDishes(List<Dish> menu, Predicate<Dish> predicate) {
		List<Dish> result = new ArrayList<>();
		for (Dish dish: menu) {
			if (predicate.test(dish)) {
				result.add(dish);
			}
		}
		return result;
	}
	
	public static <R> Set<R> getNames(List<Dish> menu, Function<Dish, R> function) {
		Set<R> result = new LinkedHashSet<>();
		for (Dish dish: menu) {
			
			result.add(function.apply(dish));
		}
		return result;
	}
}
