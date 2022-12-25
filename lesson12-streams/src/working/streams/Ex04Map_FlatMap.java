package working.streams;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

import bean.Warehouse;
import model.DataModel;

public class Ex04Map_FlatMap {
	public static void main(String[] args) {
		List<Warehouse> whs = DataModel.getWhs();
		// get name of warehouse in the list
		whs.stream().map(Warehouse::getName).forEach(System.out::println);
		// 2. Count number of stores in the list 'whs'
		whs.stream().filter(wh -> wh.getId() == 11).findFirst()
				.ifPresent(wh -> System.out.println("Amount of strores: " + wh.getStoreIds().size()));
		// 3. Count number of stores of country 2
		System.out.println("Amount of stores (country 2): " + whs.stream().filter(wh -> wh.getCountryId() == 2)
				.map(wh -> wh.getStoreIds().size()).reduce(0, (s1, s2) -> s1 + s2));
		List<Integer> storeOfCountry2 = whs.stream().filter(wh -> wh.getCountryId() == 2).map(wh -> wh.getStoreIds())
				.flatMap(list -> list.stream()).collect(Collectors.toList());
		System.out.println("Amount --> " + storeOfCountry2.size());
		// 4. Count number of stores of each country
		whs.stream().collect(Collectors.toMap(Warehouse::getCountryId, wh -> wh.getStoreIds().size(),
				(v1, v2) -> v1 + v2, LinkedHashMap::new)).forEach((k, v) -> System.out.println(k + ":" + v));
		whs.stream().collect(Collectors.toMap(Warehouse::getCountryId, wh -> wh.getStoreIds(), (v1, v2) -> {
			List<Integer> v = new ArrayList<>(v1);
			v.addAll(v2);
			return v;
		}, LinkedHashMap::new)).forEach((k, v) -> System.out.println(k + ":" + v));

	}
}
