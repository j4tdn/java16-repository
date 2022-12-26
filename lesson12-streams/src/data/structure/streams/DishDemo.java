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
import java.util.stream.Collector;
import java.util.stream.Collectors;

import model.DataModel;

public class DishDemo {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		
		getDisshes(menu, d -> d.getCalories()>250).forEach(t-> System.out.println(t));
		
		//1. Get dishes which have calories>250
		/*
		 * dùng Stream
		 * B1: covert current data structure --> stream
		 * 
		 * B2: Using stream's method(API)-->.m1()-->stream<X>
		 * --> builder pattern
		 * 
		 * B3: convert to another data structure for storing
		 * Interview: why we don't store data in stream
		 * --> 1. traversable once
		 */
		List<Dish> dishWithHighCalories =menu.stream()
				.filter(d->d.getCalories()>250)//lọc điều kiện
				.collect(Collectors.toList());//chuyển stream về list
		dishWithHighCalories.forEach(System.out::println);//in ra
		
		System.out.println("\n\n");
		
		//2. get name of dish in menu // Dish::getName kiểu functional interface: Function
		getName(menu,Dish::getName)//d->d.getName: truyền vào d trả về d.getName
		.forEach(name-> System.out.print(name + " "));
		
		System.out.println("\n");
		
		Set<String> nameOfDish= menu.stream()
				.map(d-> d.getName())//in ra Name của dish(getName trả về kiểu Stream<String>)
				.collect(Collectors.toSet());//Stream convert sang Set<String>-->HashSet
		nameOfDish.forEach(name-> System.out.print(name + " "));
		
		System.out.println("\n\n");

		//3. get name of dishes which is veggie food
		menu.stream()
				.filter(d-> FoodCategory.VEGGIE.equals(d.getCategory()))//chọn tên của VEGGIE
				.map(Dish::getName)
				.forEach(name->System.out.println(name +" "));//không cần lưu thì không cần .collect(Collectors.toSet())
		//4. Sort map bằng value
		//map --> set<entry<k,v>> đưa về list<entry<k,v>> sau đó sortByValue đưa về LinkedHashmap
		Map<String, Integer> budget = sort(DataModel.getBudget());
		budget.forEach((k,v) -> System.out.println(k + "," + v));
		
		//sort tăng dần theo số tiền dùng stream
		
		Map<String, Integer> sortedMap =DataModel.getBudget()
		         .entrySet()//chuyển qua set vì Stream<T> và Map<T,K>
		         .stream()//stream(Entry<K,V)
		         .sorted(Comparator.comparing(e->e.getValue()))//stream(Entry<K,V)
		         .collect(Collectors.toMap(e->e.getKey(), e->e.getValue(),(e1,e2)->e1,LinkedHashMap::new));//chuyển sang Map<K,V>//()->LinkedHashMap
		                                 //Entry::getKey(), Entry::getValue()
		
		sortedMap.forEach((k,v) -> System.out.println(k + "," + v));
		
	}
	private static Map<String, Integer> sort (Map<String, Integer> budget){
		Set<Entry<String, Integer>> budgetSet = budget.entrySet();
		List<Entry<String, Integer>> budgetList = new LinkedList<>(budgetSet);
		budgetList.sort(Comparator.comparing(e->e.getValue()));
		//Comparator.comparing(Entry::getValue)
		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		for(Entry<String, Integer> entry: budgetList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
	public static List<Dish> getDisshes(List<Dish> menu, Predicate<Dish> predicate){
		List<Dish> result = new ArrayList<Dish>();
		for(Dish dish: menu) {
			if(predicate.test(dish)) {
				result.add(dish);
			}
		}
		return result;
	}
	public static<R>Set<R> getName(List<Dish> menu, Function<Dish, R> function){
		Set<R> result = new LinkedHashSet<>();//đúng thứ tự
		//truyền dish trả về t--> truyền t trả về r
		for(Dish dish: menu) {
				result.add(function.apply(dish));
			
		}
		return result;
	}

}
