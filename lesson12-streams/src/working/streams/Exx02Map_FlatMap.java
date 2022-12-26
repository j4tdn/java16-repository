package working.streams;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import bean.WareHouse;
import model.DataModel;

public class Exx02Map_FlatMap {
	public static void main(String[] args) {
		List<WareHouse> whs = DataModel.getWhs();
		// 1. get name of warehouse stores off wh 1
		System.out.println("1. get name of warehouse stores off wh 1");
		whs.stream() // Stream<WareHouse>
				.map(WareHouse::getName) // stream<String>
				.forEach(System.out::println);

		// 2. count number of stores of wh 11
		System.out.println("2. Count number of stores wh 1");
		whs.stream().filter(wh -> wh.getId() == 11) // Stream<WareHouse>
				.findFirst().ifPresent(wh -> System.out.println("Amount of stores --> " + wh.getStoreIds().size()));

		// 3. count number of stores of country 2
		// new WareHouse(21, "WH-13", 2, List.of(11, 12, 13, 14, 15)),
		// new WareHouse(22, "WH-14", 2, List.of(16, 17, 18, 19, 20))
		// List.of(11, 12, 13, 14, 15)
		// List.of(16, 17, 18, 19, 20)
		System.out.println("3. Count number of stores of country 2");
		List<Integer> storeOfCountry2 = whs.stream().filter(wh -> wh.getCountryId() == 2)// Stream<WareHouse>
				.map(wh -> wh.getStoreIds())// Stream<List<Integer>>
				.flatMap(list -> list.stream()) // Stream<Integer> --> 11-20
				.collect(Collectors.toList());
		System.out.println("Amount: " + storeOfCountry2.size());

		// 4. count number of stores of each wh
		// 1-9
		// 2-10
		System.out.println("4. Count number of stores of each wh");
		whs.stream().collect(Collectors.toMap(WareHouse::getCountryId, wh -> wh.getStoreIds().size(),
				(v1, v2) -> v1 + v2, LinkedHashMap::new)).forEach((k, v) -> System.out.println(k + ", " + v));

		whs.stream().collect(Collectors.toMap(WareHouse::getCountryId, wh -> wh.getStoreIds(), (v1, v2) -> {
			List<Integer> v = new ArrayList<>(v1);
			v.addAll(v2);
			return v;
		}, LinkedHashMap::new)).forEach((k, v) -> System.out.println(k + ", " + v));

	}

}
