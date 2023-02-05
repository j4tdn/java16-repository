package working.streams;

import model.DataModel;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import bean.Warehouse;

public class Ex03Map_FlatMap {
	public static void main(String[] args) {
		List<Warehouse> whs=DataModel.getWhs();
		
		//1. tìm tên của warehouse
		whs.stream()//Stream<Warehouse>
		.map(Warehouse::getName)// Stream<String>//chuyển từ kiểu Warehouse sang kiểu string của getName
		.forEach(n->System.out.println(n));

		//2. đếm số lượng warehouse 11
		whs.stream().filter(wh->wh.getId()==11)
		.findFirst()
		.ifPresent(wh//nếu nó tồn tại thì lấy warehouse in ra; nếu không tồn tại thì thôi
				->System.out.println("Amount of store--> " +wh.getStoreIds().size()));
		
		
		Optional<Warehouse> optwh = whs.stream().findFirst()//lấy phần tử đầu tiên trong Stream trả về 1 optional của warehouse
		//wh11, null--> dể lỗi nullpointer
		;
		//OPtional<T>{
		// T value;
		//}
		if(optwh.isPresent()){//optwh đang chứa value khác mull
			Warehouse wh = optwh.get();
			System.out.println("Amount of store--> " +wh.getStoreIds().size());
		}
		//3. count number of stores of country 2
		List<Integer> storeOfCountry2 = whs.stream()
		   .filter(wh -> wh.getCountryId() == 2)
		   .map(wh->wh.getStoreIds())
		   .flatMap(list->list.stream())//gộp tất cả các phần tử vào 1 list//Stream<Interge> 11->20
		   .collect(Collectors.toList());//.count;
		System.out.println("Amount --> " + storeOfCountry2.size());
		
		//4. count number of stores of each country
		whs.stream().collect(Collectors.toMap(Warehouse::getCountryId, wh->wh.getStoreIds().size(),
				(v1,v2)->v1 + v2,LinkedHashMap::new)).forEach((k,v)->System.out.println(k +" , " +v));
		
		whs.stream().collect(Collectors.toMap(Warehouse::getCountryId,
				wh->wh.getStoreIds(),(v1,v2)->{//(v1,v2)->v1+v2,LinkedHashMap::new
			List<Integer> v= new ArrayList<>(v1);
			v.addAll(v2);//lấy danh sách
			return v;
		})).forEach((k,v)->System.out.println(k + ", " + v));//key+value
				   
		   
		
	}

}
