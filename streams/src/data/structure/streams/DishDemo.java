package data.structure.streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import model.DataModel;
import predemo.Transacions;

public class DishDemo {
	public static void main(String[] args) {
		List<Dish> dish = DataModel.getDishes();
		List<Dish> dishrs = dish.stream().filter(d -> d.getCalories() > 250).collect(Collectors.toList());
		dishrs.forEach(System.out::println);

		System.out.println("=============");

		List<String> dishVege = dish.stream().filter(d -> d.getCategory().equals(FoodType.VEGETA)).map(Dish::getName)
				.collect(Collectors.toList());

		printList(dishVege);
		System.out.println("=============");
		Map<String, Integer> sortedMap = DataModel.getBudget().entrySet().stream()// Stream(Entry<k,b>>
				.sorted(Entry.comparingByValue())
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		sortedMap.forEach((k, v) -> System.out.println(k + ", " + v));

	}

	private static <R> Set<R> get(List<Dish> lDish, Function<Dish, R> f) {
		Set<R> set = new LinkedHashSet<R>();
		for (Dish l : lDish) {
			// if ()
		}

		return set;
	}

	private static <E> void printList(List<E> list) {
		for (E element : list) {
			System.out.print(element + ",");
		}
		System.out.println();

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

}
