package working.stream;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import bean.WareHouse;
import model.DataModel;

public class Ex03Map_FlatMap {
	public static void main(String[] args) {
		List<WareHouse> whs = DataModel.getWhs();
		// 1.get name of warehouse in the list 
		whs.stream()//Stream<Warehouse>
		   .map(WareHouse::getName)//Stream<String>
		   .forEach(System.out::println);
		System.out.println("=============");
		// 2.count of number stores of 11
		whs.stream()
				.filter(d -> d.getId() == 11)
				.findFirst()
				.ifPresent(w-> System.out.println(w.getStoreIds().size()));
		System.out.println("=================");
		// 3.count of number store of country 2
		List<Integer> whi = whs.stream()
		.filter(d -> d.getCountryId() == 2)
		.map(d -> d.getStoreIds())
		.flatMap(list -> list.stream())
		.collect(Collectors.toList());
		System.out.println(whi.size());
		System.out.println("===============");
		// 4.count of number store each wh
		whs.stream()
		.collect(Collectors.toMap(
				WareHouse::getCountryId, 
				wh -> wh.getStoreIds().size(), 
				(v1 ,v2) -> v1+v2,
				LinkedHashMap::new))
		        .forEach((k ,v) ->System.out.println(k + "->" + v));
	}
}
