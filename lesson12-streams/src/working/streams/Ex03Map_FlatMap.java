package working.streams;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import bean.WereHouse;
import model.DataModel;

public class Ex03Map_FlatMap {
	public static void main(String[] args) {
		List<WereHouse> whs = DataModel.getWhs();
		
		// 1. get name of warehouse in the list 'whs'
		System.out.println("1. get name of warehouse in the list 'whs'");
		whs.stream()
		.map(WereHouse::getName)
		.forEach(System.out::println);
		
		// 2. count number of store of wh 1
		System.out.println("2. count number of store of wh 1");
		Optional<WereHouse> optWh = whs.stream()
				.filter(wh -> wh.getId() == 11)
				.findFirst();
		if(optWh.isPresent()) {
			WereHouse wh = optWh.get();
			System.out.println("Amount of stores --> " + wh.getStoreIds().size());
		}
		// 3. count number of store of country 2
		
		List<Integer> storeOfCountry2 = whs.stream()
			.filter(wh -> wh.getCountryId() == 2)
			.map(wh -> wh.getStoreIds())
			.flatMap(list -> list.stream())
			.collect(Collectors.toList());
		System.out.println("Amount --> " + storeOfCountry2.size());
		// 4. count number of store of each wh
		System.out.println();
		
	
					
	}
}
