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

import model.Datamodel;

public class DishDemo {
	public static void main(String[] args) {
		List<Dish> menu = Datamodel.getDishes();
		
		System.out.println("1. get Dishes which calories > 250 ");
		menu.stream().filter(d -> d.getCalories() > 250)
				     .collect(Collectors.toList())
					 .forEach(System.out::println);
		
		System.out.println();
		
		
		//use stream
		System.out.println("2. get name of Dishes");
		menu.stream()
			.map(d -> d.getName())
			.collect(Collectors.toSet()).forEach(name -> System.out.print(name + " "));
		
		//not use stream
		System.out.println();
		getNames(menu, Dish::getName).forEach(name -> System.out.print(name + " "));
		
		//3 get name of dishes which is veggie food
		System.out.println("\n\n" + "3. get name of dishes which is veggie food");
		menu.stream()
			.filter(d -> d.getCatelogy() == FoodCatelogy.VEGGIE)
			.map(d -> d.getName())
			.collect(Collectors.toList())
			.forEach(System.out::println);
		
		//4. Sort a budget map
		// map --> set<entry<k, v>> --> list<entry<k, v>> --> sortByValue --> LinkedHashMap
		System.out.println("\n" + "4. Sort a budget map");
		Datamodel.getBudget().entrySet()
				.stream();
		
			
	}
	
	public static Map<String, Integer> sort(Map<String, Integer> budget) {
		List<Entry<String, Integer>> budgetList = new LinkedList<>(budget.entrySet());
		
		budgetList.sort(Comparator.comparing(Entry::getValue));
		
		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		
		for (Entry<String, Integer> entry: budgetList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		return sortedMap;
	}
	
	public static <R> Set<R> getNames(List<Dish> menu, Function<Dish, R> function) {
		Set<R> result = new HashSet<>();
		for (Dish dish: menu ) {
			result.add(function.apply(dish));
		}
		
		return result;
	}
}
