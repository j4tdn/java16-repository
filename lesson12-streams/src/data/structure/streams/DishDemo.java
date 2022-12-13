package data.structure.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
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
		// B1. Get dishes which have calories > 250
		// convert

		// B2.
		List<Dish> dishesWithHighCalories = menu.stream() // Stream<Dish> --> B1
				.filter(d -> d.getCalories() > 250) // Stream<Dish> --> B2
				.collect(Collectors.toList()); // List<Dish> --> B3

		dishesWithHighCalories.forEach(System.out::println);
		System.out.println("\n\n");
		// 2. Get name of dishes in menu
		getNames(menu, Dish::getName).forEach(name -> System.out.print(name + " "));

		System.out.println();

		Set<String> namesOfDishes = menu.stream() // Stream<Dish>
				.map(d -> d.getName()) // Stream<Dish>
				.collect(Collectors.toSet()); // Set<String> default: HashSet

		namesOfDishes.forEach(name -> System.out.print(name + " "));

		System.out.println("\n\n");

		// 3. Get name of dishes which is veggie food

		menu.stream() // Stream<Dish>
				.filter(d -> FoodCategory.VEGGIE.equals(d.getCategory())) // Stream<Dish>
				.map(Dish::getName) // Stream<String>
				.forEach(name -> System.out.print(name + " "));

		System.out.println("\n\n");
		// 4. Sort a budget map
		// map --> set<entry<k,v>> --> list<entry<k,v>> --> sortByValue -->
		// linkedhashmap
		Map<String, Integer> budget = sort(DataModel.getBudget());
		budget.forEach((k, v) -> System.out.println(k + " " + v));
		;

		System.out.println("-----------");

		Map<String, Integer> sortedMap = DataModel.getBudget().entrySet().stream() // Stream<Entry<k,v>>
				.sorted(Comparator.comparing(Entry::getValue)) // Stream<Entry<k,v>>
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		sortedMap.forEach((k, v) -> System.out.println(k + " " + v));
	}

	public static Map<String, Integer> sort(Map<String, Integer> budget) {
		List<Entry<String, Integer>> budgetList = new LinkedList<>(budget.entrySet());
		budgetList.sort(Comparator.comparing(Entry::getValue));
		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		for (Entry<String, Integer> entry : budgetList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}

	// not use stream --> stream filter
	public static List<Dish> getDishes(List<Dish> menu, Predicate<Dish> predicate) {
		List<Dish> result = new ArrayList<>();
		for (Dish dish : menu) {
			if (predicate.test(dish)) {
				result.add(dish);
			}
		}
		return result;
	}

	public static <R> Set<R> getNames(List<Dish> menu, Function<Dish, R> function) {
		Set<R> result = new LinkedHashSet<>();
		for (Dish dish : menu) {
			// dish --> ...
			result.add(function.apply(dish));
		}
		return result;
	}
}
