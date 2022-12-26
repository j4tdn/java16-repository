package working.streams;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import data.structure.streams.Dish;
import model.DataModel;

public class Ex02FilterDistingByKey {
	public static void main(String[] args) {
		List<Dish> menu= DataModel.getDishes();
		
		//distinct dish by calories
		Map<Integer, Dish> result= menu.stream()
		.collect(Collectors.toMap(Dish::getCalories, Function.identity(),
				(v1,v2)->v1,
				LinkedHashMap::new));
		
		result.values().forEach(t->System.out.println(t));
		
		System.out.println();
		
		menu.stream().filter(distingbykey(d->d.getCalories()))
		.forEach(d-> System.out.println(d));
		

	}
	private static <T,R> Predicate<T> distingbykey(Function<T, R> function){
		Set<R> set = new HashSet<>();
		return d-> set.add(function.apply(d));
	}

}
