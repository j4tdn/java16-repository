package data.structure.streams;

import java.security.KeyStore.Entry;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import model.DataModel;

public class DishDemo {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		List<Dish> dishesWithHighCalories = menu.stream().filter(d -> d.getCalories() > 250)
				.collect(Collectors.toList());
		dishesWithHighCalories.forEach(System.out::println);
		menu.stream().map(d -> d.getName()).collect(Collectors.toSet()).forEach(name -> System.out.println(name + ""));
		// not use stream
		System.out.println();
		getNames(menu, Dish::getName).forEach(name -> System.out.println(name + " "));
		// 3. get name of dishes which is veggie food

		menu.stream() // Stream<Dish>
				.filter(d -> FoodCategory.VEGGIE.equals(d.getCategory())).map(Dish::getName)
				.forEach(name -> System.out.println(name + "")); // void
		// 4. Sort a budget map
		// map --> set<entry<k,v>> --> list<entry<k,v>> --> sortByValue -->
		// linkedhashmap

	}

	public static Map<String, Integer> sort(Map<String, Integer> budget) {
		List<java.util.Map.Entry<String, Integer>> budgetList = new LinkedList<>(budget.entrySet());
		budgetList.sort(Comparator.comparing(java.util.Map.Entry::getValue));
		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		for (java.util.Map.Entry<String, Integer> entry : budgetList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}

	public static <R> Set<R> getNames(List<Dish> menu, Function<Dish, R> function) {
		Set<R> result = new HashSet<>();
		for (Dish dish : menu) {
			result.add(function.apply(dish));

		}
		return result;
	}
}
