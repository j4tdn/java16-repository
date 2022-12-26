package working.streams;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

import bean.Warehouse;
import model.DataModel;

public class Ex03Map_FlatMap {
	public static void main(String[] args) {
		// Stream<Collection<T>> --> Stream<T>
		// Stream<T[]> --> 
		/**
		 * new Warehouse(11, "WH-11", 1, List.of(1, 2, 3, 4, 5)), new Warehouse(12,
		 * "WH-12", 1, List.of(6, 7, 8, 9, 10)), new Warehouse(13, "WH-21", 2,
		 * List.of(11, 12, 13, 14, 15)), new Warehouse(14, "WH-22", 2, List.of(16, 17,
		 * 18, 19, 20))
		 */
		List<Warehouse> whs = DataModel.getWhs();

		// 1. get name of warehouse in the list 'whs'
		System.out.println("1. get name of warehouse in the list 'whs' --> ");
		whs.stream() // Stream<WareHouse>
				.map(Warehouse::getName) // Stream<String>
				.forEach(System.out::println);

		// 2. count number of stores of wh 11
		System.out.println("2. count number of stores of wh 11");
		whs.stream().filter(wh -> wh.getId() == 11) // Stream<WareHouse>
				.distinct().findFirst()
				.ifPresent(wh -> System.out.println("Amount of stores --> " + wh.getStoreIds().size()));

		// 3. count number of stores of country 2
		System.out.println("3. count number of stores of country 2");
		List<Integer> storeOfCountry2 = whs.stream().filter(wh -> wh.getCountryId() == 2) // Stream<Warehouse>
				.map(wh -> wh.getStoreIds()) // Stream<List<Integer>>
				.flatMap(List -> List.stream()) // Stream<Integer> --> 11 -> 20
				.collect(Collectors.toList());
		System.out.println("Amount --> " + storeOfCountry2.size());

		// 4. count number of stores of each country
		System.out.println("4. count number of stores of each country");
		whs.stream().collect(Collectors.toMap(Warehouse::getCountryId, wh -> wh.getStoreIds().size(),
				(v1, v2) -> v1 + v2, LinkedHashMap::new)).forEach((k, v) -> System.out.println(k + ", " + v));
		System.out.println("--------------------------------------------------------------------------------------");
		
		System.out.println("4. count number of stores of each country");
		whs.stream().collect(Collectors.toMap
				(Warehouse::getCountryId, 
				 wh -> wh.getStoreIds(),
				 (v1, v2) -> {
					List<Integer> v = new ArrayList<>(v1);
					v.addAll(v2);
					return v;
				},
				LinkedHashMap::new)
			).forEach((k,v) -> System.out.println(k + ", " + v.size()));

	}

}
