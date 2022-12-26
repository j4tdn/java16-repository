package woking.streams;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import data.structure.stream.Dish;
import model.DataModel;

public class Ex02FilterDistinctByKey {

	public static void main(String[] args) {
		List<Dish> menu = DataModel.GetDishes();
		
		// distinct dishes by calories
		Map<Integer, Dish> rs = menu.stream()
				.collect(Collectors.toMap(
						Dish::getCalories, 
						p->p, 
						(v1, v2)->v1,
						LinkedHashMap::new));
		rs.forEach((k,v) -> System.out.println(k + "  " + v));
		System.out.println("================");
		// distinct By Key
		menu.stream()
			.filter(DistinctByKey(Dish::getCategory))
			.forEach(System.out::println);
		
		
	}
	
	private static <T, R> Predicate<T> DistinctByKey(Function<T, R> func){
		Set<R> setTmp = new HashSet<R>();
		return o -> setTmp.add(func.apply(o));
		
	}

}
