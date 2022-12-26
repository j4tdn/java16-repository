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
		List<Warehouse> whs = DataModel.getWhs();

		// 1. Get name of warehouse in the list 'whs'
		whs.stream()
		.map(Warehouse::getName)
		.forEach(System.out::println);
		// 2. Count number of stores of wh 11
         whs.stream()  // Stream<Warehouse>
		.filter(wh -> wh.getId() == 11)
		.findFirst()
		.ifPresent(wh -> System.out.println("Amout of stores --> " + wh.getStoreIds().size()));
		
		// 3. Count number of stores of country 2
         // List.of(11,12,13,14,15)
         // List.of(16,17,18,19,20)
        List<Integer> storeOfCountry2 = whs.stream()
         .filter(wh -> wh.getCountryId() == 2)
         .map(wh -> wh.getStoreIds())       // Stream<List<Integer>>
         .flatMap(list -> list.stream())     // Stream<Integer> --> 11->20
         .collect(Collectors.toList());
		System.out.println("Amount -> " + storeOfCountry2);
		// 4. Count number of stores of each country
		 
        whs.stream()
		.collect(Collectors.toMap(
				Warehouse::getCountryId, wh -> wh.getStoreIds().size(), 
				(v1,v2) -> v1 + v2, LinkedHashMap::new))
		.forEach((k,v) -> System.out.println(k + ", " + v)); 
        
        // C2
        whs.stream()
		.collect(Collectors.toMap(
				Warehouse::getCountryId, wh -> wh.getStoreIds(), 
				(v1,v2) -> {
				    List<Integer> v = new ArrayList<>(v1);
				    v.addAll(v2);
				    return v;
				}, 
				LinkedHashMap::new))
		.forEach((k,v) -> System.out.println(k + ", " + v)); 
		
		
	}
}
