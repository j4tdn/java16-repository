package stream;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import model.DataModel;

public class DishDemo {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDish();
		//1.get dishes which have calories > 250
		menu.stream().filter(d ->d.getCalories() > 250).forEach(System.out::println);
		//why we don't store date in stream
		//2. get name of dishes
		List<String> name = menu.stream()
				.map(d -> d.getName())
				.collect(Collectors.toList());
		name.forEach(d -> System.out.print(d + " "));
		System.out.println("\n=================");
		//3.Get name of dishes which veggie food
		menu.stream().filter(d -> FoodCategory.VEGGIE.equals(d.getCategory())).map(d -> d.getName())
		.forEach(d->System.out.println(d));
		//4.sorted a budget map
		Map<String, Integer> budget = DataModel.getBudget();
		budget.entrySet().stream()
		                 .sorted(Comparator.comparing(Entry::getValue))
		                 .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new))
		                 .forEach((k, v) -> System.out.println(k + " " + v));;
				
				
	}
	public static Map<String, Integer> sort(Map<String, Integer> budget){
		Set<Entry<String, Integer>> budgetSet = budget.entrySet();
		List<Entry<String, Integer>> budgetList = new LinkedList<>(budgetSet);
		budgetList.sort(Comparator.comparing(Entry::getValue));
		Map<String , Integer> sorted = new HashMap<>();
		for(Entry<String, Integer> entry : budgetList) {
			sorted.put(entry.getKey(), entry.getValue());
		}
		return sorted;
	}
	

}
