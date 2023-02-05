package data.structure.streams;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import model.DataModel;

public class DishDemo {

	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();

		// 1. Get dishes which have calories > 250
		List<Dish> dishesWithHightCalories = menu.stream().filter(o -> o.getCalories() > 250)
				.collect(Collectors.toList());
		dishesWithHightCalories.forEach(System.out::println);

		System.out.println("\n\n");

		// 2. Get name of dishes in menu
		Set<String> nameOfDishes = menu.stream() // Stream<Dish>
				.map(d -> d.getName()) // Stream<String>
				.collect(Collectors.toSet());// Set<String> --> HashSet
		nameOfDishes.forEach(name -> System.out.print(name + " "));
		System.out.println("\n");
		getNames(menu, Dish::getName).forEach(name -> System.out.print(name + " "));

		System.out.println("\n\n");

		// 3. Get name of dishes which is veggie food

		Set<String> nameDishesVeggie = menu.stream().filter(o -> FoodCategory.VEGGIE.equals(o.getCategory()))
				.map(d -> d.getName()).collect(Collectors.toSet());
		nameDishesVeggie.forEach(name -> System.out.print(name + " "));

		System.out.println("\n\n");
		
		// 4. Sort a budget map
		
		// map --> set<entry<k,v>> --> list<entry<,b>> --> sortByValue --> linkedHashMap
		// c1
		System.out.println("======cach1 code chay======");
		Map<String, Integer> budget = sort(DataModel.getBudget());
		budget.forEach((k, v) -> System.out.println(k + ", " + v));
		// c2
		System.out.println("======cach2 use stream======");
		Map<String, Integer> sortedMap = DataModel.getBudget().entrySet().stream().sorted(Entry.comparingByValue())
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		sortedMap.forEach((k, v) -> System.out.println(k + ", " + v));

		System.out.println("\n\n");
		
		
		
		
		
		
		
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

	public static <R> Set<R> getNames(List<Dish> menu, Function<Dish, R> function) {
		Set<R> result = new HashSet<>();
		for (Dish dish : menu) {
			result.add(function.apply(dish));
		}
		return result;
	}

}
