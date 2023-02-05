package working.streams;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

import data.structure.streams.Dish;
import model.DataModel;

public class Ex02FilterDistinByKey {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishs();
		menu.stream().filter(distinctByKey(o -> o.getCalories())).forEach(o -> System.out.println(o));
	}
	public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
		Set<Object> set = new HashSet<>();
		return t -> set.add(keyExtractor.apply(t)) == true; 	
	}

}
