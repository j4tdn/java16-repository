package data.structure.streams;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

import model.DataModel;

public class DishDemo {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		
		//B1. convert current data structure --> stream
		//List<T>.stream() --> Stream<T>
		
		
		
		//B2. using stream's methods(API) --> .m1 --> stream<X>
		// --> builder pattern
		
		//B3 convert to another data structure for toString
		//Interview: why wee don't store data in stream
		// --> 1. Traversable
		// --> 2. Stream : internal
		
		List<Dish> dishesWithHightCalories = menu.stream() //stream<Dish>
			.filter(d -> d.getCalories() > 250)
			.collect(Collectors.toList());
		dishesWithHightCalories.forEach(System.out::println);
		
		//get name of Dishes
		Set<String> nameOfDishes = menu.stream()
			.map(d -> d.getName()) // Stream<String>
			.collect(Collectors.toSet());
		nameOfDishes.forEach(System.out::println);
		
		//get name of dishes which is veggie food
		System.out.println("=========");
		menu.stream()
			.filter(d -> FoodCategory.VEGGIE.equals(d.getCategory()))
			.map(d -> d.getName())
			.collect(Collectors.toSet())
			.forEach(System.out::println);
		
		//4. Sort a budget map
		//map --> set<entry<k,v> --> list<entry<k,v>> --> sortByValue --> linkedHashMap
		Map<String, Integer> budget = sort(DataModel.getBudget());
		budget.forEach((k,v) -> System.out.println(k+" "+v));
		
		System.out.println("=======");
		
		Map<String, Integer> sortedMap = DataModel.getBudget().entrySet()
				.stream()
				.sorted(Entry.comparingByValue())
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue,(e1,e2) -> e1,LinkedHashMap::new));

		sortedMap.forEach((k,v) -> System.out.println(k+" "+v));
	}
	
	public static Map<String, Integer> sort(Map<String, Integer> budget){
		List<Entry<String, Integer>> budgetlist = new LinkedList<>(budget.entrySet());
		
		budgetlist.sort(Comparator.comparing(Entry::getValue));
		
		Map<String, Integer> sortedMap =new LinkedHashMap<>(); 
		
		for(Entry<String, Integer> entry: budgetlist) {
			sortedMap.put(entry.getKey(),entry.getValue());
		}
		
		return sortedMap;
	}
	
	public static <R> Set<R> getNames(List<Dish> menu,Function<Dish, R> function){
		Set<R> result = new HashSet();
		for(Dish dish:menu) {
			result.add(function.apply(dish));
		}
		return result;
	}
}
