package working.streams;

import model.DataModel;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

import bean.Warehouse;

public class Ex03Map_FlapMap {
	public static void main(String[] args) {
		List<Warehouse> whs = DataModel.getWhs();

		// 1. tìm tên của warehouse
		whs.stream().map(Warehouse::getName).forEach(n -> System.out.println(n));

		// 2. đếm số lượng warehouse 11
		whs.stream().filter(wh -> wh.getId() == 11).findFirst()
				.ifPresent(wh -> System.out.println("Amount of store--> " + wh.getStoreIds().size()));

		// 3. count number of stores of country 2
		List<Integer> storeOfCountry2 = whs.stream().filter(wh -> wh.getCountryId() == 2).map(wh -> wh.getStoreIds())
				.flatMap(list -> list.stream()).collect(Collectors.toList());
		System.out.println("Amount --> " + storeOfCountry2.size());

		// 4. count number of stores of each country
		whs.stream().collect(Collectors.toMap(Warehouse::getCountryId, wh -> wh.getStoreIds(), (v1, v2) -> {
			List<Integer> v = new ArrayList<>(v1);
			v.addAll(v2);
			return v;
		})).forEach((k, v) -> System.out.println());

	}

}