package working.streams;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import bean.Warehouse;
import model.DataModel;

public class Ex03Map_FlatMap {
	public static void main(String[] args) {
		/*
		 * public static List<Warehouse> getWhs() {
			return List.of(
					new Warehouse(11, "WH-11", 1, List.of(1, 2, 3, 4 ,5)),
					new Warehouse(12, "WH-12", 1, List.of(6, 7, 8, 9 ,10)),
					new Warehouse(21, "WH-13", 2, List.of(11, 12, 13, 14, 15)),
					new Warehouse(22, "WH-14", 2, List.of(16, 17, 18, 19, 20))
			);
		}
		 */
		
		List<Warehouse> whs = DataModel.getWhs();
		
		// 1. get name of warehouse in the list 'whs'
		System.out.println("1. get name of warehouse in the list 'whs' --> ");
		whs.stream()
			.map(Warehouse::getName)
			.forEach(System.out::println);
		
		// 2. count number of stores of country 2
		System.out.println("2. count number of stones of wh 11");
		whs.stream()
			.filter(wh -> wh.getId() == 11)
			.findFirst()
			.ifPresent(wh ->
				System.out.println("Amout of stones --> " + wh.getStoreIds().size()));
		
		// 3. count number of stores of country 2
		List<Integer> storeOfCountry2 = whs.stream()
			.filter(wh -> wh.getCountryId() == 2)
			.map(wh -> wh.getStoreIds())
			.flatMap(list -> list.stream())
			.collect(Collectors.toList());
		
		System.out.println("Amount --> " + storeOfCountry2.size());
		
		// 4. count number of stores of each country
		whs.stream()
			.collect(Collectors.toMap(
					Warehouse::getCountryId, 
					wh -> wh.getStoreIds().size(),
					(v1, v2) -> v1 + v2,
					LinkedHashMap::new)
			).forEach((k, v) -> System.out.println(k + ", " + v));
		
		whs.stream()
		.collect(Collectors.toMap(
				Warehouse::getCountryId, 
				wh -> wh.getStoreIds(),
				(v1, v2) -> {
					List<Integer> v = new ArrayList<>(v1);
					v.addAll(v2);
					return v;
				},
				LinkedHashMap::new)
		).forEach((k, v) -> System.out.println(k + ", " + v));
	}
}
