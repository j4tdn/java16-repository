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
		Map<Integer, Dish> result= menu.stream()     //dish->dish(d->d)
		.collect(Collectors.toMap(Dish::getCalories, Function.identity(),
				(v1,v2)->v1,//tránh trường hợp key trùng nhau--> toMap báo lỗi
				LinkedHashMap::new));
		
		result.values().forEach(t->System.out.println(t));//chỉ in cái Dish
		
		System.out.println();
		//c1: Stream<dish>s2
		//for(d-->s1)
		//s2.add(d);//hashcode(d);equals(d)
		//override lại hàm hashcode vs equals
		
		menu.stream().filter(distingbykey(d->d.getCalories()))
		.forEach(d-> System.out.println(d));
		
		//nếu set add được d.getCalories-->trả về true-->đưa vào stream hiện tại
/*Set<Integer> set=new HashSet<>();
		menu.stream().filter(d->{
	if(set.add(d.getCalories())) {
		return true;
	}
	return false;
})
.forEach(System.out::println);*/
	
	}                                               //hàm điều kiện
	private static <T,R> Predicate<T> distingbykey(Function<T, R> function){
		Set<R> set = new HashSet<>();
		return d-> set.add(function.apply(d));
	}

}
