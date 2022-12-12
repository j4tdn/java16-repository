package data.structure.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DishDemo {

	public static void main(String[] args) {
		List<Dish> menu = Dish.getDishes();
		getNames(menu, Dish::getName).forEach(name -> System.out.print(name + " "));
		System.out.println();
		Set<String> nameOfDishes = menu.stream()
				.map(d-> d.getName())
				.collect(Collectors.toSet());
		nameOfDishes.forEach(name -> System.out.print(name + " "));
		System.out.println("\n=====================");
		menu.stream()
		.filter(d-> FoodCategory.VEGGIE.equals(d.getCategory()))
		.map(Dish::getName)
		.forEach(name-> System.out.print(name   +" veggie" + " "));
		System.out.println("\n=====================");
//		Map<String, Integer> sortedMap = Dish.getBudget().entrySet()
//				.stream()
//				.sorted(Entry.comparingByValue())
//				.collect(Collectors.toMap(Entry::getKey,Entry::getValue(e1,e2)-> e1, LinkedHashMap::new));
	}

	// not use stream
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
		Set<R> result = new HashSet<>();
		for (Dish dish : menu) {

			result.add(function.apply(dish));
		}
		return result;
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

}
