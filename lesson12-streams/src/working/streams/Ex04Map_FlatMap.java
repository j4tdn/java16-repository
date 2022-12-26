package working.streams;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

import bean.WareHouse;
import model.DataModel;

public class Ex04Map_FlatMap {
	public static void main(String[] args) {
		List<WareHouse> whs = DataModel.getWhs();

		// 1. get name of warehouse in list
		System.out.println("1. get name of warehouse in list --> ");
		whs.stream() // Stream<WareHouse>
				.map(WareHouse::getName) // Stream<String>
				.forEach(System.out::println);

		// 2. count number of store of wh 11
		System.out.println("2. count number of store of wh 11");
		whs.stream().filter(wh -> wh.getId() == 11).findFirst()
				.ifPresent(wh -> System.out.println("Amount of store --> " + wh.getStoreIds().size()));

		// 3. count number of stores of country 2
		System.out.println("3. count number of stores of country 2");
		List<Integer> storeOfCountry2 = whs.stream().filter(wh -> wh.getCountryId() == 2).map(wh -> wh.getStoreIds())
				.flatMap(list -> list.stream()).collect(Collectors.toList());
		System.out.println("Amount --> " + storeOfCountry2.size());

		// 4. count number of stores of each country
		System.out.println("4. count number of stores of each country");
		whs.stream().collect(Collectors.toMap(WareHouse::getCountryId, wh -> wh.getStoreIds().size(),
				(v1, v2) -> v1 + v2, LinkedHashMap::new)).forEach((k, v) -> System.out.println(k + ": " + v));
		
		whs.stream().collect(Collectors.toMap(WareHouse::getCountryId, wh -> wh.getStoreIds(), (v1, v2) -> {
			List<Integer> v = new ArrayList<>(v1);
			v.addAll(v2);
			return v;
		}, LinkedHashMap::new)).forEach((k, v) -> System.out.println(k + ": " + v));
	}
}
