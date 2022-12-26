package woking.streams;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import bean.Warehouse;
import model.DataModel;

public class Ex03Map_FlatMap {

	public static void main(String[] args) {
		List<Warehouse> whs = DataModel.getWhs();
		
		// 1. get name of warehouse in the list "Whs"
		System.out.println("1. get name of warehouse in the list \"Whs\"");
		whs.stream().map(Warehouse::getName).forEach(o -> System.out.println(o));
		
		// 2. count number of stores of wh 1
		System.out.println("2. count number of stores of wh 1");
		whs.stream().filter(o->o.getId() == 11).map(o->o.getStoreIds().size()).forEach(System.out::println);
		
		// 3. count number of stores of country 2
		System.out.println("3. count number of stores of country 2");
		System.out.println(whs.stream().filter(o->o.getCountryId() == 2).map(o->o.getStoreIds()).flatMap(Collection::stream).collect(Collectors.toList()).size());
		
		
		// 4. count number of stores of each country
		System.out.println("4. count number of stores of each country");
		whs.stream()
			.collect(Collectors.groupingBy(Warehouse::getCountryId))
			.forEach((k,v) ->System.out.println(k + " --> " + v.stream().map(o->o.getStoreIds()).flatMap(Collection::stream).collect(Collectors.toList()).size()));;
			
	}

}
