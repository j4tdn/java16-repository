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
		getDishes(menu, d -> d.getCalories() > 250).forEach(System.out::println);
		// B1. Convert current data structure --> stream
		// B2. Using streams's methods(API) --> .m1() --> stream<X>
		// --> Builder pattern
		// B3. Convert to another data structure for storing
		// Interview: why we don't store data in stream
		List<Dish> dishesWithHighCalories = menu.stream()// Stream<Dish> --> B1
				.filter(d -> d.getCalories() > 250) // Stream<Dish> --> B2
				.collect(Collectors.toList()); // List<Dish> --> B3
		dishesWithHighCalories.forEach(System.out::println);
		System.out.println("===");

		// 2. Get name of dishes
		getNames(menu, Dish::getName).forEach(System.out::println);
		List<String> namesOfDishes = menu.stream().map(Dish::getName).collect(Collectors.toList());
		namesOfDishes.forEach(name -> System.out.print(name + " "));
		System.out.println("\n===");
		// 3. Get name of dishes which is vegetarian food
		menu.stream().filter(d -> d.getCategory() == FoodCategory.VEGETARIAN).map(Dish::getName)
				.forEach(name -> System.out.print(name + " "));
		System.out.println("\n===");
		// 4. Sort a budget map
		// map --> Set<Entry<K, V>> --> List<Entry<K, V>> --> sortByValue -->
		// LinkedHashMap()
//		Map<String, Integer> budget = DataModel.getBudget();
//		budget.forEach((k, v) -> System.out.println(k + ", " + v));

		Map<String, Integer> sortedMap = DataModel.getBudget().entrySet().stream().sorted(Entry.comparingByValue())
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e1, LinkedHashMap::new));
		sortedMap.forEach((k, v) -> System.out.println(k + ", " + v));
	}

	public static Map<String, Integer> sort(Map<String, Integer> budget) {
		List<Entry<String, Integer>> budgetList = new LinkedList<>(budget.entrySet());
		budgetList.sort(Comparator.comparing(e -> e.getValue()));
		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		for (Entry<String, Integer> entry : budgetList)
			sortedMap.put(entry.getKey(), entry.getValue());
		return sortedMap;
	}

	// not use stream --> stream filter
	public static List<Dish> getDishes(List<Dish> menu, Predicate<Dish> predicate) {
		List<Dish> result = new ArrayList<>();
		for (Dish dish : menu)
			if (predicate.test(dish))
				result.add(dish);
		return result;
	}

	// not use stream --> stream map
	public static <R> Set<R> getNames(List<Dish> menu, Function<Dish, R> function) {
		Set<R> result = new LinkedHashSet<>();
		for (Dish dish : menu) {
			// dish --> ...
			result.add(function.apply(dish));
		}
		return result;
	}
}
