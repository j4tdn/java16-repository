package working.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import bean.Warehouse;
import model.DataModel;

public class Ex03Map_FlatMap {
	public static void main(String[] args) {
		List<Warehouse> whs = DataModel.getWhs();

		// 1. get names of warehouses in the list of whs
		System.out.println("1. get names of warehouses in the list of whs");
		whs.stream().map(Warehouse::getName).forEach(System.out::println);

		// 2. count number of stores of wh 11
		System.out.println("2. count number of stores of wh 1");
		whs.stream().filter(wh -> wh.getId() == 11).findFirst()
				.ifPresent(wh -> System.out.println(wh.getStoreIds().size()));

		// 3. count number of stores of country 2
		System.out.println("3. count number of stores of country 2");
		List<Integer> storeOfCountry2 = whs.stream().filter(wh -> wh.getCountryId() == 2).map(wh -> wh.getStoreIds())
				.flatMap(list -> list.stream()).collect(Collectors.toList());
		System.out.println(storeOfCountry2.size());

		// 4. count number of stores of each country
		System.out.println("4. count number of stores of each country");
		whs.stream()
		.collect(Collectors.toMap(Warehouse::getCountryId,
				wh -> wh.getStoreIds().size(), (v1, v2) -> v1 + v2, LinkedHashMap::new))
		.forEach((k,v) -> System.out.println(k + ") " + v));
				
	}
}
