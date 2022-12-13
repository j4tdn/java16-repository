package predemo;

import java.util.Comparator;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import java.util.stream.Collectors;

import data.structure.streams.Dish;
import data.structure.streams.FoodCategory;
import model.DataModel;

public class DishDemo {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishs();
		
		List<Dish> dishByWithCalories = menu.stream().filter(o -> o.getCalories() > 250).collect(Collectors.toList());
		dishByWithCalories.forEach(System.out::println);
		
		Set<String> set = menu.stream()
				.map(o -> o.getName())
				.collect(Collectors.toCollection(LinkedHashSet::new));
		set.forEach(o -> System.out.println(o + " "));
		
		//3 Get name a dishes with is veggie food
		System.out.println(" =========== ");
		menu.stream().filter(o -> o.getCategory() ==  FoodCategory.RAU).map(O -> O.getName()).forEach(O -> System.out.println(O));
		//4. Sort a budget map
		// map --> set<Entry<Key,Value>> --> List . SortByValue --> Map
		Map<String, Integer> budget = sort(DataModel.getBudget());
		budget.forEach((k,v) -> System.out.println(k + " , " + v));
		System.out.println(" ============ ");
		Map<String, Integer> sortedMap = DataModel.getBudget().entrySet()
				.stream().sorted(Entry.comparingByValue())
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1,e2) -> e1, LinkedHashMap::new));
		
		sortedMap.forEach((k,v) -> System.out.println(k + " ," + v));
		
		
	}
	public static Map<String, Integer> sort(Map<String, Integer> budget){
		List<Entry<String, Integer>> budgetList = new LinkedList<>(budget.entrySet());
		
		budgetList.sort(Comparator.comparing(Entry::getValue));
		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		for (Entry<String, Integer> entry : budgetList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
		
	}

}
