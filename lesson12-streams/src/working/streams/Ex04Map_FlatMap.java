package working.streams;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

import bean.Warehouse;
import model.DataModel;

public class Ex04Map_FlatMap {
public static void main(String[] args) {
	/*
	 			new Warehouse(11, "WH-11",1, List.of(1,2,3,4,5)),
				new Warehouse(12, "WH-12",1, List.of(6,7,8,9,10)),
				new Warehouse(13, "WH-13",2, List.of(11,12,13,14,15)),
				new Warehouse(14, "WH-14",2, List.of(16,17,18,19,20))
	 */
	List<Warehouse> whs = DataModel.getWhs();
	
	//1. get name of warehouse in the list 'whs'
	System.out.println("1. get name of warehouse in the list 'whs' -->");
	whs.stream()
	.map(Warehouse::getName)
	.forEach(System.out::println);
	
	//2. count numbers of stores of wh 1
	System.out.println("2. count numbers of stores of wh 1");
	whs.stream()
	.filter(wh -> wh.getId() == 11)
	.findFirst()
	.ifPresent(wh ->
	System.out.println("Amount of stores -->" + wh.getStoreIds().size()));
	
	//3. count numbers of stores country 2
	System.out.println("3. count numbers of stores country 2");
	List<Integer> storeOfCountry2 = whs.stream()
	.filter(wh -> wh.getCountryId() ==2)
	.map(wh -> wh.getStoreIds())
	.flatMap(list -> list.stream())
	.collect(Collectors.toList());
	System.out.println("Amount --> "+storeOfCountry2.size());
	
	//4. count numbers of stores each wh
	System.out.println("4. count numbers of stores each wh");
	whs.stream()
	.collect(Collectors.toMap(Warehouse::getCountryId,
			wh -> wh.getStoreIds(),
			(v1, v2)->{
				List<Integer> v = new ArrayList<>(v1);
				v.addAll(v2);
				return v1;
			},
			LinkedHashMap::new)
			).forEach((k,v) -> System.out.println(k + "," + v.size()));
	
	
}
}
