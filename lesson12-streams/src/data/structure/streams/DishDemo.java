package data.structure.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
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

		System.out.println("1. Get dishes which have calories > 250");
		// getDishes(menu, d -> d.getCalories() > 250).forEach(System.out::println);
		/*
		 * B1: Covert current data structure -> stream B2: Using streams's methods(API)
		 * --> .m1() --> stream X ->. builder pattern B3: Covert to another data
		 * structure for storing || print data
		 * 
		 */
		List<Dish> dishWithHighColories = menu.stream().filter(d -> d.getCalories() > 250).collect(Collectors.toList());
		dishWithHighColories.forEach(System.out::println);

		System.out.println("\n2. Get name of dishes");
		// getNames(menu, Dish::getName).forEach(System.out::println);
		Set<String> nameofDishes = menu.stream().map(Dish::getName).collect(Collectors.toSet());
		nameofDishes.forEach(System.out::println);

		System.out.println("\n3. Get name of dishes which is veggie food");
		menu.stream()
		.filter(d -> FoodCategory.VAGGIE.equals(d.getCategory()))
		.map(Dish::getName)
		.forEach(name -> System.out.print(name + " "));
		
		System.out.println("\n4. Sort bugget map");
		//map --> set<Entry<k,v>> --> list<Entry<k,v>> -> sortByValue --> LinkHashMap
		Map<String, Integer> butget = sort(DataModel.getBudget());
		butget.forEach((k, v) -> System.out.println(k + " " + v));
		
		Map<String, Integer> sorted = DataModel.getBudget().entrySet()
		.stream() //stream<Entry<k,v>>
		.sorted(Entry.comparingByValue()) //stream<Entry<k,v>>
		.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));//Map<k,v>
		sorted.forEach((k, v) -> System.out.println(k + " " + v));
	}
	
	public static Map<String, Integer> sort( Map<String, Integer> butget){
		Set<Entry<String, Integer>> butgetSet = butget.entrySet();
		List<Entry<String, Integer>> butgetList = new LinkedList<>(butgetSet);
		butgetList.sort(Comparator.comparing(Entry::getValue));
		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		for (Entry<String, Integer> entry : butgetList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
		
	}

	// not user stream --> stream filter
	public static List<Dish> getDishes(List<Dish> menu, Predicate<Dish> predicate) {
		List<Dish> result = new ArrayList<>();
		for (Dish dish : menu) {
			if (predicate.test(dish))
				result.add(dish);
		}
		return result;
	}

	public static <R> Set<R> getNames(List<Dish> menu, Function<Dish, R> fucn) {
		Set<R> result = new LinkedHashSet<>();
		for (Dish dish : menu) {
			result.add(fucn.apply(dish));
		}
		return result;
	}

}
