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

		// 1.Get dishes which havae calories > 50
		getDishes(menu, d -> d.getCalories() > 250).forEach(name -> System.out.println(name + " "));
		System.out.println();

		// B1. Convert curren data structure --> stram
		// List<T>.stream()--> Stream<T>

		// B2. Using stream 's method(API) --> .m1() --> stream<X>
		// -->builder pattern

		// B3. Convert to another data structure for storing
		// Interview: Why we don't store data in stream

		List<Dish> dishesWithHighCalories = menu.stream() // Stream<Dish> -->b1
				.filter(d -> d.getCalories() > 250)// Stream<Dish> --> B2
				.collect(Collectors.toList());// List<Dish> -->B3
		dishesWithHighCalories.forEach(System.out::println);

		System.out.println();

		Set<String> namesOfDishes = menu.stream() // Stream<Dish>
				.map(d -> d.getName()) // Stream<String>
				.collect(Collectors.toSet());
		namesOfDishes.forEach(name -> System.out.println(name + ""));

		// 3. Get name of dishes which is veggie food
		menu.stream()// Stream<Dish>
				.filter(d -> FoodCategory.VEGGIE.equals(d.getCategory())) // Stream<Dish>
				.map(Dish::getName) // Stream<String>
				.forEach(name -> System.out.print(name + " ")); // void
		// 4. Sort a budget map
		// map --> set<entry<k,v>> --> list<entry<k,v>> --> sortByValue -->
		// linkedhashmap

		Map<String, Integer> sortedMap = DataModel.getBudget().entrySet().stream()// Stream(Entry<k,b>>
				.sorted(Entry.comparingByValue())
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		sortedMap.forEach((k, v) -> System.out.println(k + ", " + v));
	}

	public static Map<String, Integer> sort(Map<String, Integer> buget) {
		List<Entry<String, Integer>> bugetList = new LinkedList<Map.Entry<String, Integer>>(buget.entrySet());
		bugetList.sort(Comparator.comparing(Entry::getValue));
		Map<String, Integer> sortMap = new LinkedHashMap<String, Integer>();
		for (Entry<String, Integer> entry : bugetList) {
			sortMap.put(entry.getKey(), entry.getValue());
		}
		return sortMap;

	}

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
			result.add(function.apply(dish));
		}
//		dish.forEach(dish -> {
//			result.add(function.apply(dish));
//		});
		return result;
	}
}
