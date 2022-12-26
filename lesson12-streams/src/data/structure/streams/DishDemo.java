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
		
		// 1.Get dishes which have calories > 250
		
		// B1. Convert current data structure --> stream
		// List<T>.stream ---> Stream<T>
		
		// B2. Using streams's methods(API)
		// --> builder pattern
		
		// B3. Convert to another data structure for storing || print data
		// Interview: Why we don't store data in stream ?
		// --> 1. Traversable once
		
		
		List<Dish> dishesWithHighCalories =  menu.stream() // Stream<Dish> --> B1
			.filter(d -> d.getCalories() > 250) // Stream<Dish> --> B2
			.collect(Collectors.toList()); // List<Dish> --> B3
		dishesWithHighCalories.forEach(System.out::println);
		System.out.println("--------------------------------------------------------------");
		
		Set<String> namesOfDishes = menu.stream()
										.map(d -> d.getName())
										.collect(Collectors.toSet());
		namesOfDishes.forEach(name -> System.out.print(name + " "));
		System.out.println();
		getNames(menu, Dish::getName).forEach(name -> System.out.print(name + " "));
		System.out.println();
		System.out.println("-------------------------------------------------------------------");
		
		// 3. Get name of dishes which is VEGETARIAN food
		menu.stream()
			.filter(d -> FoodCategory.VEGETARIAN.equals(d.getCategory()))
			.map(Dish::getName)
			.collect(Collectors.toSet())
			.forEach(name -> System.out.print(name + " "));
		System.out.println("------------------------------------------------------------------");
		
		// 4.Sort a budget map
		// map --> set<entry<k,v>> --> list<entry<k, v>> --> sortByValue --> LinkedHashMap
		Map<String, Integer> sortedMap = DataModel.getBudget().entrySet()
				.stream()
				.sorted(Entry.comparingByValue())
				.collect(Collectors.toMap(Entry::getKey, 
				 Entry::getValue, (e1, e2) -> e1, 
				 LinkedHashMap::new));
		sortedMap.forEach((k,v) -> System.out.println(k + ", " + v));
	}
	
	
	
	// not use stream -----> stream filter
	public static List<Dish> getDishes(List<Dish> menu, Predicate<Dish> predicate) {
		List<Dish> result = new ArrayList<>();
		for (Dish dish : menu) {
			if (predicate.test(dish)) {
				result.add(dish);
			}
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
	
	private static <R> Set<R> getNames(List<Dish> menu, Function<Dish, R> function) {
		Set<R> result = new LinkedHashSet<>();
		for (Dish dish : menu) {
			result.add(function.apply(dish));
		}
		return result;
	}

}
