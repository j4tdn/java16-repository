package working.streams;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import bean.Warehouse;
import model.DataModel;

public class Ex03Map_FlatMap {
	public static void main(String[] args) {
		// Stream<Collection<T>> --> Stream<T> --> use flatMap
		// Stream<T>[] --> Stream<T>
		
		/*
			new Warehouse(11, "WH-11", 1, List.of(2,3,4,5)),
			new Warehouse(12, "WH-12", 1, List.of(6,7,8,9,10)),
			new Warehouse(21, "WH-21", 2, List.of(11,12,13,14,15)),
			new Warehouse(22, "WH-22", 2, List.of(16,17,18,19,20))
		 */
		
		List<Warehouse> whs = DataModel.getWhs();
		
		// 1. get name of warehouse in the list "whs"
		System.out.println("1. get name of warehouse in the list 'whs'");
		whs.stream() // Stream<Warehouse>
			.map(Warehouse::getName) // Stream<String>
			.forEach(System.out::println);
		
		// 2. count number of stores of wh 11
		System.out.println("2. count number of stores of wh 11");
		whs.stream()
			.filter(w -> w.getId() == 11)
			.findFirst()
			.ifPresent(w -> System.out.println("amount of stores --> " + w.getStoredIds().size()));
		/*
		 * wh11, null --> NPE
		 */
		
		// 3. count number of stores of country 2
		System.out.println("3. count number of stores of country 2");
		List<Integer> storeOfCountry2 = whs.stream()
			.filter(w -> w.getCountryId() == 2) // Stream<Warehouse>
			.map(w -> w.getStoredIds()) // Stream<List<Integer>>
			.flatMap(list -> list.stream()) // Stream<Integer>
			.collect(Collectors.toList());
		System.out.println("amount --> " + storeOfCountry2.size());
		
		// 4. count number of stores of each country
		System.out.println("4. count number of stores of each country");
		whs.stream()
			.collect(Collectors.toMap(
					Warehouse::getCountryId, 
					w -> w.getStoredIds(),
					(v1,v2) -> {
						List<Integer> v = new ArrayList<>(v1);
						v.addAll(v2);
						return v;
					},
					LinkedHashMap::new))
			.forEach((k, v) -> System.out.println(k + ", " + v.size()));
			
		
	}
}
