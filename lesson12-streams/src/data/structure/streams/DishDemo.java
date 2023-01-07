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

		// 1. Get dishes with calories > 250
//		C1 : getDishes(menu, dish -> dish.getCalories() > 250).forEach(System.out::println);

//		C2 : 
		// B1: Convert current data structure -> stream
		// List<T>.stream() -> Stream
		// B2: Use stream's methods (api) --> .m1() ; (always return stream)
		// -> Builder pattern
		// B3: Convert to another data structure for storage

		List<Dish> dishesWithHighCalories = menu.stream() // Stream<Dish>
				.filter(dish -> dish.getCalories() > 250) // Stream<Dish>
				.collect(Collectors.toList()); // List<Dish>
		dishesWithHighCalories.forEach(System.out::println);

		// 2. Get name of dishes in menu
//		C1 : getNames(menu, Dish::getName).forEach(System.out::println);	
//		C2 : 
		menu.stream().map(Dish::getName); // still okay

		Set<String> namesOfDishes = menu.stream() // Stream<Dish>
				.map(d -> d.getName()) // Stream<String> (Stream<R>)
				.collect(Collectors.toSet()); // List<Dish>
		namesOfDishes.forEach(System.out::println);

		// 3. Get name of dishes with Veggie food
		menu.stream().filter(d -> d.getCategory().equals(FoodCategory.VEGGIE)).map(Dish::getName)
				.collect(Collectors.toSet()).forEach(System.out::println);
		System.out.println("=========================");
		// 4. Sort a budget map
		// map -> set -> linkedlist -> sortbyvalue -> linkedmap
		Map<String, Integer> budget = DataModel.getBudget();
		Set<Entry<String, Integer>> entries = budget.entrySet();
		entries.stream().sorted(Entry.comparingByValue()) // Stream<Entry>
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e1, LinkedHashMap::new)); // Map<String, Integer>
//		.forEach(System.out::println); // forEach cant be applicable for Map

	}

	// not use stream
	public static List<Dish> getDishes(List<Dish> menu, Predicate<Dish> predicate) {
		List<Dish> res = new ArrayList<Dish>();
		for (Dish dish : menu) {
			if (predicate.test(dish)) {
				res.add(dish);
			}
		}
		return res;
	}

	// not use stream
	public static <R> Set<R> getNames(List<Dish> menu, Function<Dish, R> func) {
		Set<R> res = new LinkedHashSet<>();
		for (Dish dish : menu) {
			res.add(func.apply(dish));
		}
		return res;
	}

	// not use stream
	public static Map<String, Integer> sort(Map<String, Integer> budget, Comparator<Integer> cmp) {
		Set<Entry<String, Integer>> budgetSet = budget.entrySet();
		List<Entry<String, Integer>> budgetList = new LinkedList<>(budgetSet);
		budgetList.sort(Comparator.comparing(e -> e.getValue()));
		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		for (Entry<String, Integer> e : budgetList) {
			sortedMap.put(e.getKey(), e.getValue());
		}
		return sortedMap;
	}
}
